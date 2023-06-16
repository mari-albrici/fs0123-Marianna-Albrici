package designPatterns.es3.handlers;

public class SalaryValidator {
    long salary;

    public boolean salaryCheck(long salary){
        if( salary > 0){
            return true;
        } else {
            System.out.println("Salary cannot be 0.");
            return false;
        }
    }

}
