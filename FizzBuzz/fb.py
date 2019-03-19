class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        res = [str(i) for i in range(1,n+1)]
        for i in range(1,n+1):
            a = i%3==0
            b = i%5 == 0
            if a and not b:
                res[i-1] = "Fizz" 
            if not a and b:
                res[i-1] = "Buzz"
            if a and b:
                res[i-1] = "FizzBuzz"
        return res