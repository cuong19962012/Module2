package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {
    private static final char MID_SCORE_CHAR = '-';
    private static final int ADD_ADVANTAGE_SCORE = 1;
    private static final int WIN_DISTANCE_ADVANTAGE_SCORE = 2;
    private static final int MINUS_ADVANTAGE_SCORE = -1;
    private static final int SCORE_OF_0 = 0;
    private static final int SCORE_OF_15 = 1;
    private static final int SCORE_OF_30 = 2;
    private static final int SCORE_OF_40 = 3;
    private static final int ADVANTAGE_START_SCORE = 4;
    private static final String CALL_0_SCORE = "Love";
    private static final String CALL_1_SCORE = "Fifteen";
    private static final String CALL_2_SCORE = "Thirty";
    private static final String CALL_3_SCORE = "Forty";
    private static final String CALL_DEUCE = "Deuce";

    /**
     *
     * @param firstPlayerScore
     * @param secondPlayerScore
     * @return Score
     *
     */
    public static String getScore(int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        int scoreIfNotDeuce = 0;
        if (firstPlayerScore == secondPlayerScore) {
            score = getScoreIfDeuce(firstPlayerScore);
        } else if (firstPlayerScore >= ADVANTAGE_START_SCORE || secondPlayerScore >= ADVANTAGE_START_SCORE) {
            int advantageScore = firstPlayerScore - secondPlayerScore;
            if (advantageScore == ADD_ADVANTAGE_SCORE)
                score = "Advantage player1";
            else if (advantageScore == MINUS_ADVANTAGE_SCORE)
                score = "Advantage player2";
            else if
            (advantageScore >= WIN_DISTANCE_ADVANTAGE_SCORE) score = "Win for player1";
            else
                score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1)
                    scoreIfNotDeuce = firstPlayerScore;
                else {
                    score += MID_SCORE_CHAR;
                    scoreIfNotDeuce = secondPlayerScore;
                }
                score = getScoreIfNotDeuce(score, scoreIfNotDeuce);
            }
        }
        return score;
    }

    /**
     *
     * @param score
     * @param tempScore
     * @return StringScore
     */
    private static String getScoreIfNotDeuce(String score, int tempScore) {
        switch (tempScore) {
            case SCORE_OF_0:
                score += CALL_0_SCORE;
                break;
            case SCORE_OF_15:
                score += CALL_1_SCORE;
                break;
            case SCORE_OF_30:
                score += CALL_2_SCORE;
                break;
            case SCORE_OF_40:
                score += CALL_3_SCORE;
                break;
        }
        return score;
    }

    /**
     *
     * @param playerScore
     * @return StringScore
     */
    private static String getScoreIfDeuce(int playerScore) {
        String score;
        switch (playerScore) {
            case SCORE_OF_0:
                score = CALL_0_SCORE + "-All";
                break;
            case SCORE_OF_15:
                score = CALL_1_SCORE + "-All";
                break;
            case SCORE_OF_30:
                score = CALL_2_SCORE + "-All";
                break;
            case SCORE_OF_40:
                score = CALL_3_SCORE + "-All";
                break;
            default:
                score = CALL_DEUCE;
                break;

        }
        return score;
    }
}
