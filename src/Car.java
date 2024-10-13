public class Car extends Regular
{
    int accelerationSpeed;

    public Car(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int amountOfPassengers, int accelerationSpeed)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, amountOfPassengers);
        this.accelerationSpeed = accelerationSpeed;
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
        return super.getAmountOfPassengers();
    }
    //----------------------------------------------
    public int getAccelerationSpeed()
    {
        return accelerationSpeed;
    }
    public void setAccelerationSpeed(int accelerationSpeed)
    {
        this.accelerationSpeed = accelerationSpeed;
    }
    //---------------------------------------------
    @Override
    public String toString()
    {
        return "Car{" +
                "accelerationSpeed=" + accelerationSpeed +
                '}';
    }
}
