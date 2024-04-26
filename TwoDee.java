class TwoDee {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = 'O';
            }
        }

        board[0][1] = 'X';

        for (char[] b : board) {
            for (char item : b) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }

}
