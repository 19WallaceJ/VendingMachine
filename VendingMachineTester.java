import java.util.ArrayList;

public class VendingMachineTester
{
    public static void main(String[] args)
    {
        Wallet wallet = new Wallet();
        for (int i = 0; i < 100; i++) { 
            wallet.add(new Coin(25, "Quarter"));
            wallet.add(new Coin(10, "Dime"));
            wallet.add(new Coin(5, "Nickel"));
            wallet.add(new Coin(1, "Penny"));
        }
        
        VendingMachine machine = new VendingMachine(0 , 5 , 5, 5);
        wallet.removeCoin("Quarter");
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.getSoda("Orange");

        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));

        machine.getSoda("Orange");

        wallet.removeCoin("Quarter");
        machine.insertCoin(new Coin(25, "Quarter"));
        

        ArrayList< Coin > change = machine.getChange();
        /*
        String string = "Change[";
        for (int i = 0; i < change.size(); i++) {
            string = string + change.get(i) + ",";
        }
        string = string + "]";
        System.out.print(string);
        */

        System.out.println("Coin Values:");
        for (int i = 0; i < change.size(); i++) {
            System.out.println(change.get(i).getValue());
        }
        machine.getChange();

        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        wallet.removeCoin("Quarter");
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));
        machine.insertCoin(new Coin(25, "Quarter"));
        System.out.println(machine.getSoda("Sprite"));
        machine.getSoda("Sprite");
        System.out.println(machine.getSoda("Sprite"));
        machine.getSoda("Sprite");


    }
}
