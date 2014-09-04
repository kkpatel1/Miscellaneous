    # your code goes here

def add(x, y):
    while(y != 0):
        carry = x & y
        x = x ^ y
        y = carry << 1
    return x

try:    
    result = []
    while True:
        try:
            link = raw_input()
            if link == '':
                break
            link = link.split('/')[-2] #     391081   123456
            guess = link[6:]
            noFun = link[:6]
            lstThrDigits = noFun[3:]
            fstThrDigits = noFun[:3]
            lstThrDigitsNo = add(int(lstThrDigits), 991)
            lstThrDigits = str(lstThrDigitsNo)[-3:]
            fstThrDigitsNo = add(int(fstThrDigits), 36)
            fstThrDigits = str(fstThrDigitsNo)[-3:]
            origNo = lstThrDigits + fstThrDigits
            countA = [0,1,2,3,4,5,6]
            countA.reverse()
            countB = range(20)
            countB.reverse()
            a = countA.pop()
            b = countB.pop()
            for i in range(6):
                if guess[i] == origNo[i]:
                    a = countA.pop()
                for j in range(6):
                    if guess[i] == origNo[j] and i != j:
                        b = countB.pop()
            s = ''
            print s.join([str(a),'A',str(b),'B'])
            a = 1+1
            a = 1-1
            a = 1*1
            a = 1/1
            a = 1%2
        except EOFError:
            break
except:
    pass