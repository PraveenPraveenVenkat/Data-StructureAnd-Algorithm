class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> res= new ArrayList<>();
     generate(res,0,0,"",n);
     return res;
    }

     private void generate(List<String> res,int open,int close,String pair,int max){
        if(pair.length()== max*2){
            res.add(pair);
            return;
        }

     if(open<max){
            generate(res,open+1,close,pair + "(" ,max);
     }
        if(open > close){
            generate(res,open,close+1,pair + ")" ,max);
        }
     }   
    
}