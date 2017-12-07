import java.util.ArrayList;

public class Wallet
{
    private ArrayList< Coin > _wallet;


    /*
     * Constructs an empty wallet
     */
    public Wallet()
    {
        _wallet = new ArrayList< Coin >();
    }

    /*
     * Adds a coin to the wallet.
     * @param aCoin coin to add to Wallet
     */
    public void add( Coin coin )
    {
        _wallet.add( coin );
    }

    /*
     * Removes a coin from the wallet
     * @return coin removed
     */

    public Coin removeCoin(String name)
    {
        Coin coin = null;
        if( _wallet.isEmpty() )
            return null;
        else
        {
            for (int i = 0; i < _wallet.size(); i++) {
                if (_wallet.get(i).getName() == name) {
                    coin = _wallet.get(i);
                    _wallet.remove(i);
                }
            }

            return coin;

        }

    }

    /*
     * Returns the total value of the coins in the wallet.
     * @return total value in Wallet
     */
    public double getTotal()
    {
        double total = 0;
        for( Coin aCoin : _wallet )
        {
            total += aCoin.getValue();
        }
        return total;
    }
    /*
     * Converts coins in wallet to a string
     * @return string containing coins in wallet
     */
    public String toString()
    {
        String string = "Wallet[";
        for (int i = 0; i <= _wallet.size(); i++) {
            string = string + _wallet.get(i) + ",";
        }
        string = string + "]";
        return string;
    }

    /*
     * Returns the number of coins in the wallet
     * @return number of coins in Wallet
     */
    public int coinCount()
    {
        return _wallet.size();
    }
}
