package org.example;

public class URLValidator {
    public static void main(String[] args) {
        System.out.println(isValid("https://www.saucedemo.com/"));
        System.out.println(isValid("https://wwwsaucedemo.com/"));
    }
    public static String isValid(String url){
        String validValue1="http://";
        String validValue2="https://";
        int dotNumberforvalidValue1=10;
        int dotNumberforvalidValue2=11;


        boolean isValid=(url.startsWith(validValue1) & url.charAt(dotNumberforvalidValue1)=='.')
                ||(url.startsWith(validValue2) & url.charAt(dotNumberforvalidValue2)=='.');

        return (isValid?"შეიცავს ":"არ შეიცავს ")+validValue1+" ან "+validValue2+" ან/და წერტილს შესაბამის ადგილზე";
    }
}
