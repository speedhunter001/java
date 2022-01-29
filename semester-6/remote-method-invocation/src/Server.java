import java.rmi.*;
import java.rmi.registry.*;
import java.security.AllPermission;

public class Server {
    
    public static void main(String[] args) {
        try {
            Functions stub = new FunctionsRemote();
            Naming.rebind("rmi://192.168.10.8:8000/ammar", stub);
            System.out.println("Server started at port 8000");
        }
	catch(Exception e) {
	    System.out.println(e);
        }
    }

}
