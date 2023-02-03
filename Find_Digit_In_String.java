import java.util.Scanner;

public class Find_Digit_In_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");

        String str=sc.nextLine();

        char[] ch=str.toCharArray();
         String digit="";

        for(int i=0;i<=ch.length-1;i++){
            if(Character.isDigit(ch[i])){
                digit+=ch[i];
            }
        }
        System.out.println("The digits are: "+digit);
    }

}
