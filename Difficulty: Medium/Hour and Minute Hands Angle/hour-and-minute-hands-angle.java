class Solution {
    public double getAngle(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));

        h = h % 12;

        double hourAngle = (h * 30.0) + (m * 0.5);
        double minuteAngle = m * 6.0;

        double diff = Math.abs(hourAngle - minuteAngle);

        return Math.min(diff, 360.0 - diff);
    }
}