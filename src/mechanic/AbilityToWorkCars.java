package mechanic;

public enum AbilityToWorkCars {

    ABILITY_CARS("Ремонт легкового авто"),
    ABILITY_TRUCK("Ремонт грузового авто"),
    ABILITY_BUS("Ремонт автобусов"),
    ABILITY_UNIVERSAL("Ремонт всех типов транспорта");

    private final String Ability;


    AbilityToWorkCars(String ability) {
        Ability = ability;
    }

    public String getAbility() {
        return Ability;
    }

    @Override
    public String toString() {
        return "AbilityToWorkCars{" +
                "Ability='" + Ability + '\'' +
                '}';
    }
}
