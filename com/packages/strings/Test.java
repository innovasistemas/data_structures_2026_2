package com.packages.strings;

public class Test 
{
    private String text;

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

    

     
}