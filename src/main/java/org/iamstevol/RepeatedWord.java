package org.iamstevol;

public class RepeatedWord {

    static String hi = "ee";

    public static Runnable createRunnable(String text, int repeats) {
        return new Runnable() {
            @Override
            public void run() {
                String repeatedText = "";
                for (int i = 0; i < repeats; i++) {
                    repeatedText += text + "\n";
                }
                System.out.println(repeatedText);
            }

        };
    }

    public static void main(String[] args) {
        Runnable runnable = createRunnable("Hello!", 3);
        runnable.run();
    }
}