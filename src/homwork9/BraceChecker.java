package homwork9;

public class BraceChecker {
    private String text;

    BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack stack = new Stack();
        int last;
        char lastBracket;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.print(c);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.print("Error at" + i + "closed" + c + "but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '(') {
                            System.out.print("Error at" + i + "opened" + lastBracket + "but closed" + c);
                        }
                    }
                    break;
                case '}':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.print("Error at" + i + "closed" + c + "but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != '{') {
                            System.out.print("Error at" + i + "opened" + lastBracket + "but closed" + c);

                        }
                    }
                    break;
                case ']':
                    last = stack.pop();
                    if (last == 0) {
                        System.out.print("Error at" + i + "closed" + c + "but not opened");
                    } else {
                        lastBracket = (char) last;
                        if (lastBracket != ']') {
                            System.out.print("Error at" + i + "opened" + lastBracket + "but closed" + c);

                        }
                    }
                    break;
            }
        }

    }

}