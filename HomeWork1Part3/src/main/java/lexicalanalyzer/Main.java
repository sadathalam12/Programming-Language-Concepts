/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lexicalanalyzer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mdala
 */
public class Main {
    
    public static void main(String[] args){
        System.out.println(lexicalAnalyzer("2345 6tgbsauhd9sa67*I{OPKDSl;jaklhl"));
    }
    
    public static String lexicalAnalyzer(String string){
        String c = ""; 
        String compare = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890"; 
        List<Character> compareList = new ArrayList<Character>(); 
        for(int i = 0; i< compare.length(); i++){
            compareList.add(compare.charAt(i));
        }
        for(int i = 0; i<string.length(); i++){
            if(string.charAt(i) == ' '){
               
            }else if(compareList.contains(string.charAt(i))){
                if(i>0){
                   if(!compareList.contains(string.charAt(i-1))){
                        c+="\n"; 
                    }
                }
                c+= string.substring(i, i+1); 
            }else{
                c+= "\n"; 
                c+= string.substring(i, i+1); 
            }
        }
        return c; 
    }
}
