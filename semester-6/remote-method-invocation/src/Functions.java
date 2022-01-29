import java.rmi.*;

public interface Functions extends Remote{
    public int square(int x) throws RemoteException;
    public int mul(int x, int y) throws RemoteException;
}
