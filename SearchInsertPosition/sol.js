/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var searchInsert = function (nums, target) {
  let idx = Math.floor(nums.length / 2)
  let min = 0
  let max = nums.length - 1
  while (min <= max) {
    console.log(idx, min, max)
    if (nums[idx] === target) {
      return idx
    } else if (nums[idx] > target) {
      max = idx - 1
    } else {
      min = idx + 1
    }
    idx = Math.floor((min + max) / 2)
  }
  return min
}

console.log(searchInsert([1, 3, 5, 6], 4))
// console.log(searchInsert([1, 3, 5, 6], 2))
// console.log(searchInsert([1, 3, 5, 6], 5))
console.log(searchInsert([1, 3, 5, 6, 8, 10, 12], 8))
