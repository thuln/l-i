/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Exercise6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ReplaceRepetive rr = new ReplaceRepetive();
        System.out.println("Test case: ");
        System.out.println("Case1: with String");
        System.out.println("i want to to to to go to the the zoo");
        System.out.println(rr.replaceRepetive(rr.changeToAnotherS("i want to to to to go to the the zoo")));
        System.out.println("Case2: with number");
        System.out.println("O do co 1 1 cai cay");
        System.out.println(rr.replaceRepetive(rr.changeToAnotherS("O do co 1 1 cai cay")));
        System.out.println("Case3: with special character");
        System.out.println("mot @ @ @ hai, hai");
        System.out.println(rr.replaceRepetive(rr.changeToAnotherS("mot @ @ @ hai")));
        System.out.println("Case4:");
        System.out.println("mot mot hai, hai");
        System.out.println(rr.replaceRepetive(rr.changeToAnotherS("mot mot hai, hai")));
    }
    
}
