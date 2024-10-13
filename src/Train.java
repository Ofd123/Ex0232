public class Train extends Heavy
{
    int amountOfRailwayCars;
    public Train(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails, int amountOfRailwayCars)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, possibleAmountOfTrails);
        this.amountOfRailwayCars = amountOfRailwayCars;
    }
    //----------------------------------------------
    public int getAge()
    {
        return super.getAge();
    }
    //----------------------------------------------
    public int getNumberOfWheels()
    {
        return super.getNumberOfWheels();
    }
    //----------------------------------------------
    public String getSteeringShape()
    {
        return super.getSteeringShape();
    }
    //----------------------------------------------
    public double getPolutionPerMin()
    {
        return super.getPolutionPerMin();
    }
    //----------------------------------------------
    public int getSerielNum()
    {
        return super.getSerielNum();
    }
    //----------------------------------------------
    public int getPossibleAmountOfTrails()
    {
        return super.getPossibleAmountOfTrails();
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
