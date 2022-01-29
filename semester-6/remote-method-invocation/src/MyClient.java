import java.rmi.*;

public class MyClient {
    public static void main(String args[]) {
        try{
            Functions stub = (Functions)Naming.lookup("rmi://192.168.10.8:8000/ammar");
            System.out.println("Square of 2 processed remotely is: " + stub.square(2));
            System.out.println("Square of 8 processed remotely is: " + stub.square(8));
	    System.out.println("Multiplication of 10 X 5 processed remotely is: " + stub.mul(10, 5));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
