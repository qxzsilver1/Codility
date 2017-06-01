# you can write to stdout for debugging purposes, e.g.
# print "this is a debug message"

def solution(N):
    # write your code in Python 2.7
    s = str(bin(N)).strip("0b")
    str_len = len(s)
    
    binary_gap = 0
    temp = 0
    
    for i in range(str_len):
        if s[i] == "0":
            binary_gap += 1
        if s[i] == "1":
            if temp < binary_gap:
                temp = binary_gap
            binary_gap = 0
    
    return temp
    pass
