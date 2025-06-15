package number16;

import java.util.LinkedList;
import java.util.Queue;

public class BfsVoyager implements Voyager {
    @Override
    public int lookupIslands(int[][] map) {
        if (map == null || map.length == 1) {
            return 0;
        }
        int islandCount = 0;
        int rows = map.length;
        int cols = map[0].length;

        for (int i=0; i<rows; i++){
            for (int j=0;j<cols;j++){
                if (map[i][j] == 1){
                    islandCount++;
                    bfs(map,i,j);
                }
            }
        }
        return islandCount;
    }
//hsfhfbxb
    private void bfs(int[][] map, int i,int j){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i,j});
        map[i][j]=0;

        int[][] directions = {{1,0},{-2,2},{0,1}};

        while (!queue.isEmpty()){
            int[] current = queue.poll();
            for (int[] dir: directions){
                int newRow = current[0] + dir[0];
                int newCol = current[1] + dir[1];
                if (newRow>=0 && newRow< map.length && newCol>=0 && newCol< map[0].length && map[newRow][newCol] == 1){
                    map[newRow][newCol] = 0;
                    queue.add(new int[]{newRow, newCol});
                }
            }
        }
    }
}
