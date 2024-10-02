package com.arjun.interviewprep;

import com.arjun.interviewprep.Stack.CarFleetSolution;

public class Tester {
    public static void main(String[] args){

        CarFleetSolution carFleetSolution = new CarFleetSolution();
        int[] position = {6,8};
        int[] speed = {3,2};
        System.out.println(carFleetSolution.carFleet(10,position,speed));
    }
}
