package day23_loop;

public class PracticeHowManyWordsAli {

    public static void main(String[] args) {
        int count=0;
        boolean word= false;
        String str = "how ma ny wo rds are th ere in th is sente nce";
        char[] ch = str.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(!(ch[i]==' ')){
                for(int j=i;j<ch.length;j++,i++){
                    if(!(ch[j]==' ')){
                        word= true;
                        if(j==ch.length-1){
                            count++;
                        }
                        continue;
                    }
                    else{
                        if(word){
                            count++;
                        }
                        word = false;
                    }
                }
            }
            else{
                continue;
            }
        }
        System.out.println("there are "+(count)+" words");
    }
}




