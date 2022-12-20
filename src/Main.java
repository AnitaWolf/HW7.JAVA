import java.util.Random;
import java.util.Scanner;



public class Main {


    static int count;
    static int[] sub;
    static Random random = new Random();
    static Scanner scanner = new Scanner(System.in);


    static StringBuilder stringBuilder =new StringBuilder();
    static StringBuffer stringBuffer=new StringBuffer();

    public static void main(String[] args) {


        int e = scanner.nextInt();
        switch (e) {
            case 10:
                System.out.println("10 ");
                break;
            case 11:
                System.out.println("11");
                break;

            case 12:
                System.out.println("12");
                break;
            default:
                System.out.println("znachenie ne najdeno");

        }


        while (true) {
            System.out.println("enter 1 number:");
            int a = scanner.nextInt();
            System.out.println("enter 2 number:");
            int b = scanner.nextInt();
            System.out.println("enter 3 number:");
            int c = scanner.nextInt();

            if (a + b < c) {
                System.out.println(" sum less  c : ");
            } else break;

        }
        int[] newArr = createArr(10, 20);

        System.out.println("Array:");
        printArr(newArr);
        System.out.println(" sum of array elements:");
        System.out.println(sumArr());
        System.out.println("product of array elements:");
        System.out.println(mulArr());




        Human human=new Human(25,"Anna");
        System.out.println(human.getAge()+ " "+ human.getName());
        human.setAge(30);
        System.out.println("newAge " +human.getAge());
        human.setName("Maria");
        System.out.println("newName " +human.getName());


        Square square=new Square();
        System.out.println("enter length:");
        int a = scanner.nextInt();


        System.out.println("enter width:");
        int b = scanner.nextInt();

        System.out.println("SquareRec: "+ square.SquareRec(a,b));

        System.out.println("enter diameter:");
        int r = scanner.nextInt();

        System.out.println("SquareCir: "+square.SquareCir(r));

        System.out.println("enter  base length :");
        int c = scanner.nextInt();


        System.out.println("enter height:");
        int d = scanner.nextInt();

        System.out.println("SquareTri: "+ square.SquareTri(c,d));





    }


    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        count++;
        }
        System.out.println();

        sub = new int[count];
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            sub[count] = arr[i];
            count++;
        }
        int a;

        while (true) {
            String str = "";
            a = scanner.nextInt();
            str = a >= 1 && a <= 10 ? " pig " : "dog";
            System.out.println(str);
            str = a >= 10 && a <= 20 ? " cow" : "cat  ";
            System.out.println(str);
            str = a >= 20 && a <= 30 ? " horse" : "sheep";
            System.out.println(str);
            str = a >= 30 && a <= 50 ? " fish " : "snail";
            System.out.println(str);
            str = a >= 50 && a <= 60 ? " tiger" : "lion  ";
            System.out.println(str);


            int b = a < 10 ? 100 : 50;
            System.out.println(b);
            int c = a < 100 ? 90 : 40;
            System.out.println(c);
            int k = a >300 ? 80 : 30;
            System.out.println(k);
            int g = a <200 ? 70 : 20;
            System.out.println(g);

            char f = a >= 1 && a <= 10 ? '&' : '%';
            System.out.println(f);
            char h = a >= 10 && a <= 20 ? '§' : '=';
            System.out.println(h);
            char j = a >= 20 && a <= 30 ?'?' : '!';
            System.out.println(j);
            char t = a >= 30 && a <= 50 ? '?' : '{';
            System.out.println(t);
            char l = a >= 50 && a <= 60 ? '}' : '0';
            System.out.println(l);

            System.out.println("exit-e,continue-n");




            char d = scanner.next().charAt(0);
            while (d!='e' && d!='n') {
                System.out.println("exit-e,continue-n");
                d = scanner.next().charAt(0);
            }
            if (d == 'e') {
                break;
            }

        }


        stringBuilder.append("elephant");
        System.out.println(stringBuilder);

        String str=stringBuilder.toString();


        stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.delete(2,8));

        stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.deleteCharAt(0));


        System.out.println(stringBuilder.insert(0,"e"));

        stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.replace(0,8,"monkey"));

            stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.reverse());

        stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.substring(1));


        stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder.substring(3,5));



        stringBuffer.append("crocodile");
        stringBuffer.append("!");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.delete(0,3));
        System.out.println(stringBuffer.deleteCharAt(3));
        System.out.println(stringBuffer.insert(0,"cro"));
        System.out.println(stringBuffer.replace(0,8,"lion"));
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuffer.substring(1));
        System.out.println(stringBuffer.substring(1,4));


        str="Белый";
        str+=" снег ";
        str=str+" пушистый";
        System.out.println(str);

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        str= "   " + str +"   ";
        System.out.println(str);
        System.out.println(str.trim());
        System.out.println(str.length());

        String subString= str.substring(8);

        System.out.println(subString);

        String subStr = str.substring(8, 13);
        System.out.println(subStr);

        System.out.println(str.charAt(9));



    }


    public static int[] createArr(int size,int bound) {
        int [] arr =new int [size];
        for (int i = 0; i < arr.length ; i++) {
            arr[i]= random.nextInt( bound);
        }
        return arr;
    }


       public static int sumArr (){
        int sum=0;
        for (int i = 0; i <sub.length ; i++) {
            sum+=sub[i];
        }
        return sum;
    }
    public static int mulArr (){
        int mul=1;
        for (int i = 0; i <sub.length ; i++) {
            mul=mul*sub[i];
        }
        return mul;


    }





}




/*1)Создать Scanner и организовать ввод чисел
        2) Проверить больше ли некоторого значения сумма двух чисел, если нет вывести сообщение что сумма меньше заданного значение
        3) Через case обработать несколько вариантов введенной переменной, предусмотреть дефолтный случай
        4) Инициализировать массив псевдослучайными числами(Random)
        5) Найти сумму и произведение всех элементов этого массива
        6) Сделать класс, который будет искать площадь треугольника, прямоугольника и окружности
        7) В классе Human добавить возможность изменения значений
        8) Написать 15 тернарных операторов
        9) Показать работу с методами классов String, StringBuilder и StringBuffer
        */