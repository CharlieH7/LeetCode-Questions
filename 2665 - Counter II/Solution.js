/**
 * @param {integer} init
 * @return {increment: Function, decrement: Function, reset: Function}
 */
var createCounter = function (init) {
  let currentCounter = init;
  const increment = () => ++currentCounter;
  const decrement = () => --currentCounter;
  const reset = () => (currentCounter = init);
  return {
    increment: increment,
    decrement: decrement,
    reset: reset,
  };
};
