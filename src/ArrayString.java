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

    public  static String[] getArrayStringsGivenLength(String[] inputArray, int stringLength){
        int countr = 0;
        for (String s: inputArray){
            if (s.length() <= stringLength & !s.equals("")){
                countr++;
            }
        }
        String[] outArray = new String[countr];
        for (int i = 0,j = 0; i <inputArray.length; i++)
            if (inputArray[i].length() <= stringLength & !inputArray[i].equals("")){
                outArray[j] = inputArray[i];
                j++;
            }
        return  outArray;
    }
}
