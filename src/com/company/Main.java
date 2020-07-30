package com.company;

import com.company.util.Util;


public class Main {

    public static void main(String[] args) {

        //Creates an instance of Util
        Util util = new Util();
        //Calls createPersons() to create a list of 10 persons
        util.createPersons();
        //Calls the start() and returns the choice which the user has made
        int value = util.start();
        //Call the searchOption() with the users choice of search
        util.searchOption(value);




    }
}
