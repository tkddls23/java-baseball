package baseball.validation;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static baseball.constant.ErrorConstant.*;
import static baseball.constant.GameConstant.*;

public class InputViewValidation {
    private static final Pattern isNumber = Pattern.compile(REGAX_NUMBER);

    public static void checkNumberValid(String userNumber) {
        checkInputDigit(userNumber);
        checkInputLengthThree(userNumber);
        checkInputRange(userNumber);
        checkInputDuplicate(userNumber);
    }
    public static void checkCommandValid(String command) {
        if (!command.equals(START_CODE) && !command.equals(EXIT_CODE)) {
            throw new IllegalArgumentException(ERROR_NOT_VALID_GAME_COMMAND);
        }
    }

    private static void checkInputDigit(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (!Character.isDigit(input.charAt(i)))
                throw new IllegalArgumentException(ERROR_NON_INTEGER);
        }
    }

    private static void checkInputLengthThree(String input) {
        if (input.length() != CNT_NUMBER) {
            throw new IllegalArgumentException(ERROR_NOT_VALID_LENGTH);
        }
    }

    private static void checkInputRange(String input) {
        if (!isNumber.matcher(input).matches()) {
            throw new IllegalArgumentException(ERROR_NOT_VALID_RANGE);
        }
    }

    private static void checkInputDuplicate(String input) {
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            set.add(input.charAt(i));
        }
        if (set.size() != input.length()) {
            throw new IllegalArgumentException(ERROR_INPUT_DUPLICATE);
        }
    }
}
