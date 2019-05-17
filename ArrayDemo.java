package thirdproject;

public class ArrayDemo {
    public static void main(String args[]){
        int data[] = new int[3];          //声明并开辟了一个3个长度的数组
        data[0] = 10;
        data[1] = 20;
        data[2] = 30;          //设置数组的内容
        for (int x = 0; x < data.length; x++){     //循环输出数组
            System.out.println(data[x]);
        }
    }
}
