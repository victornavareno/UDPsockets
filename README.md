# UDPsockets
Distributed Programming - Implementing UDP sockets in Java. 

This project was created for a final test of distributed GRPC and UDP socket protocol connections.
 - It consist of a client that sends a list of Objects (Products) on the port number 10000
 - A UDP server continuously listens through this port, and when a product arrives, it compares its ID with a list of discounts and sends the total discount amount back the socket on that port.
