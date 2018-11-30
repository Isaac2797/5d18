/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author 5d
 */
public class Count {
    public int words, unique;
    public String text;
    
    public int getWords(String txt){
        String[] data = txt.split(" ");
        for(int i = 0; i < data.length; i++)
        {
            words++;
        }
        return words;
    }
    
    public int getUnique(String txt){
        HashMap<String, Integer> hm = new HashMap<>();
        
        String[] num = txt.split(" ");
        
        for(String str:num){
            if(hm.containsKey(str)){
                int n = hm.get(str);
                n += 1;
                hm.replace(str, n);
            }
            else
            {
                hm.put(str, 1);
            } 
        }
        return hm.size();
    }
    
    public int countSyllables(String word) {
        String input = word.toLowerCase();
        int syllables = 0,numOfEInTheEnd=0;

        int i = input.length() - 1;
        // count all the e's in the end
        while (i >= 0 && input.charAt(i) == 'e') {
            i--;
            numOfEInTheEnd++;
        }

        if (numOfEInTheEnd == 1) {
            syllables = 1;
        }

        boolean preVowel = false;
        while (i >= 0) {
            if (isVowel(input.charAt(i))) {
                if (!preVowel) {
                   syllables++;
                   preVowel = true;
                }
            } else {
                preVowel = false;
            }
            i--;
        }
        return syllables;
        }

        public boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
            return true;
        }
        return false;
    }
    public void countChar(String word){
        word = word.replace(" ", "");
        word = word.toLowerCase();
        Map countChar = new LinkedHashMap<Character, Integer>();
        for(char ch : word.toCharArray()){
            if(countChar.containsKey(ch))
            {
                countChar.put(ch,(Integer)countChar.get(ch)+1);
            }
            else
            {
                countChar.put(ch, 1);
            }
        }
        System.out.println(countChar);
    }
}
