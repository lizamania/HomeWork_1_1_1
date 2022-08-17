import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String ageOfMyFriend;
        int NUM = 21;
        String word = "age";
        ageOfMyFriend = NUM + word;
        System.out.println(ageOfMyFriend);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");

        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");

        } else
            System.out.println("Вы сохранили ноль");


        //ДЗ на сообразительность:
        String name;
        name= JOptionPane.showInputDialog("“Введите ваше имя:");
        JOptionPane.showMessageDialog(null,"Здраствуйте,\n"+name+"!"+"Приятно познакомиться");

    }


}