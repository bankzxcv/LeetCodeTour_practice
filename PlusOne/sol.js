/**
 * @param {number[]} digits
 * @return {number[]}
 */
var plusOne = function (digits) {
  let carry = 1
  for (let i = digits.length - 1; i >= 0; i--) {
    const ans = digits[i] + carry
    carry = Math.floor(ans / 10)
    digits[i] = ans % 10
    if (i == 0 && ans == 10) {
      // digits = [1, ...digits]
      digits.unshift(1)
    }
  }
  return digits
}

console.log(plusOne([9, 9, 9]))
