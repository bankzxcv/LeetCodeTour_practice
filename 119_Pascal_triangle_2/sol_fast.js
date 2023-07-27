var getRow = function (rowIndex) {
  const ans = new Array(rowIndex + 1).fill(1)
  for (let i = 1, up = rowIndex; i < rowIndex; i++, up--) {
    ans[i] = (ans[i - 1] * up) / i
  }
  return ans
}

for (let i = 0; i < 5; i++) {
  console.log(getRow(i))
}
