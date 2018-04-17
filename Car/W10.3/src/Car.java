// RMI Service Implementation
import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Car extends UnicastRemoteObject implements CarInterface,Serializable {
	
    private String brand;
    private String model;
    private int modelMake = 0;
    private String plateNumber;
    static int p=99;
	static int c=0;
	
	public Car() throws RemoteException {
		super();
        this.model = "GTS";
        this.brand = "Porsche";
        this.modelMake = 2018;
	}

	// Using toString method overload
    @Override
    public String toString(){
        return "Car Brand: " + this.brand + ", " + this.model + "\nModel: " + this.modelMake + "\nPlate Number: " + plateNumber;
    }
    
    public String display() throws  RemoteException {
        return "Car Brand: " + this.brand + "\n" + this.model + "\nModel: " + this.modelMake + "\nPlate Number: " + plateNumber;
    }
    
    // Using hashCode method overload
    @Override
    public int hashCode() {
        int number=0;
        if(c < 20) {
        	number = p * (this.model.hashCode() + this.brand.hashCode());
        	number += this.modelMake;
        	
        	p = p + p / 2;
        	c++;
        }
        return number;
    }
    
	public String setNumberPlate() throws RemoteException {

        String plate="";
        char ch=(char)(65+c);
		this.plateNumber =" "+ch+" "+hashCode();
		return this.toString();
	}
}