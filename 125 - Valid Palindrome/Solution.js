/**
 * @param {string} s
 * @return {boolean}
 */
let isPalindrome = function(s) {
    let newStr = s.toLowerCase().replace(/[^a-zA-Z0-9]/g, "");
    let reverseStr = "";
    for (let i = newStr.length - 1; i >= 0; i--) {
        reverStr += newStr[i];
    }
    return newStr === reverseStr;
}