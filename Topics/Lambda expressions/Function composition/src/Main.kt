fun compose(g: (Int) -> Int, h: (Int) -> Int): (Int) -> Int = {
       g(h(it))
}