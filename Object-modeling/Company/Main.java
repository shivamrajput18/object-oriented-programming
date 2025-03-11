package Company;

public class Main {
    public static void main(String[] args) {
       Company tcs = new Company("tcs");

       Department hr = new Department("HR");
       tcs.addDepartments(hr);
       hr.addEmployee("Deepak");
       hr.addEmployee("ritick");

       Department sales = new Department("sales");
       tcs.addDepartments(sales);
       sales.addEmployee("rohan");

       tcs.CompanyStructure();


     



    }
}
