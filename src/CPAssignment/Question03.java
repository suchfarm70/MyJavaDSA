package CPAssignment;
import java.util.*;
class Question03 {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer, List<Integer>> sizeToIndices = new HashMap<>();
        
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            
            sizeToIndices.putIfAbsent(size, new ArrayList<>());
            
            sizeToIndices.get(size).add(i);
        }

        List<List<Integer>> resultGroups = new ArrayList<>();
        
        for (Map.Entry<Integer, List<Integer>> entry : sizeToIndices.entrySet()) {
            int requiredSize = entry.getKey();
            List<Integer> peopleList = entry.getValue();
            
            for (int i = 0; i < peopleList.size(); i += requiredSize) {
                
                
                List<Integer> newGroup = peopleList.subList(i, i + requiredSize);
                
                resultGroups.add(newGroup);
            }
        }

        return resultGroups;
    }
}