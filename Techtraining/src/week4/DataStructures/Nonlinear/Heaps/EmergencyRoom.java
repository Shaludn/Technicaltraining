package week4.DataStructures.Nonlinear.Heaps;

import java.util.*;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity = new PriorityQueue<>();
        //HIgh priority- 1
        //medium priority-3
        //low prioriy - 5
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The patitent that gets opearted first is Patient :"+ severity.poll());
        System.out.println("Patient in queue: "+ severity);
    }
}
