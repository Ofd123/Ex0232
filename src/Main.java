public class Main
{
//    public static void main(String[]args)
//    {
//
//    }
    public static double totalExhaust(Vehicles[] arr)
    {
        double sum = 0;
        for(int i = 0; i<arr.length; i++)
        {
            sum += arr[i].exhaust();
        }
        return sum;
    }
}
