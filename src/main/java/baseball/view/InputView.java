package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static baseball.constant.MessageConstant.MESSAGE_INPUT_NUMBER;

public class InputView {

    public String inputNumber() {
        System.out.print(MESSAGE_INPUT_NUMBER);
        String userNumber = Console.readLine();
        return userNumber;
    }
}
