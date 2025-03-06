package month_01;

public class sxhua1 {
    public static void main(String[] args){
        int a=0;
        System.out.println("0-999的水仙花数有：");
        for(int i=100;i < 1000;i++){
            int hundred = i/100; //百位
            int decade = (i % 100)/10; //十位
            int unit = i % 10; //个位
            int sum = hundred * hundred * hundred
                    +decade * decade * decade
                    +unit * unit * unit;
            if(sum == i){
                a++;
                System.out.println(i);
            }
        }
        System.out.println("0-999的水仙花数有："+a);
    }
}

