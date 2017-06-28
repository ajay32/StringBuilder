package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

// insert a string, integer etc at particualar position...
public class InsertExample
{


    public void print(){

        StringBuilder stringBuilder = new StringBuilder("ajay");

        stringBuilder.insert(2, "hello").insert(9, 32);   // inserting string n integer value at 2 and 4 location..starts with 0  // ajhelloay  --8 char then at 9 ->32

        MainActivity.tvInsert.setText(stringBuilder);
    }

}
