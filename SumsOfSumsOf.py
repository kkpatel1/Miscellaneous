# Let
    
# How many zeroes to the right of the right-most non-zero decimal digit are in N?

def sum(end, term):
    if term == 2015:
        return 1
    sumVal = 0
    for i in range(1, end+1):
        sumVal += sum(i, term+1)
    return sumVal

print sum(2014, 1)