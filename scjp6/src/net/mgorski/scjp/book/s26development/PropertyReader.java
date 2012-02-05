package net.mgorski.scjp.book.s26development;

import static java.lang.Integer.MAX_VALUE;

import java.util.Properties;

public class PropertyReader {
    public static void main(String...args) {                // <<< varargs
        Properties properties = System.getProperties();
        properties.list(System.out);
        
        
        
        System.out.println(MAX_VALUE);      // static import !
    }
}
