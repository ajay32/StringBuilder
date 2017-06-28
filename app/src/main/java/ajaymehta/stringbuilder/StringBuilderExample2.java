package ajaymehta.stringbuilder;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

public class StringBuilderExample2
// It appends all type of data ...int , double , char not only string type...so when need to append different type of data..use stringBuilder
{
    int val1 = 4;
    double val2 = 3.12;
    float val3 = 3.3f;
    char val4 = 'a';


    public void print(){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(val1).append("\n").append(val2).append("\n").append(val3).append("\n").append(val4);

        MainActivity.tvAppend.setText(stringBuilder);
    }

}
