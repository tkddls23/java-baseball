package baseball.view;

import baseball.validation.InputViewValidation;
import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.MessageConstant.MESSAGE_INPUT_NUMBER;

public class InputView {

    public String inputNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
        String input = Console.readLine();
        InputViewValidation.checkInputValid(input);
        return input;
    }
}
