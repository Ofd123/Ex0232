public class Light extends Vehicles
{
    boolean hasEngine;
    public Light(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, boolean hasEngine )
    {
        super( serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.hasEngine = hasEngine;
    }
    //----------------------------------------------
    public boolean getHasEngine()
    {
        return hasEngine;
    }
    public void setHasEngine(boolean hasEngine)
    {
        this.hasEngine = hasEngine;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Light{" +
                "hasEngine=" + hasEngine +
                '}';
    }
}
