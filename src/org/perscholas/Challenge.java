package org.perscholas;

import java.util.Locale;

public class Challenge {

    static String toCamelCase(String s){

        //creating a string builder object to contain the wanted return string
        StringBuilder sb = new StringBuilder();

        //variable will catch when characters are to be capitalized
        boolean isCapital = false;

        //creating loop to loop through the string
        for(int i = 0; i < s.length(); i++){

            //checks if the current character is in a place to be capitalized
            if(isCapital && Character.isLetter(s.charAt(i))){

                //stores the capital letter in the string builder
                sb.append(s.toUpperCase().charAt(i));

                //ensures that the next index will not be capitalized
                isCapital = false;


            }
            //checks to see if the character is to be printed
            else if(Character.isLetter(s.charAt(i)) && !isCapital){
                sb.append(s.charAt(i));

            }
            //checks to see if it is a character separater, next character will be uppercase
            else if(!Character.isLetter(s.charAt(i))){
                isCapital=true;
            }

        }
        System.out.println(sb.toString());

        //returns result
        return sb.toString();
    }
}
