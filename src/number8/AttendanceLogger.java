package number8;

import java.util.*;

public class AttendanceLogger {
    private final List<VisitRecord> visits = new ArrayList<>();

   
    private static class VisitRecord {
        private final String userId;
        private final String timestamp;

        public VisitRecord(String userId, String timestamp) {
            this.userId = userId;
            this.timestamp = timestamp;
        }

        public String getUserId() {
            return userId;
        }

        public String getTimestamp() {
            return timestamp;
        }
    }


    public void logVisit(String userId, String timestamp) {
        visits.add(new VisitRecord(userId, timestamp));
    }


    public Map<String, Integer> calculateVisitFrequency() {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (VisitRecord record : visits) {
            frequencyMap.put(record.getUserId(), frequencyMap.getOrDefault(record.getUserId(), 0) + 1);
        }
        return frequencyMap;
    }


    public String findMostPopularHour() {
        Map<String, Integer> hourCount = new HashMap<>();


        for (VisitRecord record : visits) {
            String hour = record.getTimestamp().substring(0, 2) + ":00";
            hourCount.put(hour, hourCount.getOrDefault(hour, 0) + 1);
        }


        String mostPopularHour = "";
        int maxVisits = 0;
        for (Map.Entry<String, Integer> entry : hourCount.entrySet()) {
            if (entry.getValue() > maxVisits) {
                maxVisits = entry.getValue();
                mostPopularHour = entry.getKey();
            }
        }


        List<String> visitsInHour = new ArrayList<>();
        for (VisitRecord record : visits) {
            if (record.getTimestamp().startsWith(mostPopularHour.substring(0, 2))) {
                visitsInHour.add(record.getTimestamp());
            }
        }

        return mostPopularHour + " (" + maxVisits + " посещения: " + String.join(", ", visitsInHour) + ")";
    }
}