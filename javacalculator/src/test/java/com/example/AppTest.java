package com.example;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.example.variations.BigIntegerMath;
import com.example.variations.MyAlg;

public class AppTest 
{
    
    @Test

    public void dveVelkeCisla() {
        MyAlg alg = new MyAlg("123245678912345678911", "12345678912345678911");
        BigIntegerMath big = new BigIntegerMath("123245678912345678911", "12345678912345678911");
        assertEquals(alg.getMultiplied(), big.getMultiplied());

    }
    @Test

    public void jednoVelkeJednoMale1() {
        MyAlg alg = new MyAlg("5", "123546587635456789234567489726156789724798");
        BigIntegerMath big = new BigIntegerMath("5", "123546587635456789234567489726156789724798");
        assertEquals(alg.getMultiplied(), big.getMultiplied());

    }
    @Test
    public void jednoVelkeJednoMale2() {
        MyAlg alg = new MyAlg("123546587635456789234567489726156789724798", "5");
        BigIntegerMath big = new BigIntegerMath( "123546587635456789234567489726156789724798", "5");
        assertEquals(alg.getMultiplied(), big.getMultiplied());

    }

    @Test
    public void nasobenie01() {
        MyAlg alg = new MyAlg( "123546587635456789234567489726156789724798", "0");
        BigIntegerMath big = new BigIntegerMath( "123546587635456789234567489726156789724798", "0");
        assertEquals(alg.getMultiplied(), big.getMultiplied());

    }
    @Test
    public void nasobenie02() {
        MyAlg alg = new MyAlg("0","123546587635456789234567489726156789724798");
        BigIntegerMath big = new BigIntegerMath("0", "123546587635456789234567489726156789724798");
        assertEquals(alg.getMultiplied(), big.getMultiplied());


    }



}
