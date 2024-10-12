public class Heavy extends Vehicles
{
    int possibleAmountOfTrails;

    public Heavy(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.possibleAmountOfTrails = possibleAmountOfTrails;
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
}
