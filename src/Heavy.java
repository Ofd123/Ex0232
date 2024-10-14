public class Heavy extends Vehicles
{
    int possibleAmountOfTrails;

    public Heavy(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.possibleAmountOfTrails = possibleAmountOfTrails;
    }
    //----------------------------------------------
    public int getPossibleAmountOfTrails()
    {
        return possibleAmountOfTrails;
    }
    public void setPossibleAmountOfTrails(int possibleAmountOfTrails)
    {
        this.possibleAmountOfTrails = possibleAmountOfTrails;
    }
    //----------------------------------------------
    @java.lang.Override
    public java.lang.String toString()
    {
        return "Heavy{" +
                "possibleAmountOfTrails=" + possibleAmountOfTrails +
                '}';
    }
    //----------------------------------------------

    @Override
    public double exhaust()
    {
        return super.exhaust() + 500;
    }
}
