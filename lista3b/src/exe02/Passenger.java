package exe02;

public class Passenger {
    private Number id;
    private String name;
    private String cpf;

    public Passenger() {
    }

    public Passenger(int id, String name, String cpf) {
        this.setId(id);
        this.setName(name);
        this.setCpf(cpf);
    }

    public Number getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
