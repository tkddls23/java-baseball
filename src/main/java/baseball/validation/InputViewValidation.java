package baseball.validation;

public class InputViewValidation {

    private void checkInputDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                throw new IllegalArgumentException();
        }
    }
}
