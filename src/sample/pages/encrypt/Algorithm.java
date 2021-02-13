package sample.pages.encrypt;

public class Algorithm {

    public String encrypt(String msg, int key) {
        StringBuilder encryptText = new StringBuilder();
        for (char c : msg.toCharArray()) {
            encryptText.append((char) (c + key));
        }
        return encryptText.toString();
    }

    public String decrypt(String msg, int key) {
        StringBuilder decryptText = new StringBuilder();
        for (char c : msg.toCharArray()) {
            decryptText.append((char) (c + key));
        }
        return decryptText.toString();
    }
}
