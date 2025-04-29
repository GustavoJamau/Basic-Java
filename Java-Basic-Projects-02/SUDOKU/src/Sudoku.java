import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Sudoku extends JFrame {
    private static final int SIZE = 9;
    private final JTextField[][] cells = new JTextField[SIZE][SIZE];

    // Tabuleiro inicial
    private final int[][] board = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };

    // Solução correta
    private int[][] solucao = {
        {5, 3, 4, 6, 7, 8, 9, 1, 2},
        {6, 7, 2, 1, 9, 5, 3, 4, 8},
        {1, 9, 8, 3, 4, 2, 5, 6, 7},
        {8, 5, 9, 7, 6, 1, 4, 2, 3},
        {4, 2, 6, 8, 5, 3, 7, 9, 1},
        {7, 1, 3, 9, 2, 4, 8, 5, 6},
        {9, 6, 1, 5, 3, 7, 2, 8, 4},
        {2, 8, 7, 4, 1, 9, 6, 3, 5},
        {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };

    public Sudoku() {
        setTitle("Sudoku");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel gridPanel = new JPanel(new GridLayout(SIZE, SIZE));
        Font font = new Font("SansSerif", Font.BOLD, 20);

        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                JTextField cell = new JTextField();
                cell.setHorizontalAlignment(JTextField.CENTER);
                cell.setFont(font);

                if (board[row][col] != 0) {
                    cell.setText(String.valueOf(board[row][col]));
                    cell.setEditable(false);
                    cell.setBackground(new Color(220, 220, 220));
                } else {
                    int r = row;
                    int c = col;

                    cell.addKeyListener(new KeyAdapter() {
                        @Override
                        public void keyReleased(KeyEvent e) {
                            String text = cell.getText();
                            if (text.matches("[1-9]")) {
                                int num = Integer.parseInt(text);
                                if (num == solucao[r][c]) {
                                    cell.setEditable(false);
                                    cell.setBackground(new Color(144, 238, 144)); // verde claro
                                } else {
                                    cell.setBackground(new Color(255, 182, 193)); // vermelho claro
                                }
                            } else {
                                cell.setBackground(Color.WHITE);
                            }
                        }
                    });
                }

                cells[row][col] = cell;
                gridPanel.add(cell);
            }
        }

        JButton verificarBtn = new JButton("Verificar Tudo");
        verificarBtn.addActionListener(e -> verificarSolucao());

        add(gridPanel, BorderLayout.CENTER);
        add(verificarBtn, BorderLayout.SOUTH);
    }

    private void verificarSolucao() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                if (!cells[row][col].isEditable()) continue;
                String text = cells[row][col].getText();
                if (text.matches("[1-9]")) {
                    int num = Integer.parseInt(text);
                    if (num == solucao[row][col]) {
                        cells[row][col].setEditable(false);
                        cells[row][col].setBackground(new Color(144, 238, 144));
                    } else {
                        cells[row][col].setBackground(new Color(255, 182, 193));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Sudoku().setVisible(true));
    }
}
