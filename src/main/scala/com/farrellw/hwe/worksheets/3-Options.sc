val states = Map(
  "AL" -> "Alabama",
  "AK" -> "Alaska",
  "IA" -> "Iowa",
  "IL" -> "Illinois",
  "LA" -> "Louisiana",
  "MO" -> "Missouri",
  "NE" -> "Nebraska"
)

val capitals = Map(
  "Alabama" -> "Montgomery",
  "Alaska" -> "Juneau",
  "Arizona" -> "Phoenix",
  "Arkansas" -> "Little Rock",
  "California" -> "Sacramento",
  "Colorado" -> "Denver",
  "Connecticut" -> "Hartford"
)


states.get("AL").flatMap(capitals.get).map(_.toUpperCase)

val nums = List(1,2,3,4,5)
def mySum(listofN: List[Int]): Int = {
  if(listofN.isEmpty) 0
  else {
    listofN.head + mySum(listofN.tail)
  }
}

println(mySum(nums))

// Option(databaseCall)

val thing: Option[String] = Some("phil")
println(thing)
println(thing.get == "phil")



