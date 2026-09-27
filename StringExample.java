public class StringExample{
    public static void main(String[]args){
        String str="Hello Java";
        System.out.println("original string:"+str);
        System.out.println("length:"+str.length());
        System.out.println("uppercase:"+str.toUpperCase());
        System.out.println("lowercase:"+str.toLowerCase());
        System.out.println("character at index 1:"+str.charAt(1));
        System.out.println("substring:"+str.substring(6));
        System.out.println("contains java:"+str.contains("Java"));
        System.out.println("replace:"+str.replace("Java","World"));
        System.out.println("equals:"+str.equals("Hello Java"));
    }
}