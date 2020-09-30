// matching prefix and suffix longest
class Prac3 {
     
    static int longestPrefixSuffix(String s) 
    {
    int n = s.length();
   
    if(n < 2) {
        return 0;
    }
 
    int len = 0;
    int i = n/2;
   
    while(i < n) {
        if(s.charAt(i) == s.charAt(len)) {
        ++len;
        ++i;
    } 
    else
    {
      if(len == 0) { // no prefix
        ++i;
      } 
     
    }
  }
   
  return len;
         
}
     
    // Driver code
    public static void main (String[] args) 
    {
        String s = "abcighiabci";
        System.out.println(longestPrefixSuffix(s));
    }
}
