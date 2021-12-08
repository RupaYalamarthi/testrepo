package com.company;

public class Main {

    public static void main(String[] args) {
	// if it is Divisible by 3 ,then say Fizz
        // if it is Divisible by 5 ,then say buzz
        // if it is Divisible by 3&5 ,then say FizzBuzz
        int num=100;
        for(int i=1;i<=num;i++)
        {
            if(i%3==0 && i%5 ==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
