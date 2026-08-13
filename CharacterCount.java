import java.util.Scanner;

class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String[] words = input.split(" ");

        for (String word : words) {
            char ch = word.charAt(0);
            int count = word.length();

            System.out.print(ch + "" + count);
        }
    }
}