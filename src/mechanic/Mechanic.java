package mechanic;

import transport.Car;

import java.util.Objects;

public class Mechanic {

    private final String firstName;
    private final String lastName;
    private String company;
    private final AbilityToWorkCars abilityToWorkCars;

    public Mechanic(String firstName, String lastName, String company, AbilityToWorkCars abilityToWorkCars) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.abilityToWorkCars = abilityToWorkCars;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public AbilityToWorkCars getAbilityToWorkCars() {
        return abilityToWorkCars;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company == null || company.isBlank() || company.isEmpty()) {
            this.company = " Компания не указаана";
        } else {
            this.company = company;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(firstName, mechanic.firstName) && Objects.equals(lastName, mechanic.lastName) && Objects.equals(company, mechanic.company) && abilityToWorkCars == mechanic.abilityToWorkCars;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, company, abilityToWorkCars);
    }

    @Override
    public String toString() {
        return getLastName() + " " + getFirstName() + " из компании: " +
                getCompany() + ". С квалификацией: " + abilityToWorkCars.getAbility();
    }


}
