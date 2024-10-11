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
        return age;
    }
    //----------------------------------------------
    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }
    //----------------------------------------------
    public String getSteeringShape()
    {
        return steeringShape;
    }
    //----------------------------------------------
    public double getPolutionPerMin()
    {
        return polutionPerMin;
    }
    //----------------------------------------------
    public int getSerielNum()
    {
        return serielNum;
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
}
