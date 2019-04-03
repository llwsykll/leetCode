class Solution:
    def longestPalindrome(self, s: str) -> str:
        maxlen = 1
        curlen = 0
        sbegin = 0
        slen = len(s)
        if slen == 1:
            return s
        for i in range(slen):
            left = i - 1
            right = i + 1
            while left >= 0 and right < slen and s[left] == s[right]:
                curlen = right - left + 1
                if maxlen < curlen:
                    maxlen = curlen
                    sbegin = left
                left -= 1
                right += 1

            left = i
            right = i + 1
            while left >= 0 and right < slen and s[left] == s[right]:
                curlen = right - left + 1
                if maxlen < curlen:
                    maxlen = curlen
                    sbegin = left
                left -= 1
                right += 1
        subs = s[sbegin:sbegin+maxlen]
        return subs
            