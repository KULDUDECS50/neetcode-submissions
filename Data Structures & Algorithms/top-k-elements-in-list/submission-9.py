class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        res = [0] * k
        map = {}

        for n in nums:
            if n in map:
                map[n] += 1
            else:
                map[n] = 1
        
        buckets = [[] for i in range(len(nums) + 1)]

        for m in map:
            buckets[map[m]].append(m)

        count = 0
        for bucket in buckets[::-1]:
            for val in bucket[::-1]:
                if count < k:
                    res[count] = val
                    count += 1
        
        return res
        

        