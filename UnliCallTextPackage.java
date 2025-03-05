import java.util.*;

public class UnliCallTextPackage implements UnliCallsTextOffer{
    private static Map<String, String> packageMap = new HashMap<>();

    static {
        packageMap.put("Smart", "Not offered");
        packageMap.put("Globe", "Offered for Globe Subscribers");
        packageMap.put("Ditto", "Offered to all networks");
    }

    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText) {
        return packageMap.get(telcoName);
    }
}
