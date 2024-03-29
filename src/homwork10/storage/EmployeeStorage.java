package homwork10.storage;

import homwork10.model.Employee;

public class EmployeeStorage {
        private Employee[] array = new Employee[10];
        private int size;
        private static Employee employee = new Employee();


        public void add(Employee item) {
            if (size == array.length) {
                extend();
            }
            array[size++] = item;
        }


        public void print() {
            for (int i = 0; i < size; i++) {
                System.out.println(array[i] + " ");
            }
        }


        public void extend() {
            Employee[] array2 = new Employee[array.length + 10];
            for (int i = 0; i < array.length; i++) {
                array2[i] = array[i];
            }
            array = array2;
        }


        public Employee search(String ID) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                if (employee.getID().toLowerCase().contains(ID.toLowerCase())) {
                    return (employee);
                }
            }
            return null;
        }

        public boolean checkID(String id) {
            boolean check = true;
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                String tmp = employee.getID();
                if (id.equals(tmp)) {
                    check = false;
                }
            }
            return check;
        }

        public void searchByCompany(String company) {
            boolean found = false;
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                if (employee.getCompany(). equals(company)) {
                    found = true;
                    System.out.println(employee.getName() + " " + employee.getSurname());
                }
            }
            if (!found) {
                System.out.println("company " + company + "does not exits");
            }
        }

        public void searchByMaxAndMin(int min, int max) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                double salaryDouble = employee.getSalary();
                int salaryInt = (int) salaryDouble;
                if (min <= salaryInt && max >= salaryInt)
                    System.out.println(array[i] + " ");
            }
        }

        public void changeEmployeePositionById(String id, String position) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                String getId = employee.getID();
                if (getId.equals(id)) {
                    employee.setPosition(position);
                }
            }
        }

        public void printActiveEmployees() {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                if (employee.isActive() == true) {
                    System.out.println(array[i] + " ");
                }
            }
        }

        public void inactiveEmployeeById(String id) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                String getId = employee.getID();
                if (id.equals(getId)) {
                    employee.setActive(false);
                }
            }
        }

        public void activateEmployeeById(String activateId) {
            for (int i = 0; i < size; i++) {
                Employee employee = array[i];
                String getId = employee.getID();
                if (activateId.equals(getId)) {
                    employee.setActive(true);
                }
            }
        }

    public void searchEmployeeByCompany(String companyId) {
    }
}