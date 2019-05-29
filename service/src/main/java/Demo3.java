import java.util.Arrays;

/**
 * @author Sun
 * @date 2019/5/29 19:24
 * @description
 */
public class Demo3 {
    public static void main(String[] args){
        int [] a={432,46,32,655,432};
        for(int i= 0; i < a.length-1; i++) {
            for(int j=0;j<a.length-1-i;j++)
            {
                if (a[j]>a[j+1]){
                    int temp =a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }

        }

        System.out.println(Arrays.toString(a));
    }
}
