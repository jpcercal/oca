package com.cekurte.oca.appendix.b;

/**
 * What line of code does not compile?
 *
 * Tip: two lines will not compile.
 */
public class Page357 {
    public static void main(String[] args) {
        float value1 = 102;
        float value2 = (int)102.0;
        float value3 = 1f * 0.0;
        float value4 = 1f * (short)0.0;
        float value5 = 1f * (boolean)0;
    }
}
