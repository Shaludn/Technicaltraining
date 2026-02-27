package week1;

class employee{
    int id;
    String name;
    double salary;

    employee(int i, String n, double s){
        id=i;
        name=n;
        salary=s;
    }

    void print(){
        System.out.println("emp id "+ id+ "|"+ " name " + name+"|"+ " salary "+salary);
    }

    public static void main(String[] args){
        employee emp1= new employee(1, " Shubham", 45000);
        employee emp2=new employee(2, "Subha", 58000);
        emp1.print();
        emp2.print();
    }
}