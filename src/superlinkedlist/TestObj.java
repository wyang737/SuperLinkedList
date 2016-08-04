/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superlinkedlist;

/**
 *
 * @author Winston
 */
public class TestObj {
    
    public static void main(String[] args) {
        int i = 1;
        Integer j = new Integer(1);
        Integer k = new Integer(1);
        System.out.println(i == k);
        
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1: " + obj1);
        System.out.println("obj2: " + obj2);
        
        System.out.println(obj1 == obj2);
        
        MyObject mo1 = new MyObject();
        mo1.data = 1;
        
        MyObject mo2 = new MyObject();
        mo2.data = 1;
        System.out.println(mo1 == mo2);
        System.out.println(mo1.equals(mo2));
    }
    
    public static class MyObject {
        public int data;
        
        /*@Override
        public boolean equals(Object o) {
            MyObject tmp = (MyObject) o;
            
            if (tmp.data == this.data) {
                return true;
            } else {
                return false;
            }
        }
        
        @Override
        public int hashCode() {
            return this.data;
        }*/
    }
    
}
