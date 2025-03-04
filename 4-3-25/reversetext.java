public class reverseText {
    public static void main(String[] args) {
        String a = "I love java programming";
        String x = text(a);
        System.out.println(x);
    }

    public static String text(String str) {
        String[] n = str.split(                                                                                                                                           " ");
        StringBuilder reverse = new StringBuilder();
        for (int i = n.length - 1; i >= 0; i--) {
            reverse.append(n[i]);
            if (i != 0) {
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
