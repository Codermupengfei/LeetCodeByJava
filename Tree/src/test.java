/**
 * Created by OovEver on 2017/10/30.
 */
public class test {
    public static void main(String[] args) {
        String str="";
        long starTime=System.currentTimeMillis();
        //����ѭ��10000��ʱ��
        for(int i=0;i<100000000;i++){
            str=str+i;
        }
        long endTime=System.currentTimeMillis();
        long Time=endTime-starTime;
        System.out.println(Time);
    }
}
