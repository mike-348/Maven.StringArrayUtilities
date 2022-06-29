package com.zipcodewilmington;

import com.sun.org.apache.xpath.internal.operations.Bool;
import com.sun.xml.internal.fastinfoset.util.StringArray;

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
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

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
    }

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
    }

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
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
//        StringBuilder sb = new StringBuilder();
//        for (char c = 'A'; c <= 'Z'; c++) {
//            sb.append(c);
//        }
//        String az = sb.toString();
//        az.toLowerCase();
//        boolean pangram = false;
//        char[] ch = new char[az.length()];
//        for (int i = 0; i < az.length(); i++) {
//            ch[i] = az.charAt(i);
//        }
//        String[] strarr = new String[ch.length];
//        for (String element : array) {
//            if (StringArrayUtils.contains(strarr, az)) {
//                pangram = true;
//            };
//            pangram = false;
//        }
//        return pangram;
//    }
// I DONT GET THIS ONE UGGH
//        String az = "Abcdefghijklmnopqrstuvwxyz";
//        StringBuilder sb = new StringBuilder();
//        for (String elements : array) {
//            sb.append(elements);
//        }
//        String s = sb.toString();
//        s.toLowerCase();
//
//        System.out.print(s);
//
//
//        return true;

//        String str = "Abcdefghijklmnopqrstuvwxyz";
//        String s = String.join("",array);
//        s = s.replaceAll("\\s","");
//        s = s.toLowerCase();
//        char charArray[] = s.toCharArray();
//        Arrays.sort(charArray);
//        s = new String(charArray);
//        System.out.print(s);
//        System.out.print(str);
//        if (str.equalsIgnoreCase(s)) {
//            return true;
//        }
//        return false;


//        joinedString.trim();                                    // get rid of spaces
//        char charArray[] = str.toCharArray();
//        Arrays.sort(charArray);                                 // alphabetize
//        String sorted = new String(charArray);
//        if (sorted.equalsIgnoreCase(str)) {
//            return true;
//        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int count = 0;
        for (String element : array) {
            if (element == value) {
                count++;
            }
            return count;
        }
        return count;
    }


    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        return null;
    }


    }
