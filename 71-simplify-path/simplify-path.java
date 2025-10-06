class Solution {
    public String simplifyPath(String path) {
        Stack<String> st=new Stack<>();
        String[] s=path.split("/");
        for(String c:s){
            if(c.equals("") || c.equals(".")){
                continue;
            } 
            else if(c.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            } 
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        if (st.isEmpty()){
            return "/";
        }
        for(String i:st){
            sb.append("/").append(i);
        }
        return sb.toString();
    }
}