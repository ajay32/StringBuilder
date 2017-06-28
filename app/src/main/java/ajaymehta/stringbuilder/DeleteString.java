package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

public class DeleteString {

   static String str;  // we made it static so that it can be used in a static method...

    public void getString(String str){
        this.str = str;

    }


    public static void main(String args[]) {

        new DeleteString().getString("Carrot"); // everything starts with 0

        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.delete(2,5);  // it will go upto 5 but delete  2 to 4 ...characters..

        System.out.println(stringBuilder);


    }
}
