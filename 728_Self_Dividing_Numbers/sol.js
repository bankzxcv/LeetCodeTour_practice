const selfDivingCheck = num => {
  let tmp = num
  while (tmp) {
    const parity = tmp % 10
    if (num % parity != 0) return false
    tmp = Math.floor(tmp / 10)
  }
  return true
}

/**
 * @param {number} left
 * @param {number} right
 * @return {number[]}
 */
var selfDividingNumbers = function (left, right) {
  let items = []
  for (let i = left; i <= right; i++) {
    if (selfDivingCheck(i)) items.push(i)
  }
  return items
}
