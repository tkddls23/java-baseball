package baseball.constant;

public class GameConstant {

    public static final int CNT_NUMBER = 3;
    public static final int MIN_NUMBER = 1;
    public static final int MAX_NUMBER = 9;

    public static final String REGAX_NUMBER = "^[" + MIN_NUMBER + "-" + MAX_NUMBER + "]*$";

    public static final String START_CODE = "1";
    public static final String EXIT_CODE = "2";

    public static final String BALL = "볼 ";
    public static final String STRIKE = "스트라이크";
    public static final String NOTHING = "낫싱";
    public static final String ALL_STRIKE = CNT_NUMBER +"스트라이크";
}
