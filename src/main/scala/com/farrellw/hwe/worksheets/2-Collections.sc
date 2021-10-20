val directionalStates = List(
  "West Virginia",
  "North Dakota",
  "South Dakota",
  "North Carolina",
  "South Carolina",
  "West Virginia"
)

val nums: List[Int] = List(
  1,
  2,
  3,
  4
)

// map, filter, foldLeft, flatMap, flatten

var new_nums: List[Int] = nums.map(x => x*7)
println(new_nums)

// In another language, you might :
for (n <- nums) {
  // Multiply each number by 7
}

val l = List(List("phil", "MichellE"))
//val new_l = l.flatMap()
//println(new_l)

val x = List(1,2,3,4)
val y = x.foldLeft(5)((w,z) => w * z)
println(y)