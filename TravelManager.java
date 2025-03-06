package console_project;

import java.util.HashMap;

public class TravelManager {
    private HashMap<String, TravelDetails> travelDetailsMap;

    public TravelManager() {
        this.travelDetailsMap = new HashMap<>();
    }

    public void addTravelDetails(String identifier, TravelDetails details) {
        travelDetailsMap.put(identifier, details);
    }

    public TravelDetails getTravelDetails(String identifier) {
        return travelDetailsMap.get(identifier);
    }

    public void listAllTravelDetails() {
        System.out.println("\n=== All Travel Details ===");
        if (travelDetailsMap.isEmpty()) {
            System.out.println("No travel details added yet.");
        } else {
            for (String key : travelDetailsMap.keySet()) {
                System.out.println("- " + key);
            }
        }
    }
}
