public class SudokuSpace {
    private final int expectedValue;
    private Integer actualValue;
    private final boolean fixed;

    public SudokuSpace(int expectedValue, boolean fixed) {
        this.expectedValue = expectedValue;
        this.fixed = fixed;
        this.actualValue = fixed ? expectedValue : null;
    }

    public int getExpectedValue() {
        return expectedValue;
    }

    public Integer getActualValue() {
        return actualValue;
    }

    public void setActualValue(Integer actualValue) {
        if (!fixed) {
            this.actualValue = actualValue;
        }
    }

    public boolean isFixed() {
        return fixed;
    }

    public void clear() {
        if (!fixed) {
            this.actualValue = null;
        }
    }

    public boolean isCorrect() {
        return actualValue != null && actualValue == expectedValue;
    }
}
