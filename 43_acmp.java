package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String text = input.next();
        int counter = 0;
        int counter1 = 0;
      if(text.length()<1 && text.length()>100){
        for(int i = 0; i < text.length(); i++){
            if(text.charAt(i) == '0'){
                counter++;
                if(counter > counter1){
                    counter1 = counter;
                }
            }
            else if(text.charAt(i) == '1'){
                counter = 0;
            }
        }
        System.out.println(counter1);

    }
    }
}
