class Solution:
    def longestCommonPrefix(self, strs: 'List[str]') -> 'str':
        if len(strs):
            common = strs[0]
        else:
            return ''
        for i in range(len(strs[0])):
            for str in strs[1:]:
                if str.find(common)==0:
                    pass
                else:
                    common=common[0:-1]
                    break
            i+=1
        return common

# 判断数组中后面几串是否从头开始包含第一串，第一串循环去掉最后一位