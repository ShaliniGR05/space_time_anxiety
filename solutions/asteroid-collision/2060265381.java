class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> res = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0) {
                res.push(asteroids[i]);
            } 
            else {
                while (!res.isEmpty() && res.peek() > 0 && res.peek() < Math.abs(asteroids[i])) {
                    res.pop();
                }
                if (res.isEmpty() || res.peek() < 0) {
                    res.push(asteroids[i]);
                } else if (res.peek() == Math.abs(asteroids[i])) {
                    res.pop();
                }
            }
        }

        int[] result = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        return result;
    }
}