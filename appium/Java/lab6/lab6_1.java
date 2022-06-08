package Java.lab6;

public class lab6_1 {
    public static void main(String[] args) {
       String str = "2hrs and 5 minutes";
       int strLength = str.length();
       int minute = 60;
       String strSub1 = str.substring(0,1);
       String strSub2 = str.substring(9,10);
       System.out.println("Length of string: "+strLength);
       System.out.println("Hour: "+ strSub1);
       System.out.println("Minutes: "+ strSub2);
       int myTime = Integer.valueOf(strSub1);
       int myMin = Integer.valueOf(strSub2);

       System.out.println("Total time in minutes: "+(myTime*minute+myMin));


    }
}

