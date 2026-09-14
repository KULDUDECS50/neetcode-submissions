class Solution:

    def encode(self, strs: List[str]) -> str:
        string = "" 
        for word in strs:
            string += str(len(word)) + "#" + word

        return string
        # 5#Hello7#Kuldeep

    def decode(self, s: str) -> List[str]:
        words = []
        index = 0
        

        while index < len(s):
            delim = s.find("#", index, len(s));
            letLen = int(s[index:delim:1])
            word = s[delim+1:delim+1+letLen:1]
            words.append(word)
            index = delim+1+letLen
        
    # find function gives us first occurence
        
        return words
