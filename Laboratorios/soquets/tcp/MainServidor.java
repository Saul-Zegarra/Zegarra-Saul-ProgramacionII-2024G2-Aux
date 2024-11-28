
package tcp;

public class MainServidor {
    public static void main(String[] args) {
        SocketTcp server = new SocketTcp(null, 3000);
        server.start();
    }
}
