import java.util.Objects;

public class pufenduy {
    public static void pufenduy(){

    }
    String name;
    String surname;
    String hardworking;
    String loyal;
    String honest;

    public pufenduy(String name, String surname, String hardworking, String loyal, String honest) {
        this.name = name;
        this.surname = surname;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHardworking(String hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(String loyal) {
        this.loyal = loyal;
    }

    public void setHonest(String honest) {
        this.honest = honest;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getHardworking() {
        return hardworking;
    }

    public String getLoyal() {
        return loyal;
    }

    public String getHonest() {
        return honest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        pufenduy pufenduy = (pufenduy) o;
        return Objects.equals(name, pufenduy.name) && Objects.equals(surname, pufenduy.surname) && Objects.equals(hardworking, pufenduy.hardworking) && Objects.equals(loyal, pufenduy.loyal) && Objects.equals(honest, pufenduy.honest);
    }
    public void pudenduy(pufenduy pufenduy){

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, hardworking, loyal, honest);
    }

    @Override
    public String toString() {
        return "pufenduy{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", hardworking='" + hardworking + '\'' +
                ", loyal='" + loyal + '\'' +
                ", honest='" + honest + '\'' +
                '}';
    }
}

