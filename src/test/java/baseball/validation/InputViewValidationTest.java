package baseball.validation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static baseball.constant.ErrorConstant.ERROR_NOT_VALID_GAME_COMMAND;
import static org.assertj.core.api.Assertions.*;

class InputViewValidationTest {

    @ParameterizedTest
    @ValueSource(strings = {"23", "3uh", "i", " ", "", "112", "0", "012"})
    void 입력받은_숫자_예외_검증(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> InputViewValidation.checkNumberValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "347", "789", "472"})
    void 입력_숫자_올바른경우_검증(String input) {
        assertThatCode(() -> InputViewValidation.checkNumberValid(input))
                .doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"22", "h", " ", "",})
    void 재시작_여부_명령어_예외_검증(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> InputViewValidation.checkCommandValid(input))
                .withMessageStartingWith(ERROR_NOT_VALID_GAME_COMMAND);
    }

    @ParameterizedTest
    @ValueSource(strings = {"2", "1"})
    void 재시작_여부_명령어_올바른경우_검증(String input) {
        assertThatCode(() -> InputViewValidation.checkCommandValid(input))
                .doesNotThrowAnyException();
    }
}