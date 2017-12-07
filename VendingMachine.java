import java.util.ArrayList;

public class VendingMachine {
    private int _numberOfSprites;
    private int _numberOfOranges;
    private int _numberOfCokes;
    private int _numberOfDietCokes;
    private int _coinValueTotal = 0;

    public VendingMachine(int numberOfSprites, int numberOfOranges, int numberOfCokes, int numberOfDietCokes)
    {
      _numberOfSprites = numberOfSprites;
      _numberOfOranges = numberOfOranges;
      _numberOfCokes = numberOfCokes;
      _numberOfDietCokes = numberOfDietCokes ;
    }
public void refillSoda(int numberOfSprites, int numberOfOranges, int numberOfCokes, int numberOfDietCokes)
        {
        _numberOfSprites += numberOfSprites;
        _numberOfOranges += numberOfOranges;
        _numberOfCokes += numberOfCokes;
        _numberOfDietCokes += numberOfDietCokes ;
        }
    public void insertCoin(Coin coin)
    {
        _coinValueTotal += coin.getValue();
    }
    public ArrayList< Coin > getChange()
    {

        ArrayList< Coin > change = new ArrayList<Coin>();
       int quarters = _coinValueTotal / 25;
      int dimes = (_coinValueTotal % 25) / 10;
      int nickels = ((_coinValueTotal % 25) % 10) / 5;
       int pennies = (((_coinValueTotal % 25) % 10) % 5);

        for (int i = 0; i < quarters; i++)
        {
            change.add(new Coin(25, "Quarter"));
        }
        for (int i = 0; i < nickels; i++)
        {
                change.add(new Coin(5, "Nickel"));
        }
        for (int i = 0; i < dimes; i++)
        {
                change.add(new Coin(10, "Dime"));
        }
        for (int i = 0; i < pennies; i++)
        {
                change.add(new Coin(1, "Penny"));
        }


        _coinValueTotal = 0;
        return change;
    }


    public String getSoda(String nameOfSoda) {
       if (_coinValueTotal  >= 100)
           if (nameOfSoda == "Sprite" || nameOfSoda == "sprite" && _numberOfSprites > 0) {
               _numberOfSprites -= 1;
               _coinValueTotal -= 100;
               return "Purchase of Sprite Successful.";
           }
            else if (nameOfSoda == "Coke" || nameOfSoda == "coke" && _numberOfCokes > 0) {
            _numberOfCokes -= 1;
            _coinValueTotal -= 100;
            return "Purchase of Coke Successful.";
            }
           else if (nameOfSoda == "DietCoke" || nameOfSoda == " dietcoke" || nameOfSoda == "Diet Coke" || nameOfSoda == " diet coke" && _numberOfDietCokes > 0) {
               _numberOfDietCokes -= 1;
               _coinValueTotal -= 100;
               return "Purchase of Diet Coke Successful.";
           }
           else if (nameOfSoda == "Orange" || nameOfSoda == "orange" && _numberOfOranges > 0) {
               _numberOfSprites -= 1;
               _coinValueTotal -= 100;
               return "Purchase of Orange Soda Successful.";
           }
           else {
           return "Not a valid soda. Or no sodas of that name left";
           }
       else
       {
        return "Purchase failed. More funds needed.";
       }
    }
    }
