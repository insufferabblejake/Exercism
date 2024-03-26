import java.util.Arrays;

public class LogLevels {
    
    public static String message(String logLine) {
        String temp = (String) Arrays.stream(logLine.split(":")).toArray()[1];
        return temp.trim();
    }

    public static String logLevel(String logLine) {
        String temp = (String) Arrays.stream(logLine.split(":")).toArray()[0];
        temp = (String) Arrays.stream(temp.split("[\\[\\]]")).toArray()[1];
        return temp.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) +
                " " +
                "(" +
                logLevel(logLine) +
                ")";
    }
}
