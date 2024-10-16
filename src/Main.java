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
}
