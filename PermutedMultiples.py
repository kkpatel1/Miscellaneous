# It can be seen that the number, 125874, and its double, 251748, contain exactly the same digits, but in a different order.

# Find the smallest positive integer, x, such that 2x, 3x, 4x, 5x, and 6x, contain the same digits.

def check(no, noArrOrig):
    noArr = []
    while no != 0:
        noArr.append(no % 10)
        no /= 10
    noArr = sorted(noArr)
    return noArrOrig == noArr

def test(i):
    noArrOrig = []
    val = i
    while val != 0:
        noArrOrig.append(val % 10)
        val /= 10
    noArrOrig = sorted(noArrOrig)
    if (not check(i*2, noArrOrig)): return False
    if (not check(i*3, noArrOrig)): return False
    if (not check(i*4, noArrOrig)): return False
    if (not check(i*5, noArrOrig)): return False
    if (not check(i*6, noArrOrig)): return False
    return True

def start():
    i = 0
    while True:
        i += 1
        print i
        if test(i):
            print i
            return

start()
