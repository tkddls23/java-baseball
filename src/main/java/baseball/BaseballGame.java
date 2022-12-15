package baseball;

import baseball.domain.Computer;
import baseball.view.InputView;
import baseball.view.OutputView;

import java.util.Objects;

import static baseball.constant.GameConstant.ALL_STRIKE;
import static baseball.constant.GameConstant.START_CODE;

public class BaseballGame {

    public void startProgram() {
        OutputView.printStart();
        startGame();
    }

    private void startGame() {
        Computer computer = new Computer();
        computer.generateRandomNumber();
        String gameScore = "";
        while (!gameScore.equals(ALL_STRIKE)) {
            String userNumber = InputView.readUserNumber();
            gameScore = computer.getHint(userNumber);
            OutputView.printResult(gameScore);
        }
        endGame();
    }

    private void endGame() {
        OutputView.printEnd();
        String gameCommand = InputView.readGameCommand();
        if (gameCommand.equals(START_CODE)) {
            startGame();
        }
    }
}
