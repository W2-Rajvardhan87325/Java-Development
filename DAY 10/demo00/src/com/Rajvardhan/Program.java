package com.Rajvardhan;

import java.util.ArrayDeque;
import java.util.Iterator;
// import java.util.LinkedList;
import java.util.Queue;

public class Program {
    public static void main(String[] args) {
        Queue<String> q = new ArrayDeque<String>();
        // Queue<String> q = new LinkedList<String>();
        q.offer("Raj");
        q.offer("Dhanashri");
        q.offer("Samarth");
        q.offer("Shreyas");
        q.offer("Abhi");

        System.out.println("===================QUEUE===================");
        System.out.println("Top of the Queue ::" + q.peek() + "\nSize of the Queue ::" + q.size());

        System.out.println("\nPrinting the Elements of the Queue ::(Using For Each)");
        for (String iterator : q) {
            System.out.print(iterator + "  ");
        }

        System.out.println();
        System.out.println("\nPrinting the Elements of the Queue ::(Using Iterator)");

        Iterator<String> traversal = q.iterator();
        while (traversal.hasNext()) {
            String elements = traversal.next();
            System.out.print(elements + "  ");
        }

        System.out.println();

        System.out.println("\nPrinting the Elements of the Queue ::(Using Remove|| Poll)");
        while (!q.isEmpty()) {
            System.out.print(q.poll() + "  ");
            // System.out.print(q.remove() + "\t");
        }
    }
}
