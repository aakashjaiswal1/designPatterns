class builderPattern{
    static class Employee{
        String name;
        String accountNo;
        String id;
        String phone;

        public Employee(String name) {
            this.name = name;
        }

    }

    static class Employeebuilder{
        Employee obj;
        Employeebuilder(String name){
            obj = new Employee(name);
        }

        public Employeebuilder setAccountNo(String accountNo) {
            this.obj.accountNo = accountNo;
            return this;
        }

        public Employeebuilder setId(String id) {
            this.obj.id = id;
            return this;
        }

        public Employeebuilder setPhone(String phone) {
            this.obj.phone = phone;
            return this;
        }
        @Override
        public String toString(){
            return this.obj.name+" "+this.obj.accountNo+" "+this.obj.id+" "+this.obj.phone;
        }
    }

    public static void main(String[] args) {
        Employeebuilder emp1 = new Employeebuilder("aakash");
        System.out.println(emp1.setAccountNo("11223").setPhone("9877777777"));
    }

}
