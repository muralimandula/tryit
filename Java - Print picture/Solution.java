import java.util.*;

class Percolation {
 char[][] grid;
 public Percolation(final int n) {
     grid = new char[n][n];
 }
 public void openSite(final int x, final int y) {
     grid[x - 1][y - 1] = 'X';
 }
 public void printGrid() {
   System.out.println(Arrays.deepToString(grid));
 }
}

public class Solution {
 public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int noOflines = s.nextInt();
     Percolation obj = new Percolation(noOflines);
     System.out.println("\n");
     int i = 0;
     for(char[] eachrow : obj.grid) {
         int j = 0;
         for(char eachelement : eachrow) {
             obj.grid[i][j] = '-';
             j++;
         }
         i++;
     }
     System.out.println("\n");
     while(s.hasNext()) {
         obj.openSite(s.nextInt(), s.nextInt());
     }
     System.out.println("\n");
     for(char[] eachrow : obj.grid) {
         for(char eachelement : eachrow) {
         System.out.print(eachelement + " ");
         }
         System.out.println("");
     }
 }
}