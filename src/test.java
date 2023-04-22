import java.awt.desktop.SystemEventListener;

public class test {
    public static void main(String[] args) {
        int[] numbers = {10, -50, 20, 30};
        int num = numbers.length;
        System.out.println(num);

        int[] arr4 = {10, 30, 40, 50};
        System.out.println(arr4[2]);
        System.out.println(arr4[3]);

        String[] cars = {"Volo", "Opel", "Ford"};
        cars[1] = "BMV";
        System.out.println(cars[1]);
        System.out.println(cars.length);

        int[][] myNumbers = {{10, 20, 30}, {1, 2, 3}};
        System.out.println(myNumbers);

        String[] aCarMake = new String[5];
        aCarMake[0] = "Volo";
        aCarMake[1] = "BMV";
        aCarMake[2] = "Opel";
        aCarMake[3] = "Ford";
        aCarMake[4] = "Audi";

        String[] aMake = {"BMV", "SUZUKI", "HONDA", "TOYOTA", "Ford"};
        int iLengtht = aMake.length;
        System.out.println(iLengtht);

        String aSecond = aMake[2];
        System.out.println(aSecond);

        String aLast = aMake[iLengtht - 1];
        System.out.println(aLast);


    }
}