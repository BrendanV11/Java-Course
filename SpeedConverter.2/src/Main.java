public class Main
{
    public static void main(String[] args) {
        long mile=SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles= "+mile);

        SpeedConverter.printConversion(10.5);
    }
}
