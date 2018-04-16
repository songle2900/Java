package transaction;

public class Main {
    public static void main(String[] args)  {
        double amount[]={1.0,2.0,3.0};
        String currency[]={"USD","EUR","GBP"};

        Account account = new Account(0, "");

        Thread in = new Thread(new Deposit(account,amount,currency));
        Thread out = new Thread(new Withdraw(account));

        in.start();
        out.start();

        try {
            in.join();
            out.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}