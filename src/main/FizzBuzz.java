package main;

/**
 * when n is multiple of 3 print Fizz
 * when n is multiple of 5 print Buzz
 * when n is multiple of both, print FizzBuzz
 */


public class FizzBuzz {
    /*
     * There are four cases. At least 3 cases to check, if n%3=0 and if n%5=0
     * and the case when, both checks are valid at the same time.
     * My first thought is:
     *       for(1...100)
     *           if(i%3==0 AND i%5==0)... FizzBuzz
     *           else if(i%3==0)... Fizz
     *           else if(i%5==0)... Buzz
     *           else print i
     * */
    public static void fizzbuzzFirstTry(){
        for(int i=1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }
    /*
    * I don't like the double check of i%5=0, its not a good practice.
    * Fizz+Buzz=FizzBuzz...
    * */
    public static void fizzbuzzWOW(){
        for(int i=1; i<=100; i++){
            String output = "";
            if(i%3==0){ output+="Fizz";}
            if(i%5==0){ output+="Buzz";}
            if(output.equals("")){output+=String.valueOf(i);}
            System.out.println(output);
        }
    }
    public static void main(String[] args){
        //System.out.println("Hello World!");
        fizzbuzzFirstTry();
    }
}
