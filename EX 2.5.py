# Write a function get_k_largest to get top k largest numbers
# from a list; then write a code to check your function.
# For example, 
# Input:
#     2
#     1, 2, 3, 3, 0, 1, -10
# Output:
#     3, 2

def get_k_largest(k, s):
    s = s.strip()
    num = list(set(map(int, s.split(','))))
    num.sort(reverse = True)
    return num[:k]
    
k = int(input())
s = input()
kq = ", ".join(f"{n}" for n in get_k_largest(k, s))
print(kq, end = '')