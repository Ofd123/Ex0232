public class Train extends Heavy
{
    int amountOfRailwayCars;
    public Train(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails, int amountOfRailwayCars)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, possibleAmountOfTrails);
        this.amountOfRailwayCars = amountOfRailwayCars;
    }
    //----------------------------------------------
    public int getAmountOfRailwayCars()
    {
        return amountOfRailwayCars;
    }
    public void setAmountOfRailwayCars(int amountOfRailwayCars)
    {
        this.amountOfRailwayCars = amountOfRailwayCars;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Train{" +
                "amountOfRailwayCars=" + amountOfRailwayCars +
                '}';
    }
}
