class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        flag = False;
        if (dividend < 0) is (divisor < 0):
            flag = True
        res = 0
        dividend, divisor = abs(dividend), abs(divisor)
        while dividend >= divisor:
            temp, i = divisor, 1
            while dividend >= temp:
                dividend -= temp
                res += i
                i <<= 1
                temp <<= 1
        if not flag:
            res = -res
        return min(max(-2147483648, res), 2147483647)