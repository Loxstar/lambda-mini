package com.theIronYard;

public class RunnableDemo {
    public static void main(String[] args) {

        // !! - Write an anonymous Runnable class here
        //It can just print out "Anonymous run" or similar
        Runnable r = new Runnable() {

            @Override
            public void run() {
                System.out.println("Anonymous run");
            }
        };

        r.run();

        // !! - Write a lambda function here
        //It can also print out something like "Lambda run"
        Runnable lambdaRun = () ->
                System.out.println("Lambda Run");

        lambdaRun.run();
    }
}