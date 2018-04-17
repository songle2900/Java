//RMI Client
import java.io.IOException;
import java.rmi.Naming;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CarClient {

	public static void main(String[] args) throws IOException {
		CarInterface obj = null;

		try {
			obj = (CarInterface) Naming.lookup("rmi://localhost:1099/CarServer");
			System.out.println("Before Update");
			String original=obj.display();
			System.out.println(original);
			String result=obj.setNumberPlate();		
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Car Client Exception: " + e.getMessage());
		}
	}
}