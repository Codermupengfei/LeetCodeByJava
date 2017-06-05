import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by OovEver on 2017/5/24.
 */
public class Test1 {
    static boolean judge(double []nums,int m){
        int n=nums.length;
        if(n==0||m==0)
            return false;
        Arrays.sort(nums);


        if(Arrays.binarySearch(nums,m)>0)
            return true;
//        初始化栈
        Stack<Integer> stack=new Stack<Integer>();
        double sumCur=nums[0];
        int now=0;
        stack.push(0);
        now=stack.peek();
        while (true){
            if(sumCur<m){
                now++;
                if(now<n){
                    stack.push(now);
                    sumCur+=nums[now];
                }else if(stack.empty()){
                    return false;
                }else {
                    now=stack.peek();
                    stack.pop();
                    sumCur-=nums[now];
                }

            }else if(sumCur>m){
                // 出口：只有一个值，并且还大于要求的和，那就没有答案了
                if(stack.size()<2)
                    return false;
                else {
                    sumCur-=nums[stack.peek()];
                    stack.pop();
                    sumCur-=nums[stack.peek()];
                    now=stack.peek();
                    stack.pop();

                }

            }else{
                return true;
            }
        }




    }
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        double []nums=new double[n];
//        m=10000000;
//        long[] nums={1,2,3,4,5,6,7,8,9,10,11,10000000,13,14,15,16,17,18,19,20};
        long sumNum=0;
        boolean flag = false;
        if(n<=10) {
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextDouble();
                sumNum += nums[i];
            }
            int sum = m;
            int len = 2;
            while (sum != 0 && sum <= sumNum && !flag) {
                flag = judge(nums, sum);
                sum *= len;
                len++;
            }
        }else {


        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
