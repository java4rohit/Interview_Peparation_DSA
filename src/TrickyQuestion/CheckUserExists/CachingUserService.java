package TrickyQuestion.CheckUserExists;

import java.util.concurrent.ConcurrentHashMap;

public class CachingUserService {
    private ConcurrentHashMap<String, Boolean> cache = new ConcurrentHashMap<>();
    private UserService userService = new UserService();

    public boolean userExists(String email) {
        // Check cache first
        if (cache.containsKey(email)) {
            return cache.get(email);
        }

        // Fallback to database check
        boolean exists = userService.userExists(email);
        // Store result in cache
        cache.put(email, exists);
        return exists;
    }
}
