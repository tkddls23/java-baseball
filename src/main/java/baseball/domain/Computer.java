package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

import static baseball.constant.GameConstant.*;

public class Computer {
    private List<Integer> computerNumbers;
    private List<Integer> scores;

    public List<Integer> getComputerNumbers() {
        return this.computerNumbers;
    }

    public void generateTestNumber(List<Integer> testNumbers) {
        this.computerNumbers = testNumbers;
    }

    public void generateRandomNumber() {
        this.computerNumbers = new ArrayList<>();
        while (computerNumbers.size() < CNT_NUMBER) {
            int randomNumber = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);

            if (!computerNumbers.contains(randomNumber)) {
                this.computerNumbers.add(randomNumber);
            }
        }
    }

    public String getHint(String userNumber) {
        calculateScore(userNumber);
        StringBuilder hint = new StringBuilder();
        if (scores.get(0) == 0 && scores.get(1) == 0) {
            return NOTHING;
        }
        if (scores.get(0) > 0) {
            hint.append(scores.get(0)).append(BALL);
        }
        if (scores.get(1) > 0) {
            hint.append(scores.get(1)).append(STRIKE);
        }
        return hint.toString();
    }

    private void calculateScore(String userNumber) {
        int ballCount = getBallCount(userNumber);
        int strikeCount = getStrikeCount(userNumber);

        this.scores = List.of(ballCount - strikeCount, strikeCount);
    }

    private int getBallCount(String userNumber) {
        int ballCount = 0;

        for (int i = 0; i < CNT_NUMBER; i++) {
            if (computerNumbers.contains(Character.getNumericValue(userNumber.charAt(i))))
                ballCount ++;
        }
        return ballCount;
    }

    private int getStrikeCount(String userNumber) {
        int strikeCount = 0;

        for (int i = 0; i < CNT_NUMBER; i++) {
            if (computerNumbers.get(i) == (Character.getNumericValue(userNumber.charAt(i))))
                strikeCount += 1;
        }
        return strikeCount;
    }
}
