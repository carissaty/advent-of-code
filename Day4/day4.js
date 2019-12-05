// two adjacent numbers the same
// every consecutive digit is same or increasing
// how many meet all criteria?

const highest = 767346;
const lowest = 231832;
let counter = 0;

function checkIfAdjacent(number) {
  let adjacent = false;
  for (let i = 1; i < number.length; i++) {
    if (number.charAt(i) === number.charAt(i - 1)) {
      adjacent = true;
    }
  }
  return adjacent;
}

function checkIfConsecutive(number) {
  const numberArray = Array.from(number.toString()).map(Number);
  for (let i = 0; i < numberArray.length - 1; i++) {
    if (numberArray[i] > numberArray[i + 1]) {
      return false;
    }
  }
  return true;
}

function goThroughRange() {
  for (let i = lowest; i < highest; i++) {
    if (checkIfAdjacent(i.toString()) && checkIfConsecutive(i)) {
      counter++;
    }
  }
}

goThroughRange();
console.log("counter: " + counter);
