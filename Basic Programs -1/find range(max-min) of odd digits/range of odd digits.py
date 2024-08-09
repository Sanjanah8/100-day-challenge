n = input().strip()
odd_digits = [int(digit) for digit in n if int(digit) % 2 == 1]
if odd_digits:
    print(max(odd_digits) - min(odd_digits))
else:
    print(-1)
