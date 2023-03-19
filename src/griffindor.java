import java.util.Objects;

public class griffindor {
    String name;
    String surname;
    String nobility;
    String honor;
    String courage;

    public griffindor(String name, String surname, String nobility, String honor, String courage) {
        this.name = name;
        this.surname = surname;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Гарри Поттер, Гермиона Грейнджер и Рон Уизли");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNobility(String nobility) {
        this.nobility = nobility;
    }

    public void setHonor(String honor) {
        this.honor = honor;
    }

    public void setCourage(String courage) {
        this.courage = courage;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNobility() {
        return nobility;
    }

    public String getHonor() {
        return honor;
    }

    public String getCourage() {
        return courage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        griffindor that = (griffindor) o;
        return Objects.equals(name, that.name) && Objects.equals(surname, that.surname) && Objects.equals(nobility, that.nobility) && Objects.equals(honor, that.honor) && Objects.equals(courage, that.courage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, nobility, honor, courage);
    }

    @Override
    public String toString() {
        return "griffindor{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", nobility='" + nobility + '\'' +
                ", honor='" + honor + '\'' +
                ", courage='" + courage + '\'' +
                '}';
    }
}
