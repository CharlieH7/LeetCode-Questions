/**
 * @param {number[]} nums
 * @return {number[]}
 */

// brute force solution
var productExceptSelf = function(nums) {
    const result = [];
    
    for (let i = 0; i < nums.length; i++) {
        let product = 1;
        for (let j = 0; j < nums.length; j++) {
            if (i !== j) {
                product *= nums[j];
            }
        }
        result.push(product);
    }
    return result;
}

// division solution
var productExceptSelf = function (nums) {
    const result = [];
    let product = 1;
    for (let i = 0; i < nums.length; i++) {
        product *= nums[i];
    }
    for (let i = 0; i < nums.length; i++) {
        result.push(product / nums[i]);
    }
    return result;
}

// prefix and suffix product solution
var productExceptSelf = function (nums) {
    const result = [];
    let prefix = 1;
    let postfix = 1;
    for (let i = 0; i < nums.length; i++) {
        result[i] = prefix;
        prefix *= nums[i];
    }
    for (let i = nums.length - 1; i >= 0; i--) {
        result[i] *= postfix;
        postfix *= nums[i];
    }
    return result;
}