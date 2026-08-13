public class StringsChar
{
    private String text;

    public StringsChar()
    {
        text = "";
    }

    public void testStrings()
    {
        System.out.println("Start small. Ship something.");System.out.println("Longitud hola: " + "hola".length());
        System.out.println("Longitud hola: " + "hola".length());
        System.out.println("Concatenar: " + "hola " + "mundo" + " cruel");
        System.out.println("Concatenar: " + "hola ".concat("mundo"));
        System.out.println("texto convertido a mayúsculas".toUpperCase());
        System.out.println("TEXTO CONVERTIDO A MINÚSCULAS".toLowerCase());
        String n1, n2;
        n1 = "Pedro";
        n2 = "pedro";
        System.out.println(n1 == n2);
        System.out.println(n1.equals(n2));
        System.out.println(n1.compareTo(n2));       
        System.out.println(n1.equalsIgnoreCase(n2));
        int x = 10;
        String xStr = String.valueOf(x);
        x = x + 1;
        System.out.println(xStr);
        System.out.println(x);
        xStr = xStr + "1";
        System.out.println(xStr);
        String tex = "hoy no es martes";
        int pos = tex.indexOf("no", 0);
        System.out.println("Posición: " + pos);
        String word = " hola ";
        System.out.println("Longitud word: " + word.length());
        word = word.trim();
        System.out.println("Longitud word: " + word.length());
        char c = tex.charAt(4);
        System.out.println("Carácter: " + c);
        System.out.println("ASCII c: " + (int)c);
        System.out.println("ASCII A: " + (int)'A');
    }
}