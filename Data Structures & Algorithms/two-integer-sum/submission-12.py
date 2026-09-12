class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        arr = [0] * 2
        map = {}
        for i, n in enumerate(nums):
            map[n] = i
        
        for i, n in enumerate(nums):
            diff = target - n
            if diff in map and map.get(diff) != i:
                return [i, map.get(diff)]
        return arr