package shapes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String [] args){
        int count = 0;
        
        // Setting Shape array
        Shape[] shapes = new Shape[50];

        try (BufferedReader br = new BufferedReader(new FileReader("./shapes.txt"))) {
            String s;

            System.out.println("------->JAC 444 Assignment 1<-------");
            System.out.println("------->Task 1 ... <-------");

            while ((s = br.readLine()) != null) {

            	// Seprate by comma
            	String[] tokens = s.split(",");
                try{
                    switch (tokens[0]){
                    	
                    	// Check if the object is Circle
                        case "Circle":
                            
                        	// If size of token length is equals 2 then,
                        	if(tokens.length == 2){
                                shapes[count] = new Circle(Double.parseDouble(tokens[1]));
                                count++;
                            }
                            break;
                        case "Square":
                            if(tokens.length == 2){
                                shapes[count] = new Square(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[1]));
                                count++;
                            }
                            break;
                        case "Rectangle":
                            if(tokens.length == 3){
                                shapes[count] = new Rectangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                                count++;
                            }
                            break;
                        case "Parallelogram":
                            if(tokens.length == 3){
                                shapes[count] = new Parallelogram(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]));
                                count++;
                            }
                            break;
                        case "Triangle":
                            if(tokens.length == 4){
                                shapes[count] = new Triangle(Double.parseDouble(tokens[1]),Double.parseDouble(tokens[2]), Double.parseDouble(tokens[3]));
                                count++;
                            }
                            break;
                        default:
                            break;
                    }
                } catch(Exception me){
                    System.out.println(me.getMessage());
                }
            }

            System.out.println();

            System.out.println(count + " shapes were created:");
            for(int i = 0; i < count; i++){
                System.out.println(shapes[i]);
                System.out.println();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
