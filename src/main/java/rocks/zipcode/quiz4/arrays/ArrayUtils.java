package rocks.zipcode.quiz4.arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        int mid = Math.round(Float.valueOf(values.length)/2)-1;
        for ( int i=0; i<values.length;i++){
            if (i==mid){
                return values[i];
            }
         }
        return null;
    }

    public static String[] removeMiddleElement(String[] values) {
        String mid =getMiddleElement(values);
        String result ="";

            for (int i = 0; i < values.length; i++) {
                if (values[i] != mid) {
                    result += values[i]+",";
                }
            }


        String [] res = result.split(",");
        return res;
    }

    public static String getLastElement(String[] values) {

        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        String res="";

     for ( int i =0; i<values.length;i++){
         if (i != values.length-1){
             res+=values[i]+",";
         }


        }
            String [] result = res.split(",") ;


        return result;
    }
}