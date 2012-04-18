package net.mgorski.scjp.book.s22collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class PQ {
    
    static PQsort pqComparator = new PQsort(); // get a Comparator
    
    static class PQsort implements Comparator<Integer> { // inverse sort
        public int compare(Integer one, Integer two) {
            return two - one; // unboxing
        }
    }

    public static void main(String[] args) {
        int[] ia = { 1, 5, 3, 7, 6, 9, 8 }; // unordered data
        PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(); // use natural order
        
        for (int x : ia)
            // load queue
            pq1.offer(x);
        
        for (int x : ia)
            // review queue
            System.out.print(pq1.poll() + " ");
        System.out.println("");
        
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(10, pqComparator); // use Comparator
        for (int x : ia)
            // load queue
            pq2.offer(x);
        System.out.println("size _" + pq2.size());
        System.out.println("peek " + pq2.peek());
        System.out.println("size _" + pq2.size());
        System.out.println("poll " + pq2.poll());
        System.out.println("size _" + pq2.size());
        for(int x : ia) // review queue
        System.out.print(pq2.poll() + " ");
        
        
        Collection<String> coll = new PriorityQueue<String>();
        ((Queue<String>) coll).add("a");
        ((Queue<String>) coll).add("b");
        ((Queue<String>) coll).add("c");
        
        System.out.println("\n\nContains a?="+coll.contains("a"));
        Queue q = (Queue) coll;
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.remove());
        
    }
}