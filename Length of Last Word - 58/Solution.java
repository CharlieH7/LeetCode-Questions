class Solution {
    public int lengthOfLastWord(String s) {
        // trim the start and end whitespaces first then split the string into an array
        // by whitespaces
        String arr[] = s.trim().split(" ");
        // return the length of the last word in the string array
        return arr[arr.length - 1].length();
    }
}