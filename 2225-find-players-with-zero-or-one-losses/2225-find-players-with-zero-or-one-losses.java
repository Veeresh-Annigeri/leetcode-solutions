class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<List<Integer>> result = new LinkedList<>();

        for(int[] n: matches){
            hashMap.put(n[0], hashMap.getOrDefault(n[0], 0));
            hashMap.put(n[1], hashMap.getOrDefault(n[1], 0) + 1);
        }
        List<Integer> zeroLoss  = new ArrayList<>();
        List<Integer> oneLoss  = new ArrayList<>();

        for(Map.Entry<Integer, Integer> map : hashMap.entrySet()){
            if(map.getValue() == 0) zeroLoss.add(map.getKey());
            if(map.getValue() == 1) oneLoss.add(map.getKey());
        }

        Collections.sort(zeroLoss);
        Collections.sort(oneLoss);
        result.add(zeroLoss);
        result.add(oneLoss);

        return result;
    }
}