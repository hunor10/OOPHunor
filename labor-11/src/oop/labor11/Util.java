package oop.labor11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Util {
        public static double median(double[] array) throws Exception{
            if(array.length==0){
                throw new Exception("array is empty");}
            Arrays.sort(array);
            if(array.length%2==1)
                return array[array.length/2];
            else return array[array.length/2]+array[array.length-1];

        }
    }
