package maas;

import java.util.Scanner;

public class main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışan adını giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Çalışanın maaş bilgisini giriniz: ");
        int salary = scanner.nextInt();

        System.out.println("Çalışanın haftalık çalışma saatini giriniz: ");
        int workHours = scanner.nextInt();

        System.out.println("Çalışanın işe başlangıç yılını giriniz: ");
        int hireYear = scanner.nextInt();


        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee.toString());
    }
}
