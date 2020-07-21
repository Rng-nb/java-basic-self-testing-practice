package com.twc.javaBasic;

public class NameImpl implements WithName, Person {
    @Override
    public String getName() {
        // TODO:
        //  Please implement the method to pass the test.
        //
        // <--start
        //if the interface has two method with same name only override one method
        return "Person";
        // --end-->
    }
}
