package net.mgorski.scjp.book.s01varia;



class S0009BEnum {

    private enum DupaEnum { BIG } // 1
    private enum DupaEnum2 { NICE, GREEN;
    
    private DupaEnum2 getNiceDupa(){
        return NICE;
    }
        
    } // 1
    private int x; //2
    
    public void dupa(){
        System.out.println(S0009BEnum.DupaEnum.BIG); //3
        int y; //4
        System.out.println(x); //5 
//        System.out.println(y); // 6 // fail!
    }

}


class A{}; class B extens A {}:
List<B> a1 = new List<B>();
List<A> a2 = new ArrayList<A>();
List<A> a3 = new ArrayList<B>();
List<B> a4 = new ArrayList<A>();
List<Object> a5 = new ArrayList<B>();
ArrayList<A> a6 = new ArrayList<B>();