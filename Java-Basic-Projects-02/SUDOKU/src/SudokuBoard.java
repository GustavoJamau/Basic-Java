import java.util.List;
import java.util.ArrayList;

public class SudokuBoard {
    private final List<List<SudokuSpace>> board;

    public SudokuBoard(int[][] initialBoard) {
        board = new ArrayList<>();
        for (int row = 0; row < 9; row++) {
            List<SudokuSpace> boardRow = new ArrayList<>();
            for (int col = 0; col < 9; col++) {
                int value = initialBoard[row][col];
                boardRow.add(new SudokuSpace(value, value != 0));
            }
            board.add(boardRow);
        }
    }

    public List<List<SudokuSpace>> getBoard() {
        return board;
    }

    public boolean setValue(int row, int col, int value) {
        SudokuSpace space = board.get(row).get(col);
        if (!space.isFixed()) {
            space.setActualValue(value);
            return true;
        }
        return false;
    }

    public void clearValue(int row, int col) {
        SudokuSpace space = board.get(row).get(col);
        space.clear();
    }

    public boolean isComplete() {
        for (List<SudokuSpace> row : board) {
            for (SudokuSpace space : row) {
                if (!space.isCorrect()) {
                    return false;
                }
            }
        }
        return true;
    }

    public void reset() {
        for (List<SudokuSpace> row : board) {
            for (SudokuSpace space : row) {
                space.clear();
            }
        }
    }
}
