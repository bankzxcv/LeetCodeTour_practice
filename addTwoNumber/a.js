function ListNode(val, next) {
  this.val = val === undefined ? 0 : val
  this.next = next === undefined ? null : next
}

const print = e => {
  let curr = e
  // console.log('answer')
  console.log(curr.val)
  while (curr.next) {
    curr = curr.next
    console.log(curr.val)
  }
}
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */

const addTwoNumbers = function (l1, l2) {
  let answer = new ListNode()

  let curr = answer

  let e1 = l1
  let e2 = l2

  let parity = 0
  while (e1 || e2) {
    const em1 = e1 ? e1.val : 0
    const em2 = e2 ? e2.val : 0
    // console.log(em1, em2)
    const thisPos = em1 + em2 + parity
    parity = thisPos > 9 ? 1 : 0
    curr.val = thisPos % 10
    e1 = e1 ? e1.next : null
    e2 = e2 ? e2.next : null

    if (e1 || e2) {
      curr.next = new ListNode()
      curr = curr.next
    }
  }

  if (parity) {
    curr.next = new ListNode(parity)
  }
  return answer
}

const testList = [
  [[0], [0]],
  [
    [2, 4, 3],
    [5, 6, 4],
  ],
  [[4, 3, 2, 1], [1]],
  [[1], [4, 3, 2, 1]],
  [
    [3, 3, 3],
    [6, 6, 6, 6],
  ],
  [[9, 9], [1]],
  [[1, 9], [1]],
  [[9, 1], [1]],
]

testList.forEach((e, i) => {
  const [l1, l2] = e
  const e1 = new ListNode()
  const e2 = new ListNode()

  const red = len => (prev, curr, i) => {
    prev.val = curr
    prev.next = i != len - 1 ? new ListNode() : undefined
    return prev.next
  }

  l1.reduce(red(l1.length), e1)
  l2.reduce(red(l2.length), e2)
  result = addTwoNumbers(e1, e2)
})
