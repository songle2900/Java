package W2;

import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Task2 {
	static int option;
	
	public static void main(String args[]) {
		System.out.println("----- Task 2 -----");
		do {
			System.out.println("Select Option");
			System.out.println("1. Enter the Account Information");
			System.out.println("2. Display Account Details");
			System.out.println("0. Exit");
			System.out.println("Enter the Number: ");
			Scanner r = new Scanner(System.in);
			option = r.nextInt();
			if(option == 1) {
				inputInfo();
			} else if(option == 2) {
				outputInfo();
			}
		} while (option != 0);
	}
	
	public static void inputInfo(){
        JFrame frame = new JFrame();
        frame.setMinimumSize(new Dimension(400,450));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(100,100));
        frame.setVisible(true);

        JPanel inputP=new JPanel();

        JLabel title=new JLabel("Enter Accout Details");
        JLabel accNoLabel = new JLabel("Account Number");
        JTextField accNoField=new JTextField(10);


        inputP.setLayout(new BoxLayout(inputP, BoxLayout.PAGE_AXIS));
        JLabel lNameLabel = new JLabel("Last Name");
        JLabel fnameLabel=new JLabel("First Name");
        JLabel balLabel=new JLabel("Balance");
        JTextField lNameField=new JTextField(1);

        JTextField fNameField=new JTextField(1);
        JTextField balField=new JTextField(1);

        JButton save=new JButton("Save");

        lNameField.setMaximumSize(new Dimension(200,25));
        fNameField.setMaximumSize(new Dimension(200,25));
        accNoField.setMaximumSize(new Dimension(200,25));
        balField.setMaximumSize(new Dimension(200,25));


        inputP.add(title);

        inputP.add(accNoLabel);
        inputP.add(accNoField);

        inputP.add(lNameLabel);
        inputP.add(lNameField);

        inputP.add(fnameLabel);
        inputP.add(fNameField);

        inputP.add(balLabel);
        inputP.add(balField);
        inputP.add(save);

        
        frame.getContentPane().add(inputP);

        save.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String accNumber=accNoField.getText();
                String lastName=lNameField.getText();
                String firstName=fNameField.getText();
                String balance=balField.getText();
                String info="Account Number: "+accNumber+",First Name: "+firstName+",Last name : "+lastName+",Balance: "+balance;
                try {
                    PrintWriter writer = new PrintWriter("info.txt", "UTF-8");
                    writer.println(info);
                    writer.close();
                }catch (FileNotFoundException ex){
                    System.out.println(ex);
                }catch (UnsupportedEncodingException ed){
                    System.out.println(ed);
                }
            }
        });
    }
	
	 public static void outputInfo(){

	        JFrame outFrame = new JFrame();
	        outFrame.setMinimumSize(new Dimension(400,450));
	        outFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        outFrame.setPreferredSize(new Dimension(100,100));
	        outFrame.setVisible(true);

	        JPanel outputP=new JPanel();
	        JLabel header=new JLabel("Account Details");
	        outputP.setLayout(new BoxLayout(outputP, BoxLayout.PAGE_AXIS));
	        JTextArea display=new JTextArea();
	        JButton show=new JButton("Show Account Info");

	        show.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                try {
	                    FileReader fr = new FileReader("info.txt");
	                    BufferedReader reader = new BufferedReader(fr);
	                    String line;
	                    while ((line = reader.readLine()) != null) {
	                        String s[]=line.split(",");
	                        for(int i=0;i<s.length;i++)
	                            display.append(s[i] + "\n");

	                    }
	                }catch (IOException i){
	                    System.out.println(i);
	                }
	            }
	        });
	        outputP.add(header);
	        outputP.add(show);
	        outputP.add(display);
	        outputP.setMaximumSize(new Dimension(100,100));
	        outFrame.getContentPane().add(outputP);

	    }
}
