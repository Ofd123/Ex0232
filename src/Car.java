public class Car extends Regular
{
    int accelerationSpeed;

    public Car(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int amountOfPassengers, int accelerationSpeed)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, amountOfPassengers);
        this.accelerationSpeed = accelerationSpeed;
    }
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
