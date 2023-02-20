package homwork10;

import homwork10.model.Company;
import homwork10.model.Employee;
import homwork10.storage.Commands;
import homwork10.storage.CompanyStorage;
import homwork10.storage.EmployeeStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo  implements Commands {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();
    private static CompanyStorage companyStorage = new CompanyStorage();
    private static Employee employee;

    public static void main(String[] args) throws ParseException {
        boolean isRun = true;
        while (isRun) {
            Commands.printCommands();
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please inout 3 for search employee by employee ID");
            System.out.println("Please inout 4 for  search employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for activate employee by id");
            String command = scanner.nextLine();
            switch (command) {
                case "EXIT":
                    isRun = false;
                    break;
                case "ADD_EMPLOYEE":
                    employeeAdd();
                    break;
                case "ADD_COMPANY":
                    AddCompany();
                    break;
                case "PRINT_EMPLOYEES":
                    employeeStorage.print();
                    break;
                case "SEARCH_EMPLOYEE_BY_ID":
                    System.out.println("Please input employee ID");
                    String ID = scanner.nextLine();
                    System.out.println(employeeStorage.search(ID));
                    break;
                case "SEARCH_EMPLOYEE_BY_COMPANY_ID":
                    companyStorage.print();
                    System.out.println("Please input company id");
                    String companyId = scanner.nextLine();
                    Company companyById = companyStorage.getCompanyById(companyId);
                    if (companyById != null) {
                        employeeStorage.searchEmployeeByCompany(companyId);
                    }else {
                        System.out.println("Company does not exists!");
                    }
                    break;
                case "SEARCH_EMPLOYEE_BY_SALARY_RANGE":
                    searchByRange();
                    break;
                case "CHANGE_EMPLOYEE_POSITION_BY_ID":
                    changeEmployeePosition();
                    break;
                case "PRINT_ONLY_ACTIVE_EMPLOYEES":
                    employeeStorage.printActiveEmployees();
                    break;
                case "INACTIVE_EMPLOYEE_BY_ID":
                    System.out.println("Please input id for inactive employee");
                    String id = scanner.nextLine();
                    employeeStorage.inactiveEmployeeById(id);
                    break;
                case "ACTIVATE_EMPLOYEE_BY_ID":
                    System.out.println("Please input id for activate employee");
                    String activateId = scanner.nextLine();
                    employeeStorage.activateEmployeeById(activateId);
                    break;
                case "PRINT_ALL_COMPANIES":
                    companyStorage.print();
                    break;
                default:
                    System.out.println("Wrong command .Please try again");

            }
        }
    }

    private static void AddCompany() {
        System.out.println("Please input id,name,address,phoneNumber,");
        String companyDataStr = scanner.nextLine();
        String[] companyData = companyDataStr.split(",");
        String companyId = companyData[0];
        Company companyById = companyStorage.getCompanyById(SEARCH_EMPLOYEE_BY_COMPANY_ID);
        if (companyById == null) {
            Company company = new Company(companyId, companyData[1], companyData[2], companyData[3]);
            companyStorage.add(company);
            System.out.println("Company was added");
        }else{
            System.out.println("Company whit" + companyId + "already exists");
        }
    }


    private static void employeeAdd() throws ParseException {
        if (companyStorage.getSize() == 0){
            System.out.println("Please add company first!");
            return;
        }
        companyStorage.print();
        System.out.println("please choose company id");
        String companyId =scanner.nextLine();
        Company companyById = companyStorage.getCompanyById(companyId);
        if (companyById != null)
        System.out.println("please input name");
        String name = scanner.nextLine();
        System.out.println("please input surname");
        String surname = scanner.nextLine();
        System.out.println("please input author id");
        String id = scanner.nextLine();
        if (!employeeStorage.checkID(id)) {
            System.out.println("Wrong index");
            return;
        }
        System.out.println("please input salary");
        String salary = scanner.nextLine();
        System.out.println("Please input company name");
        String companyName = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        Date date = new Date();
        employee = new Employee(name, surname, id, Double.parseDouble(salary), companyById, position, date, dateOfBirthday());
        employeeStorage.add(employee);
    }

    private static void searchByRange() {
        System.out.println("Please input minimum");
        int min = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input maximum");
        int max = Integer.parseInt(scanner.nextLine());
        employeeStorage.searchByMaxAndMin(min, max);
    }

    private static void changeEmployeePosition() {
        System.out.println("Please input id for change position");
        String id = scanner.nextLine();
        System.out.println("Please input position");
        String position = scanner.nextLine();
        employeeStorage.changeEmployeePositionById(id, position);
    }

    private static Date dateOfBirthday() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Please input employee birthday (12/02/2023)");
        String dateOfBirthdayStr = scanner.nextLine();
        Date parse = sdf.parse(dateOfBirthdayStr);
        return parse;
    }
}