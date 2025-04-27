class Combine {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        combinations(outer,inner,1,n,k);
        return outer;
    }

    public static void combinations(List<List<Integer>> outer,List<Integer> inner,int currIndex , int lastIndex , int size){
        if(inner.size() == size){
            outer.add(new ArrayList<>(inner));
            return;
        }

        for(int i = currIndex ; i <= lastIndex ; i++){
            inner.add(i);
            combinations(outer,inner,i+1,lastIndex,size);
            inner.remove(inner.size()-1);
        }
    }
}
