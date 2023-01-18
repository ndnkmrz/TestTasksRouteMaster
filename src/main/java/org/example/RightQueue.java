package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RightQueue {
    private String requestType;

    public String getRequestType() {
        return requestType;
    }
    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public RightQueue(String requestType) {
        this.requestType = requestType;
    }

    public String chooseRightQueue(){
        Map<String[], String> queuesMap = new HashMap<String[], String>() {{
            put(new String[]{"A", "AB"}, "queue0");
            put(new String[]{"B", "D"}, "queue1");
            put(new String[]{"C"}, "queue2");
            put(new String[]{"EF", "X1", "X2"}, "specialQueue");
        }};

        for (Map.Entry<String[], String> row : queuesMap.entrySet()){
            if(Arrays.stream(row.getKey()).anyMatch(requestType::equals)){
                return row.getValue();
            }
        }
        return "defaultQueue";
    }
}
