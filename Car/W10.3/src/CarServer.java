// RMI Server
import java.rmi.Naming;

public class CarServer {
	public static void main(String args[]) {
		
		// Creating the object implementation to connect with interface
		try {
			CarInterface obj = new Car();

			// Binding the current object instances to server
			Naming.rebind("rmi://localhost:1099/CarServer", obj);

			System.out.println("CarServer bound in registry");

		} catch (Exception e) {
			System.out.println("Car Server Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
}