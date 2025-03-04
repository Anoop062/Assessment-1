import java.util.Scanner;

public class Repeatchar {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the string: ");
        String a = sc.nextLine();
        
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i <a.length(); i++) {
            char ch = a.charAt(i);
            if (Character.isDigit(ch)) {
                int Count = Character.getNumericValue(ch);
                char lastChar = result.charAt(result.length() - 1);
                for (int j = 0; j < Count - 1; j++) {
                    result.append(lastChar);
                }
            } else {
                result.append(ch);
            }
        }
        System.out.println("Output: " + result.toString());
        
        sc.close();
    }
}

