package number16;

public class Main {
    public static void main(String[] args) {
        int[][] map = {
                {1, 1, 1, 0, 0},
                {0, 1, 1, 0, 1},
                {0, 1, 0, 1, 0}
        };
        Voyager dfsVoyager = new DfsVoyager();
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

