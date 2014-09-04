# Let K be a 10 digit number with some unique conditions : 
# -The 1st digit of K is the total number of digit "0" in K. 
# -The 2nd digit of K is the total number of digit "1" in K. 
# -The 3rd digit of K is the total number of digit "2" in K. 
# - 4th.. 
# - 5th.. 
# - 6th.. 
# - 7th.. 
# - 8th.. 
# - 9th.. 
# -The 10th(last) digit of K is the total number of digit "9" in K. 
# What is the maximum number of K?

from sys import argv
def createNo(k):
    i = 9
    no = []
    noVal = k
    while(noVal != 0):
        no.insert(0, noVal % 10)
        noVal = noVal/10
        i -= 1
    if(len(no) != 10):
        leftSize = 10 - len(no)
        j = 0
        while j < leftSize:
            no.insert(0, 0)
            j += 1
    return no

def main():
    while(not check()):
        print "\nNo: ", no, "\n"
        for i in range(0, 10):
            no[i] = count(i)

def count(val):
    freq=0
    for i in range(0, 10):
        if val == no[i]:
            freq += 1
    return freq

def check():
    test = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    for i in range(0, 10):
        test[no[i]] += 1
    return no == test

script, noValue = argv
if len(noValue) > 10:
    print "\nLength of No should be less than 10 digit"
else:
    no = createNo(int(noValue))
    main()
    print "\nNo: ", no, "\n"
    string = ''
    for i in no:
        string += str(i)
    print "\nNo:  " + string + "\n"