class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        if len(s) != len(t):
            return False

        for c in list(s):
            if c in sMap:
                sMap[c] += 1
            else:
                sMap[c] = 1

        for c in list(t):
            if c in tMap:
                tMap[c] += 1
            else:
                tMap[c] = 1
        
        for c in sMap:
            if c in tMap:
                if tMap[c] != sMap[c]:
                    return False
            else: 
                return False
        
        return True
