public class Teacher {
    String name;
    String phone;
    String branch;

    public Teacher(String name, String phone, String branch) {
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    public void print() {
        System.out.println("Adı :" + this.name);
        System.out.println("Telefon :" + this.phone);
        System.out.println("Branşı :" + this.branch);
    }

}