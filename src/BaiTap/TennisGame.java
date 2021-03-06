package BaiTap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore=0;
        if (m_score1==m_score2)
        {
            score = getString(m_score1);
        }
        else if (m_score1>=4 || m_score2>=4)
        {

            score = getString(m_score1, m_score2);
        }
        else
        {
            for (int i=1; i<3; i++)
            {
                score = getString(m_score1, m_score2, score, i);
            }
        }
        return score;
    }

    private static String getString(int m_score1, int m_score2, String score, int i) {
        int tempScore;
        if (i ==1) tempScore = m_score1;
        else { score +="-"; tempScore = m_score2;}
        score = getString(score, tempScore);
        return score;
    }

    private static String getString(int m_score1, int m_score2) {
        String score;
        if (getMinusResult(m_score1, m_score2)==1) score ="Advantage player1";
        else if (getMinusResult(m_score1, m_score2) ==-1) score ="Advantage player2";
        else if (getMinusResult(m_score1, m_score2)>=2) score = "Win for player1";
        else score ="Win for player2";
        return score;
    }

    private static int getMinusResult(int m_score1, int m_score2) {
        return m_score1 - m_score2;
    }

    private static String getString(String score, int tempScore) {
        switch(tempScore)
        {
            case 0:
                score +="Love";
                break;
            case 1:
                score +="Fifteen";
                break;
            case 2:
                score +="Thirty";
                break;
            case 3:
                score +="Forty";
                break;
        }
        return score;
    }

    private static String getString(int m_score1) {
        String score;
        switch (m_score1)
        {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
