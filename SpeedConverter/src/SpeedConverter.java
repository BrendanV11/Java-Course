public class SpeedConverter
{
    public static long toMilesPerHour(double kmPerHour)
    {
        long milePerHour=Math.round(kmPerHour/1.609);
        double result=(kmPerHour<0)?-1:milePerHour;
        return (long) result;
    }

    public static void printConversion(double kmPerHour)
    {
        long milesPerHour=toMilesPerHour(kmPerHour);
        String result=(kmPerHour<0)?"Invalid value":String.valueOf(kmPerHour);
        System.out.println(kmPerHour+"km/h= "+milesPerHour+"mi/h=");
    }
}
