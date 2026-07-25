package Array.Day_7;
// leetcode 3986
public class h {
    public int secondsBetweenTimes(String startTime, String endTime) {
        int starting_hour = Integer.parseInt(startTime.substring(0, 2));
        int starting_minute = Integer.parseInt(startTime.substring(3, 5));
        int starting_second = Integer.parseInt(startTime.substring(6, 8));
        int startSeconds = starting_hour * 3600+ starting_minute * 60 + starting_second;

        int ending_hour = Integer.parseInt(endTime.substring(0, 2));
        int ending_minute = Integer.parseInt(endTime.substring(3, 5));
        int ending_second = Integer.parseInt(endTime.substring(6, 8));
        int endSeconds = ending_hour * 3600+ ending_minute * 60 + ending_second;

        return endSeconds-startSeconds;
    }
    public static void main(String[] args) {

    }

}
