// in this Example we are going to learn String class methods and how we can use them.

public class Example_02{
    public static void main(String [] args){
        String S = "My name is Rahul Chauksey";
        // to get the length of the String in String class have a method length() which return the integer value
        int n = S.length();
        System.out.println("length of the string S is "+n);

        // to get a character of the particular index in String class have a method charAt(index) which return the character.
        char c = S.charAt(4);
        System.out.println("Character of the index 4 is "+c);

        // for add or concat two String in String class have a method concat() which return the new String object.
        String firstName = "Ram";
        String lastName = "Mishra";
        String fullName = firstName.concat(lastName);
        System.out.println(fullName);

        // we have a another method to add two or more String object name of the method in join(String delimeter,charsequences ..a).
        // join method help to join the String with delimeter, delimeter also String
        String Name = String.join(" ",firstName,lastName);
        System.out.println(Name);

        // for checking String is present in the String we have a method contains this method return the output in the true or false.
        String sub = "name";
        boolean su= S.contains(sub);
        System.out.println("String S contains String sub is "+ su);


    }
}