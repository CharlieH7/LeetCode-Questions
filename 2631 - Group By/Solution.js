/**
 * @param {Function} function 
 * @return {Array}
 */
 
Array.prototype.groupBy = function (fn) {
    // group by keys
    const result = {};
    for (const obj of this) {
        const key = fn(obj);
        if (!result.hasOwnProperty(key)) {
            result[key] = [];
        }
        result[key].push(obj);
    }
    return result;
}