public class task1 {
    public static void main(String[] args) {
        System.out.println("68in = " + convertToCentimeters(68) + " cm");
        System.out.println("5ft, 8in = " + convertToCentimeters(5,8) + " cm");
        System.out.println("3600 s = " + getDurationString(3600));
    }




public static double convertToCentimeters(int heightInInches){
   return heightInInches * 2.54;
}
public static double convertToCentimeters(int feet, int inches){
return convertToCentimeters((feet * 12) + inches);
}
public static String getDurationString(int seconds){
        return String.valueOf(seconds%3600 + "h" + seconds%60 + "min" + seconds + "s");

}
public static String getDurationString(int minutes, int seconds){
        return String.valueOf(getDurationString(minutes%60) + seconds);

}

}
