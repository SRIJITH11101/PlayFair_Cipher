
/**
 * PlayFairCipher
 */
import java.util.*;
public class PlayFairCipher {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ps="",ks="";
        int k=0,l=65;
        char arr[][]=new char[5][5];
        System.out.println("Enter the plaintext");
        ps=sc.nextLine();
        System.out.println("Enter the keyword");
        ks=sc.nextLine();
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(k<ks.length()){
                    arr[i][j]=ks.charAt(k);
                    ++k;
                }
                // else
                //     break;
            }
        }
        
        
        for(int i=k/5;i<5;i++){
            for(int j=k%5;j<5;j++){
                String c=String.valueOf((char)l);
                if(ks.contains(c)==false){
                    // if((char)l=='J')
                    // continue;
                    arr[i][j]=(char)l;
                    l++;
                }
                else{
                    j--;
                    l++;
                }
            }
        }

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }


        //System.out.println(arr);
    }
}