package com.example;

import java.util.Scanner;

import com.example.variations.BigIntegerMath;
import com.example.variations.MyAlg;

public class Runner {

    public Runner() {
        
    }

    public void loop(){
        String c1 = " ";
        String c2 = " ";

        Scanner scanner = new Scanner(System.in);
       
        do {
            
            System.out.println("Zadaj prvé čislo: ");
            c1 = scanner.nextLine();

            System.out.println("Zadaj druhé čislo: ");
            c2 = scanner.nextLine();

            if (c1 == "" ||  c2 == "") {
             break;   
            }else{
                BigIntegerMath bigints = new BigIntegerMath(c1 , c2);
                MyAlg alg = new MyAlg(c1, c2);
                System.out.println(bigints.getMultiplied());
                System.out.println(alg.getMultiplied()); 

            }
            
            
        } while (c1 != "" || c2 != "");
        scanner.close();
    }
    
}
