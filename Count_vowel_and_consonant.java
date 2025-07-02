public class Count_vowel_and_consonant {
    public static void main(String[] args) {
        String s = "aeirgnrieve";
        int v = 0;
        int c = 0;
        String vowel = "aeiou";
        for(int i = 0;i<s.length();i++){
            if(vowel.indexOf(s.charAt(i))!=-1){
                v++;
            }
            else{
                c++;
            }
        }
        System.out.println("Vowel is "+v+" and "+"Consonant is "+c);
    }
}
