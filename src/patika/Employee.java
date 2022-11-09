package patika;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }
    double tax(){
        if (salary < 1000){
            return 0;
    }else {
            return this.salary * 0.03;
        }

    }
    int bonus(){
        if (workHours > 40){
            return (this.workHours - 40) * 30;
        }else {
            return 0;
        }
    }
    int thisYear = 2021;
    double raiseSalary(){
        if (this.thisYear - this.hireYear < 10){
            return this.salary * 0.05;
        } else if (this.thisYear - this.hireYear > 9 && this.thisYear - this.hireYear < 20) {
            return this.salary * 0.10;
        } else if (this.thisYear - this.hireYear > 19) {
            return this.salary * 0.15;

        }
        return 0;
    }
    public void print(){
        System.out.println("adı : " + this.name);
        System.out.println("maasi : " + this.salary);
        System.out.println("baslangic yili : " + this.hireYear);
        System.out.println("vergi : " + this.tax());
        System.out.println("bonus : " + this.bonus());
        System.out.println("maas artisi : " + this.raiseSalary());
        System.out.println("vergi ve bonuslar ile maas : " + (this.salary- this.tax() + this.bonus()));
        System.out.println("toplam maas : " + (this.salary - this.tax() + this.bonus() + this.raiseSalary()));
    }


}
