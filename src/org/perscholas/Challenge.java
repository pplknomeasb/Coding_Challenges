package org.perscholas;

public class Challenge {

    static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder();
        boolean isCapital = false;

        for(int i = 0; i < s.length(); i++){

            if(isCapital=false){

                if(Character.isLetter(s.charAt(i))) {

                    sb.append(s.charAt(i));

                //Checks to see if the next character is a letter
                    if (Character.isLetter(s.charAt(i + 1)) == isCapital) {

                        //found dilimiter
                        isCapital = true;

                        //Moves the pointer to index of the foriegn character
                        i += 1;

                    }
                 }

                sb.append(s.charAt(i));

            }else if(isCapital=true){
                sb.append(s.toUpperCase().charAt(i));
                isCapital=false;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
