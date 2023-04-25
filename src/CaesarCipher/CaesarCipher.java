package CaesarCipher;
public class CaesarCipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    public String encrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char encrypted = (char) ('A' + (ch - 'A' + shift) % 26);
                    result.append(encrypted);
                } else {
                    char encrypted = (char) ('a' + (ch - 'a' + shift) % 26);
                    result.append(encrypted);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String decrypt(String message) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char ch = message.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    char decrypted = (char) ('A' + (ch - 'A' - shift + 26) % 26);
                    result.append(decrypted);
                } else {
                    char decrypted = (char) ('a' + (ch - 'a' - shift + 26) % 26);
                    result.append(decrypted);
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}






