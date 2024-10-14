public class Vehicles
{
    int serielNum;
    int age;
    int numberOfWheels;
    String steeringShape;
    double polutionPerMin;

    public Vehicles(int serielNum, int age, int numberOfWheels, String steeringShape, double polutionPerMin)
    {
        this.serielNum = serielNum;
        this.age = age;
        this.numberOfWheels = numberOfWheels;
        this.steeringShape = steeringShape;
        this.polutionPerMin = polutionPerMin;
    }

    public int getAge()
    {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
//----------------------------------------------
    public int getNumberOfWheels()
    {
        return numberOfWheels;
    }
    public void setNumberOfWheels(int numberOfWheels)
    {
        this.numberOfWheels = numberOfWheels;
    }
//----------------------------------------------
    public String getSteeringShape()
    {
        return steeringShape;
    }
    public void setSteeringShape(String steeringShape)
    {
        this.steeringShape = steeringShape;
    }
//----------------------------------------------
    public double getPolutionPerMin()
    {
        return polutionPerMin;
    }
    public void setPolutionPerMin(double polutionPerMin)
    {
        this.polutionPerMin = polutionPerMin;
    }
//----------------------------------------------
    public int getSerielNum()
    {
        return serielNum;
    }
    public void setSerielNum(int serielNum)
    {
        this.serielNum = serielNum;
    }
//-----------------------------------------------

    @java.lang.Override
    public java.lang.String toString()
    {
        return "Vehicles{" +
                "serielNum=" + serielNum +
                ", age=" + age +
                ", numberOfWheels=" + numberOfWheels +
                ", steeringShape='" + steeringShape + '\'' +
                ", polutionPerMin=" + polutionPerMin +
                '}';
    }
    public double exhaust()
    {
        return this.polutionPerMin * 60 * 24;
    }
}