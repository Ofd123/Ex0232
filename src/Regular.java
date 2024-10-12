public class Regular extends Vehicles
{
    int amountOfPassengers;

    public Regular(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int amountOfPassengers)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.amountOfPassengers = amountOfPassengers;
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
    public int getAmountOfPassengers()
    {
        return amountOfPassengers;
    }
    public void setAmountOfPassengers(int amountOfPassengers)
    {
        this.amountOfPassengers = amountOfPassengers;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Regular{" +
                "amountOfPassengers=" + amountOfPassengers +
                '}';
    }
}
