package Q6_RecordEmployee;

public record Employee(String id, double salary){
    public Employee{
        if(salary <=0) {
            throw new IllegalArgumentException("salary cant be less than this parameter");
        }

    }

    public boolean isHighEarner(){
        return salary > 1000000;
    }
}

 class Main {

    public static void main(String[] args){

        Employee emp = new Employee("C-101", 12000000);

        System.out.println(emp);
        System.out.println("High earner" + emp.isHighEarner() );

    }
}
