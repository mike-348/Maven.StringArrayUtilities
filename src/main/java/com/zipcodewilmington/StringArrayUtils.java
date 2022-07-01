package com.zipcodewilmington;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.fastinfoset.util.StringArray;
import sun.security.util.ArrayUtil;

import java.sql.Array;
import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    } //passed

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    } //passed

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    } //passed

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    } //passed

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean contains = false;
        for (String word : array) {
            if (word.contains(value)) ;
            {
                contains = true;
            }
        }
        return contains;
    } //passed

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] str = new String[array.length];
        int endOfFirstArray = array.length - 1;
        int index = 0;
        for (int i = endOfFirstArray; i >= 0; i--) {
            str[index] = array[i];
            index++;
        }
        return str;

        // Easier method:

//    ArrayList<String> arrList = new ArrayList<String>();
//    arrList.addAll(Arrays.asList(array));
//    Collections.reverse(arrList);
//    return arrList.toArray(new String[arrList.size()]);
    } //passed

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {

        String[] reverseArray = StringArrayUtils.reverse(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray));

        if (Arrays.equals(array, reverseArray)) {
            return true;
        }
        return false;
    } //passed

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = Arrays.toString(array);
        String lowerCase = str.toLowerCase();
        System.out.print(lowerCase);
        int count = (int) lowerCase.chars().filter(i -> i >= 'a' && i <= 'z').distinct().count();

        return (count == 26);
    } //passed
    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        int arrLen = array.length;
        for (int i = 0; i < arrLen; i++) {
            if (array[i].equals(value)) {
                count++;
            }
        }
        return count;

    } //passed


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

//        String[] newArr = null;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == valueToRemove) {
//                newArr = new String[array.length-1];
//                for (int index = 0; index < i; index++) {
//                    newArr[index] = array[index];
//                }
//                for (int j = i; j < array.length - 1; j++) {
//                    newArr[j] = array[j + 1];
//                }
//                break;
//            }
//            System.out.print(newArr);
//        }
//
//        return newArr;
//    } //also works (no ArrayList)
        ArrayList<String> arrList = new ArrayList<>();
        arrList.addAll(Arrays.asList(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valueToRemove) {
                arrList.remove(arrList.indexOf(valueToRemove));
            }
        }

        return arrList.toArray(new String[arrList.size()]);
    } //passed

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add(array[0]);
        for(int i = 1; i < array.length; i++) {
            if (array[i-1] != array[i]) {
                arrList.add(array[i]);
            }
        }
        return arrList.toArray(new String[arrList.size()]);
    } //passed

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrList= new ArrayList<>();
        String result = "";

        for (int i = 0; i < array.length-1; i++)
            if ((array[i] == array[i+1]))  {
                result += array[i];
            } else {
                result += array[i];
                arrList.add(result);
                result = "";
                }
        result = result+array[array.length-1];
        arrList.add(result);
        System.out.print(arrList);
        return arrList.toArray(new String[arrList.size()]);
    }

//        ArrayList<String> arrList = new ArrayList<>();
//        arrList.addAll(Arrays.asList(array));
//        String toAdd = "";
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == array[i+1]) {
//                toAdd =
//
//            }
//        }
//        return arrList.toArray(new String[arrList.size()]);
//    }
}
