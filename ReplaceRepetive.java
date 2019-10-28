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
public class ReplaceRepetive {
    ArrayList<String> safter = new ArrayList<String>();

    
    public ArrayList<String> changeToAnotherS(String sbefore){
        String[] words = sbefore.split("\\s");
        ArrayList<String> safter = new ArrayList<>();
        int k = 0;
        for (String s : words) {
            safter.add(s);
        }
        return safter;
    }
    
    public String replaceRepetive(ArrayList<String> s){
       ArrayList<Integer> index = new ArrayList<>();
       String done = "";
        for (int i = 0; i < s.size(); i++) {
            for (int j = i + 1; j < s.size(); j++) {
                if (s.get(i).equals(s.get(j))) { 
                    index.add(j);
                    s.set(i,"REPEAT");
                }   
                else{
                    break;
                }
            } 
        }
       for (Integer integer : index) {
            s.set(integer, "");
        }
        for (String string : s) {
            if(!string.equals("")){
                done += string+" ";
            }
        }
        done=done.replace("\\s+","");
        return done;
    }
    
    
}
