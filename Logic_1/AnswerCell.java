package Logic_1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isMorning && isMorning && isAsleep) {
            return false;
        }
        return ((isMorning && isMom) || (!isMorning && !isMorning && !isAsleep));
    }
}
