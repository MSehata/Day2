/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.day2;

/**
 *
 * @author MolokoSehata
 */
public class Day2 {

    public static void main(String[] args) {
        //Exercise number :
        //1
        String start = "AniMaL ";
        System. out. println(start) ;
        String trimed = start. trim();
        System. out. println(trimed) ;
        String lowercase = trimed .toLowerCase();
        System. out. println(lowercase) ;
        String result = lowercase. replace( 'a', 'A');
        System. out. println(result) ;
        //2
        String message = "We are the so—called \"Vikings\" from the north";
        System.out.println(message);
        //3        
        StringBuilder sb = new StringBuilder("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
        System.out.println("Original string: " + sb);
        sb.reverse();
        System.out.println("Reversed string: " + sb);
        //4
        
    }
}
