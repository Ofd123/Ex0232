public class DumpTruck extends Truck
{
    boolean empty;
    public DumpTruck(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails, int maxLoadingWeight)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, possibleAmountOfTrails, maxLoadingWeight);
    }
    //--------------------------------------
    public boolean isEmpty()
    {
        return empty;
    }
    //--------------------------------------
    public void setEmpty(boolean empty)
    {
        this.empty = empty;
    }
    //--------------------------------------
    @Override
    public String toString()
    {
        return "DumpTruck{" +
                "empty=" + empty +
                '}';
    }
}
