package CerclePK;
import javax.xml.ws.Endpoint;

public class test {

	public static void main(String[] args) {
		
		Endpoint.publish("http://127.0.0.1:8080/",new ServiceCercle());
	}

}
