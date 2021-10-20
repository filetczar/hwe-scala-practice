package com.farrellw.hwe.practice


object Collections {
  /*
    Returns a new list, where every element in the incoming list is multiplied by 3.
  */
  def timesThree(l: List[Int]): List[Int] = {
    l.map((x: Int) => x*3)
  }

  /*
     Returns a new list, where every letter of every element in the incoming list is capitalized.
  */
  def upper(l: List[String]): List[String] = {
    l.map((x: String) => x.toUpperCase)
  }

  /*
    Flattens a two deep list to one level.
   */
  def flatten(l: List[List[Int]]): List[Int] = {
      l.flatten
  }

  /*
    Returns a new list, where only elements of the list passed in that are 0 or positive numbers are kept.
   */
  def takeOutNegatives(l: List[Int]): List[Int] = {
   /* if(l.head >= 0 & l.head % 2 == 0) {
      List(l.head, takeOutNegatives(l.tail))
    } */
    l.filter(_ >= 0)

  }

  /*
    Returns a new list, where only the elements passed in containing "car" are kept to the new list.
   */
  def keepStringsContainingCar(l: List[String]): List[String] = {
    val new_l: List[String] = l.filter(_.contains("car"))
    new_l

  }

  /*
    Returns a new list, with the depth flattened to 1 and every element in the resulting list multiplied by 3.
   */
  def flattenAndMultiply(l: List[List[Int]]): List[Int] = {
    l.flatMap(y => y.map(x => x*3))
  }

  /*
    Returns the sum of all numbers passed in.
   */
  def sumDigits(l: List[Int]): Int = {
  /*  if(l.isEmpty) 0
    else {
      l.head + sumDigits(l.tail)
    } */
    val new_l = l.foldLeft(0)((w,z) => w + z)
    new_l
  }

  /*
    Uses .foldLeft to implement the map method.
    / Advanced Problem, feel free to skip /
   */
  def mapUsingFoldLeft(l: List[Int], f: Int => Int): List[Int] = {
    val new_l: List[Int] = l.foldLeft(3)((x,y) => x*y)
    new_l
  }

  /*
    Uses .foldLeft to implement the flatMap method.
    / Advanced Problem, feel free to skip /
   */
  def flatMapUsingFoldLeft(l: List[List[String]], f: String => String): List[String] = ???
}
