class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        arr1 = [1] * len(nums)
        arr2 = [1] * len(nums)
        # first pass to multiple back

        runningPass = 1
        for i in range(1, len(nums)):
            runningPass *= nums[i-1]
            arr1[i] = runningPass
        
        # second pass to multiple back

        runningPass = 1
        for i in range(len(nums)-2, -1,-1):
            runningPass *= nums[i+1]
            arr2[i] = runningPass

        res = [0] * len(nums)

        for i in range(0,len(nums)):
            res[i] = arr1[i] * arr2[i]
        return res

        