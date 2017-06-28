package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

public class CombineStrings {

    public static void main(String args[]) {

        StringBuilder stringBuilder = new StringBuilder("cat ");
        StringBuilder stringBuilder2 = new StringBuilder("dog");

          // we can add string also we can add another string builder..

        System.out.println(stringBuilder.append(stringBuilder2));
    }
}
