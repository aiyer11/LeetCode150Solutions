package com.arjun.interviewprep.Stack;

import java.util.Arrays;
import java.util.Stack;

public class CarFleetSolution {

    public int carFleet(int target, int[] position, int[] speed){

        double[][] sortedCars = new double[position.length][2];
        for(int i = 0; i < position.length; i++)
        {
            sortedCars[i] = new double[]{position[i],speed[i]};
        }
        Arrays.sort(sortedCars,(a,b) -> Double.compare(a[0],b[0]));
        Stack<double[]> fleetStack = new Stack<>();

        for(int i = sortedCars.length -1; i >= 0; i--)
        {
            if(fleetStack.isEmpty())
            {
                fleetStack.push(sortedCars[i]);
            }
            else
            {
                double currentCarTime = (target - sortedCars[i][0]) / sortedCars[i][1];
                double topCarTime = (target - fleetStack.peek()[0]) / fleetStack.peek()[1];

                if(currentCarTime > topCarTime)
                {
                    fleetStack.push(sortedCars[i]);
                }
            }
        }
        return fleetStack.size();
    }
}
