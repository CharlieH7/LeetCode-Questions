import java.util.Set;
import java.util.HashSet;

class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (String email: emails) {
            // Split the email into local and domain parts
            String[] parts = email.split("@");
            String local = parts[0];
            String domain = parts[1];

            // Remove '.' and anything after '+' in the local part
            local = local.replace(".", "");
            int plusIndex = local.indexOf("+");
            // if plus sign exists in the local parts
            if (plusIndex != -1)
            {
                local = local.substring(0, plusIndex);
            }

            // Add the cleaned email to the set
            set.add(local + "@" + domain);
        }
        return set.size();
    }
}