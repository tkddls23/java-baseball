package baseball.view;

import baseball.validation.InputViewValidation;
import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.MessageConstant.MESSAGE_INPUT_EXIT;
import static baseball.constant.MessageConstant.MESSAGE_INPUT_NUMBER;

public class InputView {

    /**
     * 서로 다른 세자리 수를 입력 받는다.
     */
    public static String readUserNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
        String userNumber = Console.readLine();
        InputViewValidation.checkNumberValid(userNumber);
        return userNumber;
    }

    /**
     * 재시작 여부(1:시작,2:종료)를 입력 받는다.
     */
    public static String readGameCommand() {
        System.out.println(MESSAGE_INPUT_EXIT);
        String command = Console.readLine();
        InputViewValidation.checkCommandValid(command);
        return command;
    }
}
