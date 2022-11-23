package cc.jml1024.mvc.service;


public class TestService {
    private String name;
    private String age;
    public TestService() {
    }

    public TestService(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void showName() {
        System.out.println(this.name);
    }

    public void showAge() {
        System.out.println(this.age);
    }
}
