package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/28/2017.
 */

public class SetStringLength {

    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder("Forest");

        builder.setLength(3);   // it sets the lenght of our string..it will only hold three character 0,1,2 ..doesnt give a hoot about how long the string is..

        System.out.println(builder);

    }
}
