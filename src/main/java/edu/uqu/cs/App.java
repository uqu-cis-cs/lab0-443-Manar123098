package com.mycompany.lab0;
/*
 * Lab 0 
 * CS 1312
 */

/*
* Make sure to complete and submit your lab
*/

 import java.util.Scanner;
public class Lab0 {

/**  
* Complete method "twisters" definition below. The method prints all numbers from 1 to 110, 11 numbers per line. 
* Also, it does the following:
* - If the number is a multiple of 2, print "Tweetle"
* - If the number is a multiple of 4, print "Beetle"
* - If the number is a multiple of 6, print "Poodle"
* - Otherwise just print the number
* 
* Output: 
*        1 Tweetle 3 TweetleBeetle 5 TweetlePoodle 7 TweetleBeetle 9 Tweetle 11
*        TweetleBeetlePoodle 13 Tweetle 15 TweetleBeetle 17 TweetlePoodle 19 TweetleBeetle 
*/

/**
* Write a method named "phoneKeypad" that takes a string parameter (str)
* then it replaces each letter in (str) by a number that represnts it 
* in a phone keypad as follows: 
* ABC = 2;
* DEF = 3;
* GHI = 4;
* JKL = 5;
* MNO = 6;
* PQRS = 7;
* TUV = 8; 
* WXYZ = 9
*
* Example:
* Input: calling batman
* Output: 2255464228626
*
*/
  
 
    public static void main(String [] args) {
        int x= 1;
        int y= 110;
        Scanner u= new Scanner(System.in);
        String str=u.nextLine();
        twisters(x,y);
        phoneKeypad((String)str);
        /* Write your code here */
     
       //call method twisters()
       //prompt user to enter a string 
       //call method phoneKeypad(string)


    }
    public static void twisters(int x, int y){
        for(; x<=y; x++){
        if(x%2==0){
            System.out.print("Tweetle");}
             if(x%4==0){
            System.out.print("Beetle");}
             if(x%6==0){
            System.out.print("Poole");}
             if(x%2!=0 && x%4 != 0 && x%6!=0){
            System.out.print(x);}
             if(x%11==0){
            System.out.print("\n");}
        }
    }
}
            public static String phoneKeypad(String str){
               String nums="";
             str=str.toUpperCase();
             for(int i=0; i<=str.length()-1; i++){
           swtch(str.charAt(i)){
        case'A','B','C':nums+=2;
        break;
        case'D','E','F':nums+=3;
        break;
        case'G','H','I':nums+=4;
        break;
        case'J','K','L':nums+=5;
        break;
        case'M','N','O':nums+=6;
        break;
        case'P','Q','R','S':nums+=7;
        break;
        case'T','U','V':nums+=8;
        break;
        case'W','X','Y','Z':nums+=9;
        break;
    }
    }
          return nums;
 
 }