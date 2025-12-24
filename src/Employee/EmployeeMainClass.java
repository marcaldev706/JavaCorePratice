package Employee;

public class EmployeeMainClass implements PaymentRules{
    private String name;
    private int id;
    private Double baseSalary;
    private TYPE_EMPLOYEE employeeRegisteringNature;
    private Double bonusTax;
    private Double finalSalary;

    public EmployeeMainClass(int id, String name, TYPE_EMPLOYEE employeeRegisteringNature) {
        this.id = id;
        this.name = name;
        this.employeeRegisteringNature = employeeRegisteringNature;

        switch (this.employeeRegisteringNature){
            case TYPE_EMPLOYEE.PJ -> this.baseSalary = 2100.00;
            case TYPE_EMPLOYEE.CLT -> this.baseSalary = 2750.45;
            case TYPE_EMPLOYEE.INTERN -> this.baseSalary= 1850.00;
        }

        switch (employeeRegisteringNature){
            case TYPE_EMPLOYEE.PJ -> this.bonusTax = 10.00;
            case TYPE_EMPLOYEE.CLT -> this.bonusTax = 13.00;
            case TYPE_EMPLOYEE.INTERN -> this.bonusTax = 8.00;
        }
    }

    private void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    private void setFinalSalary(Double finalSalary) {
        this.finalSalary = finalSalary;
    }

    //bonus tax:
    //Pj = 10%
    //Clt = 13%
    //Inter = 8%
    @Override
    public void calculatePayment() {
       Double temporaryVariableTax;

       if(this.employeeRegisteringNature == TYPE_EMPLOYEE.PJ){
           temporaryVariableTax = (this.baseSalary * 10) / 100;
           setFinalSalary(this.baseSalary + temporaryVariableTax);
       }else if(this.employeeRegisteringNature == TYPE_EMPLOYEE.CLT){
            temporaryVariableTax = (this.baseSalary * 13) / 100;
            setFinalSalary(this.baseSalary + temporaryVariableTax);
       }else if(this.employeeRegisteringNature == TYPE_EMPLOYEE.INTERN){
             temporaryVariableTax = (this.bonusTax * 8) / 100;
             setFinalSalary(this.baseSalary + temporaryVariableTax);
       }else{
           System.out.println("Not found");
       }

    }


    public void showInformation(){
        System.out.println("Id: " + this.id);
        System.out.println("Name: " + this.name);
        System.out.println("Base Salary: " + String.format("%.2f", this.baseSalary));
        System.out.println("Bonus Tax: " + String.format("%.2f", this.bonusTax));
        System.out.println("Final Salary: " + String.format("%.2f", this.finalSalary));
    }
}
