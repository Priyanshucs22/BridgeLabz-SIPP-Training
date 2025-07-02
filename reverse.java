public class reverse{
    public static void main(String[] args){
        String s = "Hello World";
        String[] word =  s.split(" ");
        s = "";
        int j = 0;
        s = "";
        for(String k:word){
            String a = "";
            for(int i = k.length()-1;i>=0;i--){
                a+=k.charAt(i);
            }
            s+=a+" ";
        }
        System.out.print(s);
    }
}