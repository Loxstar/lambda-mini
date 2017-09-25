package com.theIronYard;

import java.util.*;

import static com.sun.tools.doclint.Entity.lambda;
import static jdk.nashorn.internal.objects.Global.print;

/**
 * Created by gilpratte on 7/26/17.
 */
public class ComparatorDemo {

    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("123 Main St.", "Austin", "TX", "78787"));
        addresses.add(new Address("43 High St.", "Columbus", "OH", "43034"));
        addresses.add(new Address("678 Leon Rd.", "Tallahassee", "FL", "32307"));
        addresses.add(new Address("8 Deep Sea Way", "Boca Raton", "FL", "33433"));

        //Feel free to add in more addresses if you would like

        System.out.println("Before sorting");
        print(addresses);

        // !! - Write an anonymous class to sort by state (alphabetically)
        Collections.sort(addresses, new  Comparator<Address>(){

            @Override
            public int compare(Address a1, Address a2){
                return a1.getState().compareTo(a2.getState());
            }
        });

        System.out.println("\nAfter sorting by state");
        print(addresses);

        // !! - Write a lambda to sort by city alphabetically
        Collections.sort(addresses,(a1, a2) -> a1.getCity().compareTo(a2.getCity()));

        System.out.println("\nAfter sorting by city");
        print(addresses);
    }

    private static void print(List<Address> addresses) {
        for(Address address : addresses) {
            System.out.println(address);
        }
    }
}
