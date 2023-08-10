import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        // Create a map to store the indegree (number of incoming edges) for each vertex
        Map<Integer, Integer> indegree = new HashMap<>();
        // Loop through the list of edges and update the indegree map
        for (List<Integer> edge: edges) {
            // second element of the edge list is the end vertex
            int end = edge.get(1);
            // Increment indegree for the end vertex using getOrDefault
            indegree.put(end, indegree.getOrDefault(end, 0)+ 1);
        }
        // Create a list to store the result (vertices with indegree 0)
        List<Integer> result = new ArrayList<>();
        // Loop through all vertices from 0 to n-1
        for (int i = 0; i < n; i++) {
            // If the vertex is not present in the indegree map, it has indegree of 0   
            if (!indegree.containsKey(i)) {
                // add it to the result list 
                result.add(i);
            }
        }
        // return the list of vertices with indegree of 0 meaning no incoming edges
        return result;
    }
}