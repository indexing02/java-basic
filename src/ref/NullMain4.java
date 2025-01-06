package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        //참조값을 대입하여 NullPointerException 예외 처리
        bigData.data = new Data();
        System.out.println("bigData.count= " + bigData.count);
        System.out.println("bigData.data= " + bigData.data);
        System.out.println("bigData.data.value= " + bigData.data.value);
    }
}
