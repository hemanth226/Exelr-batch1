
import java.util.Scanner;

public class Demo26 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String Name = scanner.nextLine();

        int vowels =0, consonents = 0;

        Name = Name.toLowerCase();

        for(int i=0;i<Name.length();i++){
            char ch  = Name.charAt(i);

            if (Character.isLetter(ch)){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch == 'u' ){
                    vowels++;
                }else{
                    consonents++;
                }
                }
            }
        }System.out.println("Vowels: "+vowels);
        System.out.println("Consonents"+consonents);
}