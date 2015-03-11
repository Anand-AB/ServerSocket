import java.io.OutputStream;
import java.net.Socket;


public class client {

	public static void main(String[] args) {
		try{

			
			String msg="Iam waiting for message";
			Socket s=new Socket("localhost",8888);
			OutputStream os=s.getOutputStream();
			os.write(msg.getBytes());			
			os.flush();
			os.close();
			s.close();



		}catch(Exception e){

		}

	}
}
