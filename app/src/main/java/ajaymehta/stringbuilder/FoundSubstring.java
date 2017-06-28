package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

// you can use it if you want to find a string..pass the string to a stringBuilder n then using indexOf method..find it ..simple..
public class FoundSubstring {

    public static void main(String[] args){

        StringBuilder stringBuilder = new StringBuilder("Hello");

        int result = stringBuilder.indexOf("el");    // if found return 1
        int result2 = stringBuilder.indexOf("jk");  // if string not found ...return -1

        System.out.println(result);
        System.out.println(result2);

    }
}
