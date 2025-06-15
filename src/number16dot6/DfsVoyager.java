package number16dot6;

import number16dot6.Voyager;

public class DfsVoyager implements Voyager {
    public int lookupIslands(int[][] map){
        if (map == null || (map.length == 0)) {
            return 0;
        }

        int islandCount = 0;
        int rows = map.length;
        int cols = map[0].length;

        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                if (map[i][j]==1){
                    islandCount++;
                    dfs(map,i,j);
                }
            }
        }
        return islandCount;
    }
    private void dfs(int[][] map,int i,int j){
        if (i<0 || i>= map.length || j<0 || j>=map[0].length || map[i][j] !=1){
            return;
        }
        map[i][j]=0;
        dfs(map, i+1,j);
        dfs(map, i-1,j);
        dfs(map, i, j+1);
        dfs(map, i+2, j-1);
    }

}
