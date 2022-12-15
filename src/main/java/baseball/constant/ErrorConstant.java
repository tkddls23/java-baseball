package baseball.constant;

import static baseball.constant.GameConstant.*;

public class ErrorConstant {

    public static final String ERROR_NON_INTEGER = "[ERROR] 숫자가 아닙니다.";
    public static final String ERROR_NOT_VALID_LENGTH = "[ERROR] "+CNT_NUMBER+"자리가 아닙니다.";
    public static final String ERROR_NOT_VALID_RANGE = "[ERROR] "+MIN_NUMBER+"부터 "+MAX_NUMBER+"사이의 숫자가 아닙니다 .";
    public static final String ERROR_INPUT_DUPLICATE = "[ERROR] 서로 다른 수를 입력해주세요.";
    public static final String ERROR_NOT_VALID_GAME_COMMAND = "[ERROR] 올바른 명령어를 입력해주세요. (재시도: "+START_CODE+", 종료: "+EXIT_CODE+")";


}
