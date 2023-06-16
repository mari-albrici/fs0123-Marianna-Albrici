package designPatterns.es3.handlers;

import designPatterns.es3.entities.enums.Role;

public class RoleChecker {
    Role role;
    long salary;
    SalaryValidator salaryValidator = new SalaryValidator();

    public Role roleCheck(long salary){
        if(salaryValidator.salaryCheck(salary) && salary>=1000 && salary<=1999){
            return Role.CAPTAIN;
        } else if(salaryValidator.salaryCheck(salary) && salary>=2000 && salary<=2999){
            return Role.MAJOR;
        } else if(salaryValidator.salaryCheck(salary) && salary>=3000 && salary<=3999){
            return Role.LIEUTENANT;
        } else if(salaryValidator.salaryCheck(salary) && salary>=4000 && salary<=4999){
            return Role.COLONEL;
        } else if(salaryValidator.salaryCheck(salary) && salary>=5000){
            return Role.GENERAL;
        } else {
            return Role.UNKNOWN;
        }
    }
}
