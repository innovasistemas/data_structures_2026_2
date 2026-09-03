package com.packages.strings;
import java.util.Scanner;

public class Test 
{
    private String text;
    public Scanner input = new Scanner(System.in);

    public Test()
    {

    }

    public String getText() 
    {
        return text;
    }

    public void setText(String text) 
    {
        this.text = text;
    }

    public int countWords()
    {
        int cw = 0; 
        String textAux = text.trim(); 
        for (int i = 1; i < textAux.length(); i++) {
            if (textAux.charAt(i) == ' ') {
                cw++;
            }
        }
        return ++cw;
    }

    public int countWords2()
    {
        int cw = 0; 
        String textAux = text.trim();
        int i, j;
        i = 1;
        while (i < textAux.length()) {
            if (textAux.charAt(i) == ' ') {
                cw++;
                j = i + 1;
                while (j < textAux.length() && textAux.charAt(j) == ' ') { 
                    j++;
                }
                i = j;
            } else {
                i++;
            }
        }
        return ++cw;
    }

    public String guessPhrase()
    {
        String phrase = "";
        int num;
        do { 
            System.out.println("Número: ");
            num = input.nextInt();
            input.nextLine();
            if (num > 31 && num < 126) {
                phrase += String.valueOf((char)num);
            }
        } while (num > 31 && num < 126);
        return phrase;
    }

    public void compareDigits(String id1, String id2)
    {
        if (id1.compareTo(id2) > 0) {
            System.out.println(id1 + " es mayor alfabéticamente");
        } else {
            System.out.println(id2 + " es mayor alfabéticamente");
        }
        int i, s1, s2;
        s1 = s2 = 0;
        for (i = 0; i < id1.length(); i++) {
            s1 += Integer.parseInt(id1.substring(i, i + 1));
            // s1 += (int)id1.charAt(i);
        }
        for (i = 0; i < id2.length(); i++) {
            s2 += Integer.parseInt(id2.substring(i, i + 1));
            // s2 += (int)id2.charAt(i);
        }
        System.out.println("Id 1: " + id1);
        System.out.println("Id 2: " + id2);
        System.out.println("Suma 1: " + s1);
        System.out.println("Suma 2: " + s2);
        if (s1 > s2) {
            System.out.println("Suma id1 es mayor: ");
        } else {
            System.out.println("Suma id2 es mayor: ");
        }
    }
    

     
}