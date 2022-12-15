package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;

public class Computer {
    private List<Integer> computerNumbers;

    public void generateRandomNumber() {
        this.computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < CNT_NUMBER) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);

            if (!computerNumbers.contains(randomNumber)) {
                this.computerNumbers.add(randomNumber);
            }
        }
    }
}
