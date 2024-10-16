public class Bicycle extends Light
{
    boolean hasACrepe;

    public Bicycle(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, boolean hasEngine, boolean hasACrepe)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, hasEngine);
        this.hasACrepe = hasACrepe;
    }
    //----------------------------------------------
    public boolean getHasACrepe()
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
