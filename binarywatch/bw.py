class Solution:
    def readBinaryWatch(self, num: int) -> List[str]:
        res = []
        for h in range(0,12) :
            for m in range(0,60):
                if (bin(h) +bin(m)).count('1') == num:
                    res.append('%d:%02d' % (h, m))
        return res

class Solution:
    def readBinaryWatch(self, num: int) -> List[str]:
        return ['%d:%02d' % (h, m)
            for h in range(12) for m in range(60)
            if (bin(h) + bin(m)).count('1') == num]
