import java.util.Scanner;

public class ArrayString {
    public static String[] getArrayFromUser(){
        System.out.println("Enter lines separated by commas.");
        Scanner scanner = new Scanner(System.in);
        String worlds = scanner.nextLine();
        String[] temp = worlds.split(",");
        String[] inpurArray = new String[temp.length];
        for (int i = 0; i < temp.length; i++) {
            inpurArray[i] = temp[i].trim();
        }
    return inpurArray;
    }
}
