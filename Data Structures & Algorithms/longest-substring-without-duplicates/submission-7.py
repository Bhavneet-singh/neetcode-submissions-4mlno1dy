class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # n = len(s) 
        # # arr = []
        # max_len = 0 
        # i , j = 0 , 1  

        # if n == 0 : 
        #     return 0 

        # if n == 1 : 
        #     return 1 

        # while(j <= n ) :    
        #     # print(i  , j )   
        #     if len(s[i:j]) == len(set(s[i:j])) : 
        #         max_len = max(max_len , len(s[i:j])) 
        #         # print(s[i:j]) 
        #         j +=1 


        #     else :  
        #           i = j
        # return max_len

        n = len(s)
        seen = set() 
        left = 0 
        ans = 0 
        

        for right in range(n) : 
            while s[right] in seen : 
                seen.remove(s[left])
                left += 1 
            seen.add(s[right])
            ans = max(ans , right - left +1 )
        return ans 