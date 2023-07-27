/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function (rowIndex) {
  const items = [[1], [1, 1]]
  if (rowIndex == 0 || rowIndex == 1) return items[rowIndex]
  let curr = []
  let prev = [1, 1]
  for (let i = 2; i <= rowIndex; i++) {
    for (j = 0; j <= i; j++) {
      if (j == 0 || j == i) {
        curr.push(1)
      } else {
        const tmp = prev[j - 1] + prev[j]
        curr.push(tmp)
      }
    }
    items.push(curr)
    prev = curr
    curr = []
  }
  return items[rowIndex]
}

for (let i = 0; i < 10; i++) {
  // console.log(getRow(i))
}
