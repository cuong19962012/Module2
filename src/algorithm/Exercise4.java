package algorithm;

public class Exercise4 {
    public static void main(String[] args) {
        String s = "CodeMarathon";
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.replace(0,1 ,String.valueOf(stringBuilder.charAt(0)).toLowerCase());
        for (int i = 1; i < stringBuilder.length(); i++) {
            if (stringBuilder.charAt(i)>64&&stringBuilder.charAt(i)<91)
            {
                stringBuilder.replace(i,i+1,String.valueOf(stringBuilder.charAt(i)).toLowerCase());
                stringBuilder.insert(i," ");
            }
        }
        System.out.println(stringBuilder);
    }
}
