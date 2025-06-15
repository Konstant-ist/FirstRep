package number16dot6;

import number16dot6.BfsVoyager;
import number16dot6.DfsVoyager;
import number16dot6.Voyager;

public class Main {
    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0}
        };
        number16dot6.Voyager dfsVoyager = new DfsVoyager();
        System.out.println("DFS: " + dfsVoyager.lookupIslands(map));

        int[][] map2 = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0}
        };
        Voyager bfsVoyager = new BfsVoyager();
        System.out.println("BFS: " + dfsVoyager.lookupIslands(map));
    }
}


