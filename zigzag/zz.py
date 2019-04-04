class Solution:
    def convert(self, s: str, numRows: int) -> str:
        arr = []
        if numRows == 1:
            return s
        res = ""
        i = 0
        cur = 0
        while cur<len(s):
            line = [0] * numRows
            arr.append(line)
            if i % (numRows - 1) == 0 :
                m = 0
                while m < numRows and cur<len(s):
                    arr[i][numRows - m - 1] = s[cur]
                    cur += 1
                    m += 1
            else:
                if cur<len(s):
                    arr[i][i % (numRows - 1)] = s[cur]
                    cur += 1
            i += 1
        row = numRows - 1
        height = len(arr)
        while row > -1:
            for j in range(height):
                if arr[j][row] != 0:
                    res += arr[j][row]
            row -= 1 
        return res


class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        n = numRows - 1
        res = [""]*numRows
        top = True
        for i in range(0,len(s)):
            if top:
                if i%n != 0:
                    res[n-i % n] += s[i]
                else:
                    res[0] +=s[i]
                    top = False
            else:
                if i % n != 0:
                    res[i % n] += s[i]
                else:
                    res[n] += s[i]
                    top = True
        return ''.join(res)