public class PangramChecker {
    final static char[] ALPHABET = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public boolean isPangram(String input) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        for (char c : ALPHABET) {
            if (input.toLowerCase().indexOf(c) == -1) {
                return false;
            }
        }
        return true;
    }

}
