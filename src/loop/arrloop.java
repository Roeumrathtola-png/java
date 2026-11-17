package loop;

public class arrloop {
    public static void main(String[] args) {
        int num[]={12, 34, 73, 22};
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=num[i];
            System.out.println(num[i]+"");
        }
        //type casting
        double average=(double)sum/num.length;
        System.out.println();
        System.out.println(sum);
        System.out.println(average);
    }
}
