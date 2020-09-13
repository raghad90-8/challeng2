/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challeng2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
public class Challeng2 {

   


 
    public static void main(String[] args) {
        System.out.println("enter string with duplicate word ");
        Scanner string = new Scanner(System.in);
        String word = string.nextLine();
  
    
word = new LinkedHashSet<>( Arrays.asList(word.split("\\s+")) ).toString().replaceAll("[\\[\\],]", "");
 
System.out.println("String after removing duplicate words: ");
System.out.println(word);
}}
