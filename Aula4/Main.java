
public class Main {
    public static void main(String[] args) {

        String string1 = new String();
        String string2 = new String("     Valor direto no contrutor");
        String string3 = new String(string2);

        char[] charArray = new char[] {'h','i',' ', 't', 'h', 'e', 'r', 'e'};



        System.out.println(string2.toUpperCase());
        System.out.println(string2.toLowerCase());
        System.out.println(string2.trim());
        System.out.println(string2.indexOf("y"));
        System.out.println(string2.charAt(24));

        // String(int[] codePoints, int offset, int count)
        String str =  new String(string2,3,5);
        System.out.println(str);
        


    }
}