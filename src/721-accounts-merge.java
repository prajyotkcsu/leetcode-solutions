class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,Integer> hm=new HashMap<>();
        List<List<String>> result=new ArrayList<>();
        //{"pk@gmail.com",1},{"pk1@gmail.com",1}
        for(int i=0;i<accounts.size();i++){
            for(int j=0;j<accounts.get(i).size();j++){
                if(accounts.get(i).get(j).contains("@")){
                   if(!hm.containsKey(accounts.get(i).get(j))){
                       hm.put(accounts.get(i).get(j),i); 
                }
                      else{
                          List<String> newList = new ArrayList<String>();
                          List<String> l1=accounts.get(hm.get(accounts.get(i).get(j)));
                          List<String> l2=accounts.get(i);
                          newList.addAll(l1);
                          newList.addAll(l2);
                          result.add(newList);

                      }
                }
                   //if email check if present in hm, if yes append list.get(hm.get(email)) to the existing list
                    
            }
        }
return result;    }
}
        
