class SingletonPattern{
     static class Employee{
         ArrayList<String> friends = new ArrayList<>();
        private static final Employee EmployeeInst = new Employee();
        private Employee(){}
        public static Employee getInstance(){
            return EmployeeInst;
        }
        public void addFriend(String name){
            this.friends.add(name);
        }
        public ArrayList getFriends() {
            return this.friends;
        }
    }

    public static void main(String[] args) {
         // All the frinds of all employees should be commonly displayed
        Employee e1 = Employee.getInstance();
        e1.addFriend("aakash");
        Employee e2 = Employee.getInstance();
        System.out.println(e2.getFriends());
    }
}
