class Solution:
    def convertToTitle(self, n: int) -> str:
        arr=["A","B","C","D","E","F","G","H","I","J","K","L","M",
            "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"]
        res = ""
        while(n>26):
            res += arr[n%26-1]
            n = int(n/26) if n%26!=0 else int(n/26)-1
        res +=arr[n-1]
        return res[::-1]

class Solution:
    def convertToTitle(self, n: int) -> str:
        arr=[chr(x) for x in range(ord('A'), ord('Z')+1)]
        res = ""
        while(n>26):
            nn = n%26
            nm =int(n/26)
            res += arr[nn-1]
            n = nm if nn!=0 else nm-1
        res +=arr[n-1]
        return res[::-1]