 class nullDesignPattern {
    static abstract class Cell{
        String model;
        String company;
        double price;
        abstract void print();
    }
    static class Phone extends Cell{
        Phone(String model,String company,double price){
            this.model = model;
            this.company = company;
            this.price = price;
        }

        @Override
        void print() {
            System.out.println(this.model +" "+ this.company);
        }
    }
    static class NullPhone extends  Cell{
        @Override
        void print() {
            System.out.println("Null");
        }
    }

    public static void main(String[] args) {
        Cell phone1 = new Phone("AC","LG",33333.0);
        Cell phone2 = new NullPhone();
        phone1.print();
        phone2.print();
    }
}

