/**
 * @param {number} n
 * @return {number}
 */
var climbStairs = function (n) {
  if (n == 1 || n == 2) return n
  let data = Array.from({ length: n }, () => 0)
  data[0] = 1
  data[1] = 2
  for (let i = 2; i < n; i++) {
    data[i] = data[i - 1] + data[i - 2]
  }
  return data[n - 1]
}
