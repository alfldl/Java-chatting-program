import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class TCPClient {
	
	private static final String SERVER_IP = "192.168.0.22";
	private static final int SERVER_PORT = 5000;
	
	public static void main(String[] args) throws IOException {
		Socket socket = new Socket();
		
		try {
			socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(!socket.isClosed()) {
				socket.close();
			}
		}
		
	}
	

}
