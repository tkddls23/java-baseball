package baseball.view;

import baseball.validation.InputViewValidation;
import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.MessageConstant.MESSAGE_INPUT_EXIT;
import static baseball.constant.MessageConstant.MESSAGE_INPUT_NUMBER;

public class InputView {

    public String readUserNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
        String userNumber = Console.readLine();
        InputViewValidation.checkInputValid(userNumber);
        return userNumber;
    }

    public String readGameCommand() {
        System.out.println(MESSAGE_INPUT_EXIT);
        String command = Console.readLine();
        return command;
    }
}
