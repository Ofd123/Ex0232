public class Bicycle extends Light
{
    boolean hasACrepe;

    public Bicycle(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, boolean hasEngine, boolean hasACrepe)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, hasEngine);
        this.hasACrepe = hasACrepe;
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
        return super.getHasEngine();
    }
    //----------------------------------------------
    public boolean isHasACrepe()
    {
        return hasACrepe;
    }
    public void setHasACrepe(boolean hasACrepe)
    {
        this.hasACrepe = hasACrepe;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Bicycle{" +
                "hasACrepe=" + hasACrepe +
                '}';
    }
}
