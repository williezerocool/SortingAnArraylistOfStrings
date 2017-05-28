/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortinganarraylistofstrings;

import java.util.ArrayList;
/**
 *
 * @author kendrabooker
 */
public class SortingAnArraylistOfStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ArrayList<String> word = new ArrayList<>();
        
        word.add("eat");
        word.add("play");
        word.add("extraordinary");
        word.add("intelligence");
        word.add("simple");
        word.add("smart");
        word.add("dagger");
        word.add("just");
        word.add("batman");
        word.add("catwoman");
       
        System.out.println("ArrayList before: " + word);
        
        sort(word);
        System.out.println("ArrayList after: " + word);
    
    
    }
    
    
    
    public static void sort(ArrayList<String> word){
    
      ArrayList<String> word2 = word;
        String temp;
        for(int i=0; i<word.size(); i++){
            for(int j=0; j<word.size(); j++){
            
                if(word.get(i).compareTo(word2.get(j)) < word2.get(j).compareTo(word.get(i))){
                
                    temp = word.get(i);
                    word.set(i, word2.get(j));
                    word2.set(j, temp);
                }
            }
        }  
    }
    


}
