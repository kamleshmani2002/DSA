public class Example_03{
    public static void main(String [] args){
        String s = "name";
        String v = new String("name");

        // to check a two String are equals or not we have a mehtod called equals(string) which takes the String and return the result in true or false
        boolean equal = s.equals(v);
        System.out.println("String s and v are equal "+equal);

        // for checking the index of any character or a String we have a method indexOf() which return the integer value.
        int index = s.indexOf('g');
        int index1 = v.indexOf("am");
        System.out.println("index of Character g is "+index);
        System.out.println("index of String as in "+index1);

        // for checking a string empty or not in String class have a mehtod isEmpty() which is also give result in boolean data type
        System.out.println("The String s is empty "+s.isEmpty());

        // for checking a String isBlank or not in String class have a mehtod isEmpty() which is also give result in boolean.
        System.out.println("The string v is blank "+s.isBlank());


    }
}