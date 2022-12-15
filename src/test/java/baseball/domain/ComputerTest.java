package baseball.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static baseball.constant.GameConstant.CNT_NUMBER;
import static org.assertj.core.api.Assertions.assertThat;

class ComputerTest {
    Computer computer = new Computer();

    @Test
    void 컴퓨터_숫자_3자리인지_검증() {
        //given
        computer.generateRandomNumber();
        List<Integer> numberList = computer.getComputerNumbers();

        //then
        assertThat(CNT_NUMBER).isEqualTo(numberList.size());
    }

    @Test
    void 컴퓨터_숫자_중복인지_검증() {
        //given
        computer.generateRandomNumber();
        List<Integer> numberList = computer.getComputerNumbers();

        //when
        Set<Integer> numSet = new HashSet<>(numberList);

        //then
        assertThat(numSet.size()).isEqualTo(numberList.size());
    }

    @ParameterizedTest
    @CsvSource(value = {"123:3스트라이크", "132:2볼 1스트라이크", "456:낫싱"}, delimiter = ':')
    void getHintTest(String input, String output) {
        computer.generateTestNumber(List.of(1, 2, 3));

        assertThat(computer.getHint(input)).isEqualTo(output);
    }
}