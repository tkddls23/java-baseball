package baseball.validation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class InputViewValidationTest {

    @ParameterizedTest
    @ValueSource(strings = {"23", "3uh", "i", " ", "", "112", "0", "012"})
    void 입력받은_숫자_예외_검증(String input) {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> InputViewValidation.checkInputValid(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "347", "789", "472"})
    void 입력_숫자_올바른경우_검증(String input) {
        assertThatCode(() -> InputViewValidation.checkInputValid(input))
                .doesNotThrowAnyException();
    }
}