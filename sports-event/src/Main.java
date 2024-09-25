import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.beans.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

//        int a = 100;
//        System.out.println(a);
//        a = 200;
//        System.out.println("第二次" + a);

//        int n = 100; // 定义变量n，同时赋值为100
//        System.out.println("n = " + n); // 打印n的值
//
//        n = 200; // 变量n赋值为200
//        System.out.println("n = " + n); // 打印n的值
//
//        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
//        System.out.println("x = " + x); // 打印x的值
//
//        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
//        System.out.println("x = " + x); // 打印x的值
//        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？

//          int a = 100 / 0;
//          System.out.println(a);

//         int a = 100;
//         long b = 100 + (++a);
//         System.out.println(b);

//            int a = 100;
//            int b = a << 1;
//            System.out.println(b);

//            double a = 1.0 * 10;
//            double b = 1 - 9.0 / 10;
//            System.out.println(a);
//            System.out.println(b);

//            double a = Math.abs(1.0-1.00);
//            if(a < 0.00001){
//                System.out.println("相等");
//            } else {
//                System.out.println("不相等");
//            }

//        String a = "A";
//        String b = a;
//        System.out.println(b);
//        a = "s";
//        System.out.println(a);

//        int[] a = new int[5];
//        System.out.println(a.length);

//        int[] a = {1,2,3,4};
//        System.out.println(a[0]);

//        String[] names = {"ABC", "XYZ", "zoo"};
//        String s = names[1];
//        names[1] = "cat";
//        System.out.println(s);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        int number = scanner.nextInt();
//        System.out.println("Number is: ");
//        int numbers = scanner.nextInt();
//        System.out.printf("1:%d 2:%d", number,numbers );

//       int[] ns = {1,2,3,4,5};
//       System.out.println(Arrays.toString(ns));

//        int[] ns = {1,4,7,2,4};
//        Arrays.sort(ns);
//        System.out.println(Arrays.toString(ns));

//        System.out.println(Arrays.toString(args));

//        for (String arg: args) {
//            if("-version".equals(arg)) {
//                System.out.println("v 1.0");
//                break;
//            }
//        }

//    Person person = new Person();
//    int a = 5;
//    person.setAge(a);
//    System.out.println(person.getAge());
//    a = 10;
//    System.out.println(person.getAge());
//    String[] b = new String[] {"1","2"};
//    person.setName(b);
//    System.out.println(person.getName());
//    b[0] = "3";
//    System.out.println(person.getName());

//    Person person = new Student();
//    person.run();

//        Person person = new Person();
//        Person person2 = new Person();
//        person.name = "xx";
//        System.out.println(person.name);
//        System.out.println(person2.name);

//        String s = "Hello";
//        System.out.println(s);
//        s = s.toUpperCase();
//        System.out.println(s);

//        int[] num = new int[] {1,2,3,4,5};
//        Source s = new Source(num);
//        s.getArr();
//        num[0] = 10;
//        s.getArr();


//        byte[] b2 = "Hello".getBytes("UTF-8");

//        String[] ss = {"AA","BB","CC"};
//        var str = new StringJoiner(", ","Hello ","!");
//        for (String s : ss) {
//            str.add(s);
//        }
//        System.out.println(str.toString());

//        BeanInfo info = Introspector.getBeanInfo(Person.class);
//        for (PropertyDescriptor pd : info.getPropertyDescriptors()) {
//            System.out.println(pd.getName());
//            System.out.println("  " + pd.getReadMethod());
//            System.out.println("  " + pd.getWriteMethod());
//        }

//        System.out.println(Weekday.TUE.toString());

//        BigDecimal a = new BigDecimal("12.1234");
//        System.out.println(a.scale());


//        byte[] as = toGBK("中文");
//        System.out.println(Arrays.toString(as));

//        Logger logger = Logger.getGlobal();
//        logger.info("info");
//        logger.warning("警告");
//        logger.fine("美好");
//        logger.severe("验证");

//        Log log = LogFactory.getLog(Main.class);
//        log.info("info");

//        Class stdClass = Student.class;
//        System.out.println(stdClass.getField("score"));
//        System.out.println(stdClass.getField("name"));
//        System.out.println(stdClass.getDeclaredField("age"));

//        Class a = Integer.class.getSuperclass();
//        System.out.println(a);

    }


//    static byte[] toGBK(String s){
//        try{
//            return s.getBytes("GBK");
//        }
//        catch (Exception e){
//            System.out.println(e);
//            return s.getBytes();
//        }
//    }
}

//class Person {
//    private String[] name;
//    private int age;
//
//    public int getAge (){
//        return this.age;
//    }
//
//    public void setAge (int age){
//        this.age = age;
//    }
//
//    public String getName() {
//        return this.name[0] + " " + this.name[1];
//    }
//
//    public void setName(String[] name) {
//        this.name = name;
//    }
//}

//class Person{
//    public String name;
//
//    public void run (){
//        System.out.println("person");
//    }
//}
//
//class Student extends Person{
//    @Override
//    public void run(){
//        System.out.println("student");
//    }
//}

//class Person{
//    public static String name;
//}

//class Source{
//    private int[] arr;
//
//    public Source(int[] arr){
////        this.arr = arr;
//        this.arr = Arrays.copyOf(arr,arr.length); // 创建数组副本
//    }
//
//    public void getArr(){
//        System.out.println(Arrays.toString(arr));
//    }
//}

//class Person {
//    private String name;
//    private int age;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}

// enum Weekday {
//    MON("1","星期一"), TUE("2","星期二"), WED("3","星期三"), THU("4","星期四"), FRI("5","星期五"), SAT("6","星期六"), SUN("7","星期七");
//
//    public String value;
//    private String desc;
//    Weekday(String value,String desc) {
//        this.value = value;
//        this.desc = desc;
//    }
//
//    public String toString() {
//        return this.desc;
//    }
//}

//class Student extends Person {
//    public String score;
//    private String age;
//}


//class Person{
//    public String name;
//}

