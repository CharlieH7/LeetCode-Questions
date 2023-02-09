class Solution:
    def numUniqueEmails(self, emails: List[str]) -> int:
        # Create an empty set to store unique emails
        unique = set()

        # Iterate through the list of emails
        for email in emails:
            # Split the email into local and domain parts
            local, domain = email.split("@")
            # Remove anything after the '+' sign in the local part
            local = local.split("+")[0]
            # Replace '.' with empty string
            local = local.replace(".", "")
            # Add the cleaned email to the set
            unique.add((local, domain))
        # Return the length of the set, which is the number of unique emails
        return len(unique)