package HomeWork;

public class PracticeTest {

    public static void main(String[] args) {

        PracticeHomework pH = new PracticeHomework();

        int minute = 1453;
        int age = 4;
        int number = 54;
        int a = 8;
        int b = 7;
        boolean num = true;
        int [] arrOne ={7,4,-9,8,5,0,2,3};
        int [] arrTwo ={564,12,-7,4,5};

        long convert = pH.convert(minute);
        System.out.println("Convert of seconds " + convert);
        int calcAge = pH.calcAge(age);
        System.out.println("Convert of days " + calcAge);
        boolean sameNum = pH.isSameNum(a, b);
        System.out.println(sameNum);
        boolean lessThan = pH.lessThanOrEqualToZero(a);
        System.out.println(lessThan);
        int maxLength = pH.maxLength(arrOne, arrTwo);
        System.out.println("Max lenght is " + maxLength);
        int nextNumber = pH.nextNumber(minute);
        System.out.println("next number is a " + nextNumber);
        boolean b1 = pH.reverseBool(num);
        System.out.println(b1);



    }

}
