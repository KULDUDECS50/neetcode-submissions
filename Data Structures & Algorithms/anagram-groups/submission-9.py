class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        map = {}

        for s in strs:
            sort = "".join(sorted(s))
            map.setdefault(sort, []).append(s);

        return list(map.values())
        