import java.util.Objects;

public class cogtevran {
    public static void cogtervan(){

    }
    String name;
    String surname;
    String smart;
    String wise;
    String witty;
    String full ;
    String creativity;
    private String fullCreativity;

    public cogtevran(String name, String surname, String smart, String wise, String witty, String fullCreativity) {
        this.name = name;
        this.surname = surname;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.fullCreativity = fullCreativity;

    }

    public void setName(String name) {
        this.name = name;
        System.out.println(" Чжоу Чанг, Падма Патил и Маркус Белби");
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSmart(String smart) {
        this.smart = smart;
    }

    public void setWise(String wise) {
        this.wise = wise;
    }

    public void setWitty(String witty) {
        this.witty = witty;
    }

    public void setFullCreativity(String fullCreativity) {
        this.fullCreativity = fullCreativity;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSmart() {
        return smart;
    }

    public String getWise() {
        return wise;
    }

    public String getWitty() {
        return witty;
    }

    public String getFullCreativity() {
        return fullCreativity;
    }

    @Override
    public String toString() {
        return "cogtevran{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", smart='" + smart + '\'' +
                ", wise='" + wise + '\'' +
                ", witty='" + witty + '\'' +
                ", full='" + full + '\'' +
                ", creativity='" + creativity + '\'' +
                ", fullCreativity='" + fullCreativity + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        cogtevran cogtevran = (cogtevran) o;
        return Objects.equals(name, cogtevran.name) && Objects.equals(surname, cogtevran.surname) && Objects.equals(smart, cogtevran.smart) && Objects.equals(wise, cogtevran.wise) && Objects.equals(witty, cogtevran.witty) && Objects.equals(full, cogtevran.full) && Objects.equals(creativity, cogtevran.creativity) && Objects.equals(fullCreativity, cogtevran.fullCreativity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, smart, wise, witty, full, creativity, fullCreativity);
    }
}