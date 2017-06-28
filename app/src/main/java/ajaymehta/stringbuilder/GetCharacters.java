package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/28/2017.
 */


// you can get characters at particular location...
public class GetCharacters {

    public static void main(String args[]) {

        StringBuilder builder = new StringBuilder("Forest");

        for(int i=0; i<builder.length(); i++) {
            System.out.print(builder.charAt(i));
            System.out.print("-");

        }

    }
}
