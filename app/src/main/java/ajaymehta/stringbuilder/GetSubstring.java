package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

public class GetSubstring {

    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder();

        builder.append("Forest");

        System.out.println(builder.substring(2));  // leave first two characters 0,1 and give rest of the subString.

        System.out.println(builder.substring(0,2));   // it will go upto 2..n give substring at 0,1 location..

    }
}
