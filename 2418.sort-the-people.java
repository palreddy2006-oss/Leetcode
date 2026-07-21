class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
          ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        for (int i = 0; i < heights.length; i++) {
            list.add(heights[i]);
            map.put(heights[i], names[i]);
        }

        Collections.sort(list);

        String[] ans = new String[names.length];
        int index = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            ans[index++] = map.get(list.get(i));
        }

        return ans;
    }
}