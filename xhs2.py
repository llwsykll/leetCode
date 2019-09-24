s = "a<<b((c)<)"
res = []
skip = False
for i in range(len(s)):
    if ord(s[i]) >= ord('A') and ord(s[i]) <= ord('z') and not skip:
        res.append(s[i])
    if s[i] == '<' and len(res) > 0 and not skip:
        res.pop()
    if s[i] == "(":
        skip = True
    if s[i] == ")":
        skip = False
    else:
        continue;
print("".join(res))