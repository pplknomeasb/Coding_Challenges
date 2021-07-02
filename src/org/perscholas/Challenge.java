package org.perscholas;

import java.util.Locale;

public class Challenge {

    static String uniqueCharacters(String s) {

        //Converts any capital letter into a lowercase letter.  P = p...  p = p
        String nextIndex = s.toString().toLowerCase();

        StringBuilder sb = new StringBuilder();

        //Counter is for counting how many instances of a single occurance happen
        int counter = 0;

        //Loop to reference the original string
        for(int i = 0; i<s.length(); i++){

            //Loop to reference where the pointer is
            for(int j = 0; j < s.length(); j++){

                //Compares if the pointer matches any characters in the original string, including itself
                if(nextIndex.charAt(i)==nextIndex.charAt(j)){
                    counter += 1;
                }
            }

            //Each character read is counted at least one time
            if(counter == 1){
                sb.append("(");

                //any character that exists more than once will have a count of greater than or equal to 2
            }else if(counter >= 2){
                sb.append(")");
            }

            //counter is reset before moving the index in the original string
            counter = 0;
        }


        return sb.toString();

    }
}
