import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zch
 * @description 岛屿的数量
 * @link https://leetcode-cn.com/problems/number-of-islands/submissions/
 * @date 2020/4/16 16:34
 */
public class N0200NumberOfIslands {

    /**
     * 广度搜索
     *
     * @param grid
     * @return
     */
    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0; //岛屿的数量
        int Y = grid.length; //水域的高度
        int X = grid[0].length; //水域的宽度

        //遍历每个区域 x y 代表其坐标。
        for (int y = 0; y < Y; y++) {
            for (int x = 0; x < X; x++) {
                //找到陆地后 “炸了”， 岛屿数量+1，广度搜索旁边陆地，也“炸了”
                if (grid[y][x] == '1') {
                    grid[y][x] = '0';
                    count++;
                    Queue<Integer> queue = new LinkedList<>();
                    // y * X + x 表示每个坐标的唯一标号
                    queue.add(y * X + x);
                    while (!queue.isEmpty()) {
                        //将头部的岛屿移除，并返回他的编号
                        int number = queue.remove();
                        //根据编号计算坐标
                        int x1 = number % X;
                        int y1 = number / X;
                        //把该坐标周围的陆地都找出来 并炸了
                        if (y1 - 1 >= 0 && grid[y1 - 1][x1] == '1') {
                            queue.add((y1 - 1) * X + x1);
                            grid[y1 - 1][x1] = '0';
                        }
                        if (y1 + 1 < Y && grid[y1 + 1][x1] == '1') {
                            queue.add((y1 + 1) * X + x1);
                            grid[y1 + 1][x1] = '0';
                        }
                        if (x1 - 1 >= 0 && grid[y1][x1 - 1] == '1') {
                            queue.add(y1 * X + (x1 - 1));
                            grid[y1][x1 - 1] = '0';
                        }
                        if (x1 + 1 < X && grid[y1][x1 + 1] == '1') {
                            queue.add(y1 * X + x1 + 1);
                            grid[y1][x1 + 1] = '0';
                        }
                    }
                }
            }
        }
        return count;
    }


    /*************深度搜索*********************/

    public static void dfs(char[][] grid, int x, int y) {
        if(x < 0 || y < 0 || y >= grid.length || x >= grid[0].length || grid[y][x] == '0' ){
            return;
        }
        grid[y][x] = '0';
        dfs(grid, x-1, y);
        dfs(grid, x+1, y);
        dfs(grid, x, y-1);
        dfs(grid, x, y+1);
    }

    /**
     * 深度搜索
     * @param grid
     * @return
     */
    public static int numIslands2(char[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int count = 0; //岛屿的数量
        int Y = grid.length; //水域的高度
        int X = grid[0].length; //水域的宽度

        //遍历每个区域 x y 代表其坐标。
        for (int y = 0; y < Y; y++) {
            for (int x = 0; x < X; x++) {
                if (grid[y][x] == '1') {
                    count++;
                    dfs(grid, x, y);
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {


        char[][] arr = {{'1', '1', '1', '1', '1', '1', '1'},
                {'0', '0', '0', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '1', '0', '1'},
                {'1', '0', '0', '0', '1', '0', '1'},
                {'1', '0', '1', '0', '1', '0', '1'},
                {'1', '0', '1', '1', '1', '0', '1'},
                {'1', '1', '1', '1', '1', '1', '1'}};

        System.out.println(numIslands2(arr));
    }
}
