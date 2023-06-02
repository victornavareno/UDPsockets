package ProductoExample;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import pcd.util.Ventana;

public class ClientProductoAlumnos {

	public static void main(String[] args) {
		Ventana v =  new Ventana("CLIENTE PRODUCTO", 200, 200);

		List<Producto> productos = Arrays.asList(
				new Producto("Ensalada", "0"),
				new Producto("Agua", "1"),
				new Producto("Hamburguesa", "2"),
				new Producto("Nuggets", "3"),   
				new Producto("Patatas", "4")
		);

		// LAS MODIFICACIONES DEL EXAMEN LAS HAGO AQUI
		try {
			DatagramSocket socket = new DatagramSocket(); // como es cliente no defino direccion  de puerto - en el server sera puerto 10000
			InetAddress serverAddress = InetAddress.getLocalHost();

			for (Producto producto : productos) {
				ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream); // para enviar los productos al server udp
				objectOutputStream.writeObject(producto); // Escribo  producto en el flujo d slaida
				objectOutputStream.flush(); // aseguro con flush

				byte[] requestData = byteOutputStream.toByteArray();
				DatagramPacket sendPacket = new DatagramPacket(requestData, requestData.length, serverAddress, 10000); // creamos el paqueete
				socket.send(sendPacket);

				byte[] receiveBuffer = new byte[1024]; // recibe la respuesta (precio del descuento, la calculo luego en el server udp)
				DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
				socket.receive(receivePacket);

				byte[] responseData = receivePacket.getData();
				ByteArrayInputStream byteStream = new ByteArrayInputStream(responseData);
				ObjectInputStream objectInputStream = new ObjectInputStream(byteStream);
				String estado = (String) objectInputStream.readObject();

				v.addText("Producto: " + producto.getNombre() + " Descuento: " + estado); // imprimo TODO confirmar salida y hacer captura
			}

		
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (SocketException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
