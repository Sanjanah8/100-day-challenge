n=input().strip()
r=[n[i:j] for i in range(len(n)) for j in range(i+1,len(n)+1)]
k=sorted(set(r))
print(k.index(n)+1)
