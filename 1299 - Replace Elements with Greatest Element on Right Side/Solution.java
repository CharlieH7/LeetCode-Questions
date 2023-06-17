class Solution {
    public int[] replaceElements(int[] arr) {
        int[] newArr = new int[arr.length];
        newArr[arr.length - 1] = -1;
        int greatest = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            newArr[i] = greatest;
            greatest = Math.max(greatest, arr[i]);
        }
        return newArr;
    }
}