public class FirstPerson {
    public static void main(String[] args) {
        Person mrFreeman = new Person();
        mrFreeman.setAge(33);
        mrFreeman.setFullName("mrFreeman");

        Person msJane = new Person("Jane", 25);

        System.out.println(mrFreeman.move() + ", " + mrFreeman.talk());
        System.out.println(msJane.talk() + ", " + msJane.move());
    }

}
