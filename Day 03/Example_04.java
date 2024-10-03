public class Example_04{
    public static void main(String [] args){
        String S = "my name is pranshu tiwari";
        // if we want to split a String in multiple parts then in String class have a method split() which return the string of Array.
        String [] details = s.split(" ");
        for(String s : details){
            System.out.print(s+ " ");
        }
        System.out.println();
        // Also we can make a character array from toCharArray() method.
        String I = "netajiShubhashchandrabose";
        char [] arr = T.toCharArray();
        for(char c : arr){
            System.out.print(c+ " ");
        }
        System.out.println();

        // to convert string into lowercase we have a mehtod toLowerCase() which return the String object.
        String g = I.toLowerCase();
        System.out.println(g);

        // to convert string into uppercase we have a mehtod toUpperCase() which return the String object.
        String h = I.toUpperCase();
        System.out.println(h);

        
    }
}