package com.example.variations;



public class MyAlg {
    private String c1,c2;

    public MyAlg(String c1, String c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public String getMultiplied(){
        String vysledok ="";
        if (c1 == "0" || c2 == "0") {
            vysledok = "0";
            
        }else {
            int dlzkaCisla1 = c1.length();
        int dlzkaCisla2 = c2.length();
        int pole[] = new int[dlzkaCisla1+dlzkaCisla2];
        int poziciaC1 = 0;
        int poziciaC2 = 0;
        for (int i = dlzkaCisla1 - 1; i >= 0; i--) {
            int premenna = 0;
            int cisloOdKonca1 = c1.charAt(i) - '0';
            poziciaC2 = 0;
            for (int j = dlzkaCisla2 - 1; j >= 0; j--) {
                int cisloOdKonca2 = c2.charAt(j) - '0';
                int sucin = cisloOdKonca1 * cisloOdKonca2 + pole[poziciaC1 + poziciaC2] + premenna;
                premenna = sucin / 10;
                pole[poziciaC1 + poziciaC2] = sucin % 10;
                poziciaC2++;
            }
            if (premenna > 0) {
                pole[poziciaC1 + poziciaC2] += premenna;
            }
            poziciaC1++;
            
        }
        int i = pole.length - 1;
        while (i >= 0 && pole[i] == 0) {
            i--;
        }
        vysledok = "";
        while (i >= 0) {
            vysledok += (pole[i--]);
            
        }

        

        }
        return vysledok;
        

    }
    
    
}
