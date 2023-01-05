package congnhan.models.model;

public class Worker {
    private String workerCode;
    private String name;
    private String Email;
    private String address;

    public Worker(String workerCode, String name, String email, String address) {
        this.workerCode = workerCode;
        this.name = name;
        Email = email;
        this.address = address;
    }

    public String getWorkerCode() {
        return workerCode;
    }

    public void setWorkerCode(String workerCode) {
        this.workerCode = workerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "workerCode='" + workerCode + '\'' +
                ", name='" + name + '\'' +
                ", Email='" + Email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
