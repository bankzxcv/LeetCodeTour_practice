/**
 * @param {string} s
 * @return {boolean}
 */
const isValid = function (s) {
  const d = []
  const mapVal = {
    "]": "[",
    "}": "{",
    ")": "(",
  }
  for (const c of s) {
    if (c == "(" || c == "{" || c == "[") {
      d.push(c)
    } else {
      const t = d.pop()
      if (mapVal[c] !== t) return false
    }
  }
  if (d.length) return false
  return true
}

const test = ["()", "()[]{}", "(]"].forEach(e => console.log(isValid(e)))
