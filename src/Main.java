import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] input = ArrayString.getArrayFromUser();
        System.out.println(Arrays.toString(input));
        String[] output = ArrayString.getArrayStringsGivenLength(input,3);
        System.out.println(Arrays.toString(output));
    }
}