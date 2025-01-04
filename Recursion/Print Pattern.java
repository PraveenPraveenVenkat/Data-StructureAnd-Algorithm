class Solution{
    public List<Integer> pattern(int N){
        // code here
        
         List<Integer>res=new ArrayList<>();
        gfg( N,res);
        return res;
        
    }
    private void gfg(int n,List<Integer>res)
    {
        if(n<=0)
        {
            res.add(n);
            return ;
            
        }
        
        
            res.add(n);
        
        gfg(n-5,res);
        res.add(n);
    }
}