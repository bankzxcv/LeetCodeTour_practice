/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function(nums) {
  const temp = {}
  let max = 0
  let maxKey = 0
  nums.forEach(e => {
      if(typeof temp[`${e}`] != 'number') {
          temp[e] = 1
      } else {
          temp[e]++
      }
      if (temp[e] > max) {
          maxKey = e
          max = temp[e]
      }
  })
  return maxKey
};