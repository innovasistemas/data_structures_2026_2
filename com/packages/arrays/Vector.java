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

    public int sumVector()
    {
        int s = 0;
        for (int i = 0; i < n; i = i + 1) {
            s += vec[i];
        }
        return s;
    }

    public double averageVector()
    {
        return (double) sumVector() / n;
    }

    public int searchVector(int d)
    {
        int i, pos;
        i = 0;
        pos = -1;
        while (pos == -1 && i < n) {
            if (vec[i] == d) {
                pos = i;
            } else {
                i = i + 1;
            }
        }
        return pos;
    }

    public void deleteVector(int pos)
    {
        for (int i = pos; i <= n - 2; i++) {
            vec[i] = vec[i + 1];
        }
        n--;
    }

    public void insertBeforeVector(int pos, int datum)
    {
        for (int i = n; i > pos; i--) {
            vec[i] = vec[i - 1];
        }
        vec[pos] = datum;
        n++;
    }

    public void updateVector(int pos, int datum)
    {
        vec[pos] = datum;
    }

    
}
