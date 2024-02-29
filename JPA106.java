import java.lang.Math;
public class JPA106 {
    public static void main(String[] args) {
        double [] numbers = new double[] {-3.2,-2.1,0,2.1}; //透過設置一個陣列 增加數字去算出函式
        for(int i =0 ;i<numbers.length;i++){
            double result = 3*Math.pow(numbers[i], 3) +2*numbers[i]-1;
            System.out.printf("f("+(numbers[i])+") = %.4f\n",result);
        }
    }
}
