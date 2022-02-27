package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// checking the number is palindrome or not by using stack.
        System.out.println(palindrome(676));
    }
    public static boolean palindrome(int n){
        Stack<Integer> stack = new Stack<>();
        int rem=0,rev=0,temp = n;
        while(temp!=0){
            rem = temp%10;
            rev = rev*10 + rem;
            temp = temp/10;
        }
        stack.push(rev);
        if(stack.pop()==n){
            return true;
        }
        return false;
    }
}
