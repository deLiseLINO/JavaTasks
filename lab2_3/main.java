package lab2_3;

public class main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("89997856845", "Realme", 345.3);
        Phone phone2 = new Phone("89260658787", "Oneplus", 234);
        Phone phone3 = new Phone("89008757657", "iPhone", 330);

        System.out.println(phone1.getModel() + " " + phone1.getNumber() + " " + phone1.getWeight());
        System.out.println(phone2.getModel() + " " + phone2.getNumber() + " " + phone2.getWeight());
        System.out.println(phone3.getModel() + " " + phone3.getNumber() + " " + phone3.getWeight());

        phone1.receiveCall("Это я");
        phone1.receiveCall("Да да я", "89997856845");
        phone2.sendMessage("89997856845", "89260658787", "89008757657");

    }
}
