package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

public class ReplaceString {


    public static void main(String args[]) {

        StringBuilder stringBuilder = new StringBuilder("abc");

        stringBuilder.replace(2,3,"xyz");  //first parament..means 2 here ..means leave first 2 character , second parameter ..replace with string xyz...
      //  stringBuilder.replace(1,3,"xyz");   // leave first character and replace 2,3 character with xyz
        System.out.println(stringBuilder);
    }
}
