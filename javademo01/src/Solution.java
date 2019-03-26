public class Solution {
    public boolean Find(int target, int [][] array) {
        int rows = 0;
        int columns = array[rows].length-1;
        while(rows<array.length && columns>=0){
            if (array[rows][columns]==target) {
                return true;
            }else if (array[rows][columns]>target) {
                columns = columns-1;
            } else {
                rows= rows+1;
                columns = array[rows].length-1;
            }
        }
        return false;
    }
}
