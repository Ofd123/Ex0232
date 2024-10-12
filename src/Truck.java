public class Truck extends Heavy
{
    int maxLoadingWeight;

    public Truck(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails, int maxLoadingWeight)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, possibleAmountOfTrails);
        this.maxLoadingWeight = maxLoadingWeight;
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
    public int getMaxLoadingWeight()
    {
        return maxLoadingWeight;
    }
    public void setMaxLoadingWeight(int maxLoadingWeight)
    {
        this.maxLoadingWeight = maxLoadingWeight;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Truck{" +
                "maxLoadingWeight=" + maxLoadingWeight +
                '}';
    }
}
