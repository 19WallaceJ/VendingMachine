public class Coin
{
    private double _value;
    private String _name;

    /*
     * Constructs a coin
     * @param aValue the monetary value of the coin
     * @param aName the name of the coin
     */
    public Coin( double value, String name )
    {
        _value = value;
        _name = name;
    }

    /*
     * Returns the coin value.
     * @return coin value
     */
    public double getValue()
    {
        return _value;
    }

    /*
     * Returns the coin name
     * @return coin name
     */
    public String getName()
    {
        return _name;
    }
}
