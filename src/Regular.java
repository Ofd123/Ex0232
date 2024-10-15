public class Regular extends Vehicles
{
    int amountOfPassengers;

    public Regular(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int amountOfPassengers)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.amountOfPassengers = amountOfPassengers;
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
    //---------------------------------------------
    @Override
    public double exhaust()
    {
        return super.exhaust() + 60;
    }
    //---------------------------------------------
    public void noise()
    {
        System.out.println("not loud(decent)");
    }
    //---------------------------------------------
    public int hitchhikers()
    {
        return(amountOfPassengers);
    }
}
