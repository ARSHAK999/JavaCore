package homwork9;

public class BraceCheckerDemo {
    public static void main(String[] args) {
        String text ="(Hello {java]2023";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}
