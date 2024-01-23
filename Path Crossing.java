class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add("0,0");
        for (char direction : path.toCharArray()) {
            if (direction == 'N') y++;
            else if (direction == 'S') y--;
            else if (direction == 'E') x++;
            else if (direction == 'W') x--;
            String currentPosition = x + "," + y;
            if (visited.contains(currentPosition)) {
                return true;
            } else {
                visited.add(currentPosition);
            }
        }
        return false;
    }
}