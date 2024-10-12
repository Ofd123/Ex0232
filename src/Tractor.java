public class Tractor extends Heavy
{
    String typeOfDragged;

    public Tractor(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin, int possibleAmountOfTrails, String typeOfDragged)
    {
        super(serielNum, age, numberOfWheels, steeringShape, polutionPerMin, possibleAmountOfTrails);
        this.typeOfDragged = typeOfDragged;
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

    public int getPossibleAmountOfTrails()
    {
        return super.getPossibleAmountOfTrails();
    }
    //----------------------------------------------
    public String getTypeOfDragged()
    {
        return typeOfDragged;
    }
    public void setTypeOfDragged(String typeOfDragged)
    {
        this.typeOfDragged = typeOfDragged;
    }
    //----------------------------------------------
    @Override
    public String toString()
    {
        return "Tractor{" +
                "typeOfDragged='" + typeOfDragged + '\'' +
                '}';
    }
}
