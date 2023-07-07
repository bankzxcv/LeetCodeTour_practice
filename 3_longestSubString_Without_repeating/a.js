/**
 * @param {string} s
 * @return {number}
 */
const lengthOfLongestSubstring = function (s) {
  let max = 0
  const val = {}
  let l = 0
  for (let i = 0; i < s.length; i++) {
    const cur = s[i]
    if (typeof val[cur] == "number" && val[cur] >= l) {
      l = val[cur] + 1
    } else {
      max = Math.max(max, i - l + 1)
    }

    val[cur] = i
  }

  return max
}

const testcase = ["abcabcbb", "bbbbb", "pwwkew", "", "dvdf", "au", "aab", "aa", "abba"]

testcase.forEach(e => console.log(e, lengthOfLongestSubstring(e)))
