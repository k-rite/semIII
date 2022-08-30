class person {
    String name;
    int pid;

    public void printperson() {
        System.out.println("PID=" + pid + "\t" + "Name=" + name);
    }
}

class Emp_D extends person {
    int eid;
    String dname;
    int salary;

    public void printemp() {
        System.out.println("PID=" + pid + "\t" + "Name=" + name);
        System.out.println("EID=" + eid + "\t" + "Name=" + dname + "\t Salary" + salary);

    }

    public static void main(String[] args) {
        person p1 = new person();
        p1.pid = 120;
        p1.name = "ABCD";
        p1.printperson();
        Emp_D e1 = new Emp_D();
        e1.pid = 244;
        e1.name = "dsfg";
        e1.eid = 343;
        e1.dname = "Account";
        e1.salary = 3435;
        e1.printemp();
    }
}