package com.company;

/* leetcode 37. 解数独
    * date 2019/09/27
    * link https://leetcode-cn.com/problems/sudoku-solver/
    * desc:
    * 编写一个程序，通过已填充的空格来解决数独问题。
    *
    * 一个数独的解法需遵循如下规则：
    *
    * 数字 1-9 在每一行只能出现一次。
    * 数字 1-9 在每一列只能出现一次。
    * 数字 1-9 在每一个以粗实线分隔的 3x3 宫内只能出现一次。
    * 空白格用 '.' 表示。
    *
    * Note:
    * 给定的数独序列只包含数字 1-9 和字符 '.' 。
    * 你可以假设给定的数独只有唯一解。
    * 给定数独永远是 9x9 形式的。
    *
    */
public class text013 {
    public static void main(String[] args) {
        //测试用例：
        char[][] arr = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},

                {'8', '3', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},

                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        for (char[] chars : arr) {
            String str = " ";
            for (char c : chars) {
                str += String.valueOf(c) + ' ';
            }
            System.out.println(str);
        }
    }


    public static void solveSudoku(char[][] board) {
        char[][] flag = board; //记录一下原始数组，确保回溯法不会改变原始数组

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (flag[i][j] != '.') continue; //原始数组的值不能改变，直接跳过。
                for (char k = 1; k < 10; k++) {
                    if (isInsert(board, i, j, k)) { //满足数独插入条件
                        board[j][j] = (char) (k + '0');
                    } else {  //不满足条件 回溯
                        for (int x = i; x > 0; x--) {

                        }
                    }
                }
            }
        }
    }

    public static void back(char[][] board, int i, int j) {

    }

    /**
     * 判断在i行j列能不能插入value值
     * 需要满足三个条件：
     * 1.在i行不能存在value
     * 2.在j行不能存在value
     * 3.在3*3小方块内不能存在value
     *
     * @param board
     * @param i
     * @param j
     * @param value
     * @return
     */
    public static boolean isInsert(char[][] board, int i, int j, int value) {
        for (int x = 0; x < 9; x++) {

            //判断行内是否有相同的
            if (board[i][x] == value + '0') return false;

            //判断列内是否有相同的
            if (board[j][x] == value + '0') return false;

            //判断3*3小方块是否有相同的
            int iRemainder = i / 3;
            int jRemainder = i / 3;
            for (int m = 0; m < 3; m++) {
                for (int n = 0; n < 3; n++) {
                    if (board[iRemainder + m][jRemainder + n] == value + '0') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}