package com.example.variations;
import java.math.*;

public class BigIntegerMath {
    private BigInteger c1,c2;
    private boolean nasobenieNulou = false;

    
    

    public BigIntegerMath(String c1, String c2) {
        if (c1 == "0" || c2 == "0") {
            nasobenieNulou = true;
            

        }else{
            this.c1 = new BigInteger(c1);
            this.c2 = new BigInteger(c2);
        }


        
    }

    public String getMultiplied(){
        if (nasobenieNulou) {
            return "0";
        }else{
            c1 = c1.multiply(c2);

        return c1.toString();

        }
        
    

    }

    
}
