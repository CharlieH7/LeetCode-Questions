import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    list.add(1);
                } else {
                    list.add(pascalTriangle.get(i - 2).get(j) + pascalTriangle.get(i - 2).get(j - 1));
                }
            }
            pascalTriangle.add(list);
        }
        return pascalTriangle;
    }
}