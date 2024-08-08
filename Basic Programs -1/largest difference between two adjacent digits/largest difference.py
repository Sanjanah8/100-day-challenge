n = input().strip()
max_diff = 0
for i in range(1, len(n)):
    diff = abs(int(n[i]) - int(n[i-1]))
    max_diff = max(max_diff, diff)
print(max_diff)
