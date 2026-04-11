package TrickyQuestion.CheckUserExists;

import com.google.common.hash.BloomFilter;

import java.util.concurrent.ConcurrentHashMap;

public class CombinedUserService {
    private static final int EXPECTED_INSERTIONS = 1000000;
    private static final double FALSE_POSITIVE_PROBABILITY = 0.01;

    private BloomFilter<String> bloomFilter;
    private ConcurrentHashMap<String, Boolean> cache = new ConcurrentHashMap<>();
    private UserService userService = new UserService();

    public CombinedUserService() {
        // Initialize the Bloom filter
      //  bloomFilter = BloomFilter.create(Funnels.stringFunnel(StandardCharsets.UTF_8), EXPECTED_INSERTIONS, FALSE_POSITIVE_PROBABILITY);
    }

    public boolean userExists(String email) {
        // Step 1: Check Bloom filter
        if (bloomFilter.mightContain(email)) {
            // Step 2: Check cache
            if (cache.containsKey(email)) {
                return cache.get(email);
            }
            // Step 3: Fallback to database check
            boolean exists = userService.userExists(email);
            // Step 4: Update cache
            cache.put(email, exists);
            return exists;
        } else {
            // Definitely not in the set
            return false;
        }
    }

    public void addUser(String email) {
        // Add to Bloom filter and optionally cache
        bloomFilter.put(email);
        cache.put(email, true);
    }
}
