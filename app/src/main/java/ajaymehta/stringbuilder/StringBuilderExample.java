package ajaymehta.stringbuilder;

import android.widget.Toast;

/**
 * Created by Avi Hacker on 6/27/2017.
 */

/*StringBuilder.
        String appends become increasingly expensive as strings become longer.
        More and more memory is required—programs slow down.

        A solution.
        The StringBuilder class in Java is a solution to this problem.
        It is mutable. It just reuses a single buffer. It speeds up appends, inserts.*/

public class StringBuilderExample {  // use stringBuilder instead of StringBuffer to append...speeds up..

    public void print(){

        StringBuilder builder = new StringBuilder();

        int i =0;

        while(i <5) {
            builder.append("abc ");
            i++;
        }
        MainActivity.abc.setText(builder);
    }
}



