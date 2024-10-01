package org.example;

public class Table {

    private int rows;
    private  int cols;
    private int[][] cells;

    public  Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.cells = new int[rows][cols];
        // Java иницализ. нулями по умолчанию
    }

    public int getValue(int row, int col) {
        return cells[row][col];
    }

    public void setValue(int row, int col, int value) {
        cells[row][col] = value;
    }

    public int rows() {
        return this.rows;
    }

    public int cols() {
        return this.cols;
    }

    public String toString() {
        StringBuilder tableToString = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                tableToString.append(cells[i][j]);
                tableToString.append(' ');
            }
        }
        return tableToString.toString();
    }

    public double average() {
        double sum = 0, amount = this.rows * this.cols;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += cells[i][j];
            }
        }

        return (sum / amount);
    }
}
