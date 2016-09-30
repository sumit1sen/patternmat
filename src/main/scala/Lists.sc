

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y::ys => {
    if (x<=y) x::xs else y::insert(x,ys)
  }
}

def isort(xs:List[Int]):List[Int] = xs match {
  case List() => List()
  case y::ys => insert(y,isort(ys))
}
val a = List(3,2,7,9,8)
val b = isort(a)

