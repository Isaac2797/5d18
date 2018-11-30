/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package words;

/**
 *
 * @author Isaac
 */
public class UsaCount {
    
    public static void main(String[] args) {
        Count count = new Count();
        String txt = "Hola como estas";
        System.out.println("La cantidad de palabras es: " + count.getWords(txt));
        System.out.println("La cantidad de palabras unicas es: " + count.getUnique(txt));
        System.out.println("La Cantidad de silabas es: " + count.countSyllables(txt));
        System.out.println("Lista de los chars repetidos: ");
        count.countChar(txt);
        
    }
}
