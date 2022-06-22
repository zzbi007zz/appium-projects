package Java.lab6;

public class lab6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        int checkURL = url.indexOf("https");
        if (checkURL!=0) {
            System.out.println("This url not contain https");
        } else
        {
            System.out.println("This url contain https");
        }

        String urlSub = url.substring(8);

        if (urlSub.equals("google.com")) {
            System.out.println("Google domain found");
        }




    }

}
