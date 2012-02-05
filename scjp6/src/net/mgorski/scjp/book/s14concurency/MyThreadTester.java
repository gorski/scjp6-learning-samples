package net.mgorski.scjp.book.s14concurency;

import java.util.concurrent.Semaphore;

import junit.framework.TestCase;

import org.junit.Test;

public class MyThreadTester extends TestCase {
    
    static Semaphore s = new Semaphore(1);
    
    public static void main(String[] args) {
        
        int i = 0;
        while ( i++<10 ){
            new Thread(new MyThread(s));
        }
        
    }
    
    @Test
    public void test() {
        
        int i = 0;
        while ( i++<10 ){
            new MyThread( s );
        }
        
    }
    
}
