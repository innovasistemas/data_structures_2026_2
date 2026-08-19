package com.packages.strings;

public class PalindromePhrase 
{
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean palindrome()
    {
        String str = this.text.toUpperCase();
        str = this.deleteSpaces(str);
        System.out.println(str);
        // return this.compareCharacters(str);
        return true;
    }

    public String deleteSpaces(String str)
    {
        int i = 0;
        str = str.trim();
        while (i < str.length()) {
            if (str.substring(i, i + 1).equals(" ")) {
                str = str.substring(0, i) + str.substring(i + 1, str.length());
            } else {
                i++;
            }
            i++;
        }
        return str;
    }
}
