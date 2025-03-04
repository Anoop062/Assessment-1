public class reverse_word {
    public static void main(String[] args) {
        String a = "i love pdf";
        String output = text(a);
        System.out.println(output);
    }

    public static String text(String str) {
        String[] words = str.split(                                                                                                                                           " ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}