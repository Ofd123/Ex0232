public class Light extends Vehicles
{
    boolean hasEngine;
    public Light(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, boolean hasEngine )
    {
        super( serielNum, age, numberOfWheels, steeringShape, polutionPerMin);
        this.hasEngine = hasEngine;
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
