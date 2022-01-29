import java.rmi.*;
import java.rmi.server.*;

public class FunctionsRemote extends UnicastRemoteObject implements Functions{
    FunctionsRemote() throws RemoteException {
        super();
    }

    public int square(int x) {
        return x*x;
    }

    public int mul(int x, int y) {
	return x*y;
    }
}
