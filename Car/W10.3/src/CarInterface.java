// RMI interface
import java.rmi.Remote; 
import java.rmi.RemoteException; 

public interface CarInterface extends Remote { 
	String setNumberPlate() throws RemoteException;
	String display() throws  RemoteException;
}
