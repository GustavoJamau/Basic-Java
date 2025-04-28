import javax.swing.*;
import java.awt.*;

public class SudokuGUI extends JFrame {
    private final SudokuBoard sudokuBoard;
    private final JTextField[][] cells = new JTextField[9][9];

    public SudokuGUI() {
        setTitle("Sudoku Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 600);
        setLayout(new BorderLayout());

        int[][] initialBoard = {
            {5,3,0, 0,7,0, 0,0,0},
            {6,0,0, 1,9,5, 0,0,0},
            {0,9,8, 0,0,0, 0,6,0},

            {8,0,0, 0,6,0, 0,0,3},
            {4,0,0, 8,0,3, 0,0,1},
            {7,0,0, 0,2,0, 0,0,6},

            {0,6,0, 0,0,0, 2,8,0},
            {0,0,0, 4,1,9, 0,0,5},
            {0,0,0, 0,8,0, 0,7,9}
        };

        sudokuBoard = new SudokuBoard(initialBoard);

        JPanel boardPanel = new JPanel(new GridLayout(9, 9));

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                JTextField cell = new JTextField();
                cells[row][col] = cell;
                SudokuSpace space = sudokuBoard.getBoard().get(row).get(col);

                if (space.isFixed()) {
                    cell.setText(String.valueOf(space.getExpectedValue()));
                    cell.setEditable(false);
                    cell.setBackground(Color.LIGHT_GRAY);
                } else {
                    cell.setHorizontalAlignment(JTextField.CENTER);
                    cell.setFont(new Font("Arial", Font.BOLD, 20));
                }

                boardPanel.add(cell);
            }
        }

        JPanel controlPanel = new JPanel();
        JButton checkButton = new JButton("Checar");
        JButton resetButton = new JButton("Resetar");

        checkButton.addActionListener(e -> checkBoard());
        resetButton.addActionListener(e -> resetBoard());

        controlPanel.add(checkButton);
        controlPanel.add(resetButton);

        add(boardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private void checkBoard() {
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (!sudokuBoard.getBoard().get(row).get(col).isFixed()) {
                    String text = cells[row][col].getText();
                    if (text.matches("\\d")) {
                        sudokuBoard.setValue(row, col, Integer.parseInt(text));
                    } else {
                        sudokuBoard.clearValue(row, col);
                    }
                }
            }
        }

        if (sudokuBoard.isComplete()) {
            JOptionPane.showMessageDialog(this, "Parabéns! Você completou o Sudoku!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Ainda há erros ou espaços vazios!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void resetBoard() {
        sudokuBoard.reset();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (!sudokuBoard.getBoard().get(row).get(col).isFixed()) {
                    cells[row][col].setText("");
                }
            }
        }
    }
}
