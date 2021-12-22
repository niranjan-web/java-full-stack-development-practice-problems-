package javaCoreProject;

class EmployeeDetails 
{
    int empId;
    String empName;
    long empMobileNumber;
    String empAddress;
    int empSalary;
    String empJobType;
    
   
    EmployeeDetails(int empId, String empName, long empMobileNumber, String empAddress,int empSalary, String empJobType)
    {
        this.empId = empId;
        this.empName = empName;
        this.empMobileNumber = empMobileNumber;
        this.empAddress = empAddress;
        this.empSalary = empSalary;
        this.empJobType = empJobType;
    }

    

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public long getEmpMobileNumber() {
        return  empMobileNumber;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public String getEmpJobType() {
        return empJobType;
    }

    public String toString()
    {
        return "Employee id is :"+empId+" \n"+"Employee name is :"+empName+" \n"+"Employee Mobile Number is :"+empMobileNumber+" \n"+"Employee Address is :"+empAddress+" \n"+"Employee Salary is :"+empSalary+" \n"+"Employee JobType is :"+empJobType+"\n";
    }
    
    
}




