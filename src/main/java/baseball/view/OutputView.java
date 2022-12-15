package baseball.view;

import static baseball.constant.MessageConstant.MESSAGE_OUTPUT_START;
import static baseball.constant.MessageConstant.MESSAGE_OUTPUT_SUCCESS;

public class OutputView {

    /**
     * 게임 시작 문구 출력
     */
    public void printStart() {
        System.out.println(MESSAGE_OUTPUT_START);
    }

    /**
     * 게임 종료 문구 출력
     */
    public void printEnd() {
        System.out.println(MESSAGE_OUTPUT_SUCCESS);
    }
}
