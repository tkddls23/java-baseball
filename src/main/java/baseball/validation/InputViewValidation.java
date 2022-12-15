package baseball.validation;

import static baseball.constant.ErrorConstant.ERROR_NON_INTEGER;
import static baseball.constant.ErrorConstant.ERROR_NOT_VALID_LENGTH;

public class InputViewValidation {

    private void checkInputDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                throw new IllegalArgumentException(ERROR_NON_INTEGER);
        }
    }

    private void checkInputLengthThree(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException(ERROR_NOT_VALID_LENGTH);
        }
    }
}
