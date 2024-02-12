import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше сообщение: ");
        String name = scanner.nextLine();

        System.out.print("Введите номер : ");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println();

        Phone phone1 = new Phone(654321,"Iphone X",1.2);
        Phone phone2 = new Phone(754534,"Iphone 13",1.5);
        aboutPhone(phone1);
        System.out.println("Информация про телефон");
        System.out.println(phone1.toString());
        phone1.receiveCall("Артём");
        System.out.println();

        aboutPhone(phone2);
        System.out.println("Информация про телефон");
        System.out.println(phone2.toString());
        System.out.println();

        LandLinePhone landline1 = new LandLinePhone(328456,"Phillips",2.4,true);
        LandLinePhone landline2 = new LandLinePhone(398453,"Panasonic",3.5,true);
        aboutPhone(landline1);

        System.out.println("Информация про телефон");
        System.out.println(landline1.toString());
        System.out.println();

        aboutPhone(landline2);
        System.out.println("Информация про телефон");
        System.out.println(landline2.toString());
        System.out.println();

        MobilePhone mobile1 = new MobilePhone(17890123,"Xiaomi",1.7,2.4,false);
        MobilePhone mobile2= new MobilePhone(6735234,"Meizu",1.2,2.0,true);
        aboutPhone(mobile1);
        System.out.println("Информация про телефон");
        System.out.println(mobile1.toString());
        System.out.println();


        aboutPhone(mobile2);
        System.out.println("Информация про телефон");
        System.out.println(mobile2.toString());
        System.out.println();

        mobile1.sendMessage(name,num);

        phone1.SetModel("Iphone 14 Pro");
        phone1.SetWeight(1.0);
        mobile1.SetWeight(0.8);
        mobile1.SetNumber(12343524);

        System.out.println("Данные после изменений!");

        System.out.println(phone1.toString());
        System.out.println();
        System.out.println(mobile1.toString());

        scanner.close();
    }
    public static void aboutPhone(RingAble ob) {
        ob.ring();
    }
}