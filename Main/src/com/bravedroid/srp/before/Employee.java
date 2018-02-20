package com.bravedroid.srp.before;

//This class violates the SRP because those three methods are responsible to three very different actors
//The SRP says to separate the code that different actors depend on
//PROBLEM 1: Conflict when merging using VCS tools like git
public class Employee {
    //method used by the CFO Team
    public void calculatePay() {
    }


    //method used by the CTO Team
    public void save() {
    }

    //method used by the COO Team
    public void reportHours() {
    }

    //method used by the CTO Team
    //method written by developer who hates duplication so it uses calculatePay() and save()
    //PROBLEM 2:
    //Imagine that the CFO /CTO Team changes the calculatePay()/save() a great problem could happen as the COO team doesn't know about it
    //The SRP says to separate the code that different actors depend on
    public void regularHours() {
        calculatePay();
        save();
    }

}
