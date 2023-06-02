package server;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import ProductoExample.*;
import pcd.util.Ventana;

public class ServerUDP {

	public static void main(String[] args) {
		Ventana v = new Ventana("Server UDP", 400, 200);
		v.addText("Productos con descuento");
		try (DatagramSocket socket = new DatagramSocket(10000)) {
			
			byte[] receiveBuffer = new byte[1024];

			while (true) {
				DatagramPacket receivePacket = new DatagramPacket(receiveBuffer, receiveBuffer.length);
				socket.receive(receivePacket);

				// creo el paquete de bytes que recibira los paquetes del clientw:
				byte[] data = receivePacket.getData();
				ByteArrayInputStream byteStream = new ByteArrayInputStream(data);
				ObjectInputStream objectInputStream = new ObjectInputStream(byteStream);
				Producto producto = (Producto) objectInputStream.readObject();

				String response = ""; 

				if (producto.getId().equals("1")) {
					v.addText(producto.getId());
					response = "10";
				}
				
				else if (producto.getId().equals("2")) {
					v.addText(producto.getId());
					response = "20";
				} 
				
				else if (producto.getId().equals("3")) {
					v.addText(producto.getId());
					response = "30";
				} 
				
				// si no tiene descuento mando 0 (caso default)
				else {
					response = "0";
				}

				ByteArrayOutputStream byteOutputStream = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteOutputStream);
				objectOutputStream.writeObject(response); // enviamos la respuesta con el precio del descuento aqui
				objectOutputStream.flush(); // otra vez, me aseguro con flush

				byte[] responseData = byteOutputStream.toByteArray();
				DatagramPacket sendPacket = new DatagramPacket(responseData, responseData.length,
						receivePacket.getAddress(), receivePacket.getPort());
				socket.send(sendPacket);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
