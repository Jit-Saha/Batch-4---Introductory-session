//Code by Jit Saha
public class StringOps {
    public static void main(String args[]){
        String str1 = "Jit", str2 = "Saha";
        System.out.println("String Operations:\nLength of str1: "+str1.length()+"\nConcatination: "+str1+" "+str2+
        "\nUpperCase: "+str1.toUpperCase()+"\nLowerCase: "+str2.toLowerCase()+"\nIndex of: "+str2.indexOf("a"));
        if(str1.length() >3){
            System.out.println("Greater");
        }
        else{
            System.out.println("Not Greater");
        }
    }
}
