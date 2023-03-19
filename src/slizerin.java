import java.util.Objects;

public class slizerin {
    String name;
    String surname;
    String cunning;
    String ambition;
    String resourcefulness;
    String determination;
     String lustPower;

    public slizerin(String name, String surname, String cunning, String ambition, String resourcefulness, String determination, String lustPower) {
        this.name = name;
        this.surname = surname;
        this.cunning = cunning;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.determination = determination;
        this.lustPower = lustPower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setCunning(String cunning) {
        this.cunning = cunning;
    }

    public void setAmbition(String ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(String resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setDetermination(String determination) {
        this.determination = determination;
    }

    public void setLustPower(String lustPower) {
        this.lustPower = lustPower;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCunning() {
        return cunning;
    }

    public String getAmbition() {
        return ambition;
    }

    public String getResourcefulness() {
        return resourcefulness;
    }

    public String getDetermination() {
        return determination;
    }

    public String getLustPower() {
        return lustPower;
    }

    @Override
    public String toString() {
        return "slizerin{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cunning='" + cunning + '\'' +
                ", ambition='" + ambition + '\'' +
                ", resourcefulness='" + resourcefulness + '\'' +
                ", determination='" + determination + '\'' +
                ", lustPower='" + lustPower + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        slizerin slizerin = (slizerin) o;
        return Objects.equals(name, slizerin.name) && Objects.equals(surname, slizerin.surname) && Objects.equals(cunning, slizerin.cunning) && Objects.equals(ambition, slizerin.ambition) && Objects.equals(resourcefulness, slizerin.resourcefulness) && Objects.equals(determination, slizerin.determination) && Objects.equals(lustPower, slizerin.lustPower);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, cunning, ambition, resourcefulness, determination, lustPower);
    }
}

