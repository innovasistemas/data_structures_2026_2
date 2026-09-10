package com.packages.arrays;

public class Vector 
{
    private final int T = 100;
    private int vec[] = new int[T];
    private int n;

    public Vector()
    {
        n = 0;
    }

    public int[] getVec() {
        return vec;
    }

    public void setVec(int[] vec) {
        this.vec = vec;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getT() {
        return T;
    }

    public void addVector(int datum)
    {
        vec[n] = datum;
        n++;
    }

    public static void showVector(int v[], int m)
    {
        for (int i = 0; i < m; i = i + 1) {
            System.out.print(v[i] + " | ");
        }
    }

    

    
}
