package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {
    private static final char MID_SCORE_CHAR = '-';
    private static final int ADD_ADVANTAGE_SCORE = 1;
    private static final int WIN_DISTANCE_ADVANTAGE_SCORE = 2;
    private static final int MINUS_ADVANTAGE_SCORE = -1;
    private static final String CALL_0_SCORE = "Love";
    private static final String CALL_1_SCORE = "Fifteen";
    private static final String CALL_2_SCORE = "Thirty";
    private static final String CALL_3_SCORE = "Forty";
    private static final String CALL_DEUCE = "Deuce";

    public static String getScoreIfDeuce(String firstPlayerName, String secondPlayerName, int firstPlayerScore, int secondPlayerScore) {
        String score = "";
        int scoreIfNotDeuce = 0;
        if (firstPlayerScore == secondPlayerScore) {
            score = getScoreIfDeuce(firstPlayerScore);
        } else if (firstPlayerScore >= 4 || secondPlayerScore >= 4) {
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

    private static String getScoreIfNotDeuce(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += CALL_0_SCORE;
                break;
            case 1:
                score += CALL_1_SCORE;
                break;
            case 2:
                score += CALL_2_SCORE;
                break;
            case 3:
                score += CALL_3_SCORE;
                break;
        }
        return score;
    }

    private static String getScoreIfDeuce(int playerScore) {
        String score;
        switch (playerScore) {
            case 0:
                score = CALL_0_SCORE + "-All";
                break;
            case 1:
                score = CALL_1_SCORE + "-All";
                break;
            case 2:
                score = CALL_2_SCORE + "-All";
                break;
            case 3:
                score = CALL_3_SCORE + "-All";
                break;
            default:
                score = CALL_DEUCE;
                break;

        }
        return score;
    }
}
