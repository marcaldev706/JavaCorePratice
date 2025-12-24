
import Employee.EmployeeMainClass;
import Employee.TYPE_EMPLOYEE;


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerMainClass = new Scanner(System.in);

        EmployeeMainClass firstEmployee = new EmployeeMainClass(1, "Gustavo", TYPE_EMPLOYEE.CLT);
        firstEmployee.calculatePayment();
        firstEmployee.showInformation();



        scannerMainClass.close();
    }
}