import java.util.*;

class Solution {
    // Two maps to store the encoding and decoding mappings
    Map<String, String> encodeMap = new HashMap<>();
    Map<String, String> decodeMap = new HashMap<>();
    // Constant representing the base URL for tiny URLs
    private static final String BASE_URL = "http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        // If the long URL is already in the encoding map, return its corresponding tiny URL
        if ((encodeMap.containsKey(longUrl))) {
            return BASE_URL + encodeMap.get(longUrl);
        }
        // If the long URL is not already in the encoding map
        // Generate a new key based on the size of the encoding map (this is a simple way to generate unique keys)
        String key = Integer.toString(encodeMap.size());
        // Add the long URL and its corresponding key to the encoding and decoding maps
        encodeMap.put(longUrl, key);
        decodeMap.put(key, longUrl);
        // Return the tiny URL formed by concatenating the base URL and the key
        return BASE_URL + key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        // Extract the key from the short URL by removing the base URL
        String key = shortUrl.replace(BASE_URL, "");
        // Use the key to look up the original long URL in the decoding map
        return decodeMap.get(key);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));