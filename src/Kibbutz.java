public class Kibbutz
{
    Vehicles[] vehicles;
    int counter;

    public Kibbutz()
    {
        this.vehicles = new Vehicles[500];
        this.counter = 0;
    }

    public void addACar(Vehicles car)
    {
        this.counter += 1;
        this.vehicles[this.counter] = car;
    }

    public Vehicles[] specificCars()
    {
        Vehicles[] specificCars = new Vehicles[this.counter];
        for(int i = 0; i < this.counter; i++)
        {
            if((this.vehicles[i].getAge() > 15) &&  (this.vehicles[i].getSteeringShape().compareTo("wheel") == 0))
            {
                specificCars[i] = this.vehicles[i];
            }
        }
        return specificCars;
    }

    public int carsWhichUseWheel()
    {
        int count = 0;
        for(int i = 0; i < this.counter; i++)
        {
            if(this.vehicles[i].getSteeringShape().compareTo("wheel") == 0)
            {
                count += 1;
            }
        }
        return count;
    }
}
