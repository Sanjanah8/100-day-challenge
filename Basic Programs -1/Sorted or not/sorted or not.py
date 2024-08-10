num1, num2, num3 = map(int, input().split())
if num1 <= num2 and num2 <= num3:
	print('SORTED')
elif num1 >= num2 and num2 >= num3:
	print('SORTED')
else:
	print('NOTSORTED')
