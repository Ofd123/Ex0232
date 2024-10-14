public class Cart extends Light
{
    int chargingTime;

    public Cart(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, boolean hasEngine, int chargingTime)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, hasEngine);
        this.chargingTime = chargingTime;
    }
    //----------------------------------------------
    public int getChargingTime()
    {
        return chargingTime;
    }
    public void setChargingTime(int chargingTime)
    {
        this.chargingTime = chargingTime;
    }
    //---------------------------------------------
    @Override
    public String toString()
    {
        return "Cart{" +
                "chargingTime=" + chargingTime +
                '}';
    }
}
