val letters = List("a", "b", "c")

print(letters.foldLeft("") { (m: String, n: String) => {
  println("m: " + m + " n: " + n)
  m + n
}
})

print(letters.reduceLeft { (m: String, n: String) => {
  println("m: " + m + " n: " + n)
  m + n
}
})


val numbers = List(1, 2, 3, 4)

print(numbers.foldLeft(10) { (i: Int, j: Int) => {
  println("i: " + i + " j: " + j)
  i + j
}

})
println("Reduce Numbers")
print(numbers.reduceLeft{ (i: Int, j: Int) => {
  println("i: " + i + " j: " + j)
  i + j
}

})


print(numbers.foldRight(0) { (i: Int, j: Int) => {
  println("i: " + i + " j: " + j)
  i + j
}

})

println("Reduce Right Numbers")
print(numbers.reduceRight{ (i: Int, j: Int) => {
  println("i: " + i + " j: " + j)
  i + j
}

})

print(numbers.fold(0) { (i: Int, j: Int) => {
  println("i: " + i + " j: " + j)
  i + j
}

})