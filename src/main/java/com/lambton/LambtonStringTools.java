/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lambton;

import java.util.ArrayList;

/**
 *
 * @author Pritesh Patel
 */
public class LambtonStringTools 
{
    //1 - REVERSE STRING
    public static String reverse(String s)
    {
     /* String[] newArray = s.split("");
        System.out.println(newArray);
        for(int i =0, j=s.length(); i< s.length()-1; i++, j--) {
            String temp = newArray[i];
            newArray[j] = newArray[i];
            temp = newArray[j];
        } */
        return null;
    }
    
    //2 - FORMAT INITIALS OF STRING
    public static String initials(String s) 
    {

        return null;
    }
        
    //3 - FIND MOST FREQUENT CHARACTER FROM STRING
    public static String mostFrequent(String s) 
    {
        char[] t = s.toCharArray();
        int[] count = new int[0];
        for(int i = 0; i < s.length(); i++){
            for(int j =i+1; j < s.length()-1; j++){
                if(t[i] == t[j]){
                    count[i]++;
                }
                
            }
        }
        return null;
    }
    
    //4 - CONVERT BINARY NUMBER TO DECIMALS
    public static double binaryToDecimal(String s)
    {
        char[] binNumbers = s.toCharArray();
        double result = 0;
        int power = 1;
        for(int i =s.length()-1; i > 0; i--){
            result = result + (binNumbers[i]* Math.pow(2,power));
            power++;
            }
        return result;
    }

     
    //5 - REPLACING SUBSTRING WITH NEW STRING IN EXISTING STRING
    public static String replaceSubString(String originalString, String findString, String newString) 
    {
        return null;
    }
}
