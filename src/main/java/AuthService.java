import java.util.ArrayList;
import java.util.List;

public class AuthService {
    private static List<String> blackList = new ArrayList<>();

    static {
        blackList.add("Ivan");
        blackList.add("Oleg");
    }

    public boolean isNotInBlackList(String login) {
        if (blackList.contains(login)) return false;
        return true;
    }
}
