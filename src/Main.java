public class Main
{
    public static double totalExhaust(Vehicles[] arr)
    {
        double sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i].exhaust();
        }
        return sum;
    }

    public static void noises(Vehicles[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] instanceof Regular)
            {
                ((Regular) arr[i]).noise();
            }
        }
    }

    public static int amountOfPassengers(Vehicles[] arr)
    {
        int sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            if (arr[i] instanceof Bicycle)
            {
                if(((Bicycle) arr[i]).getHasACrepe())
                {
                    sum += 1;
                }
            }

            if (arr[i] instanceof Truck)
            {
                sum += 1;
            }

            if (arr[i] instanceof Regular)
            {
                sum += ((Regular) arr[i]).hitchhikers();
            }

            if (arr[i] instanceof Cart)
            {
                sum += ((Regular) arr[i]).hitchhikers();
            }

            if (arr[i] instanceof Car)
            {
                sum += ((Regular) arr[i]).getAmountOfPassengers() - 1;
            }
        }
        return sum;
    }
}
