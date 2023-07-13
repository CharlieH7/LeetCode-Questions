/**
 * @param {any[]} arr
 * @param {number} depth
 * @return {any[]}
 */

var flat = function(arr, n) {
    const result = [];
    function helper(arr, depth) {
        for (const val of arr) {
            if (typeof val === 'object' && depth < n) {
                // Recursively flatten nested arrays
                helper(val, depth + 1);
            }
            else {
                result.push(val);
            }
        }
        return result;
    }
    // set initial depth level to 0
    return helper(arr, 0);
}