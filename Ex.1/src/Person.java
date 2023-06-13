
public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("Hello! My name is " + name + ".");
    }
}

class Professor extends Person {

    private String specialization;
    public Professor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }
    public String getSpecialization() {
        return specialization;
    }

    public void introduce() {
        System.out.println("My specialization is " + specialization + ".");
    }
}

class Student extends Person {

    private int graduationGrade;
    public Student(String name, int age, int graduationGrade) {
        super(name, age);
        this.graduationGrade = graduationGrade;
    }
    public int getGrades() {
        return graduationGrade;
    }

    public void introduce() {
        System.out.println("My graduation grade is " + graduationGrade + ".");
    }
}

class Janitor extends Person {

    private boolean hasExperience;

    public Janitor(String name, int age, boolean hasExperience) {
        super(name, age);
        this.hasExperience = hasExperience;
    }

    public boolean isHasExperience() {
        return hasExperience;
    }

    public void introduce() {
        super.introduce();
        if (hasExperience) {
            System.out.println("I am a janitor with experience.");
        } else {
            System.out.println("I have no prior experience.");
        }
    }
}

class SecurityGuard extends Person {

    private int securityLevel;

    public SecurityGuard(String name, int age, int securityLevel) {
        super(name, age);
        this.securityLevel = securityLevel;
    }

    public int getsecurityLevel() {
        return securityLevel;
    }

    public void introduce() {
        System.out.println("I am a security guard level" + securityLevel + ".");
    }
}


