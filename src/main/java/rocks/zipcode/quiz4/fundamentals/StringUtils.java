package rocks.zipcode.quiz4.fundamentals;

import javax.sql.rowset.serial.SerialStruct;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        Character result = 0;
        int mid=string.length()/2;
        String[] stringArray=string.split("");
        for (int i=0;i<stringArray.length;i++){
            if ( i==mid){

                result=string.charAt(i);

            }
        }


         return result;
    }

    public static String capitalizeMiddleCharacter(String str) {
        String string = "";
        int mid = str.length() / 2;
        String[] stringArray = str.split("");
        for (int i = 0; i < stringArray.length; i++) {
             if (i == mid) {
                  string += stringArray[i].toUpperCase();
             } else {
                string += stringArray[i];
            }
         }
        return string;
    }


    public static String lowerCaseMiddleCharacter(String str) {
        String string = "";
        int mid = str.length() / 2;
        String[] stringArray = str.split("");
        for (int i = 0; i < stringArray.length; i++) {
            if (i == mid) {
                string += stringArray[i].toLowerCase();
            } else {
                string += stringArray[i];
            }
        }
        return string;
    }

    public static Boolean isIsogram(String str) {
        String []arr = str.split("");

        for (String s:arr){
            int frequency = Collections.frequency(Arrays.asList(arr),s);
            if (frequency>1){
                return false;
            }

        }
        return true;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        String[] arr = str.split("");
        boolean issaMatch = false;
        for ( int i=1; i<arr.length;i++){
                if (arr[i-1].equals( arr[i])){
                    issaMatch=true;
                }
            }


        return issaMatch ;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
      String result ="";
      String res ="";
      String [] arr = str.split("");

        for (int i=1; i < arr.length ; i++) {


            if (arr[i-1].equals(arr[i])){
                result+=arr[i];
                str=str.replace(result,"");
                result="";

            }



      }
      return str;
    }

    public static String invertCasing(String str) {
        String result="";
        String[] string = str.split("");
        for (int i = 0; i < string.length; i++) {
            Character c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                result+= string[i].toLowerCase();

            } else result+=string[i].toUpperCase();
        }return result;
    }
}