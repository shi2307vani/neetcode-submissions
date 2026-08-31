class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
       
        while(n != 1 && !set.contains(n)){
            set.add(n);
            int res =0;
            while(n>0){
                int rem = n%10;
                res = res + rem*rem;
                n = n/10;
            }
            n = res;
        }
      return n==1;
    }
}
