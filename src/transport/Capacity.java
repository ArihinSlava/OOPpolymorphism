package transport;

public enum Capacity {
    EXTRA_SMALL(0,10),
    SMALL(10,25),
    MEDIUM(40,50),
    LARGE(60,80),
    EXTRA_LARGE(100,120);

    private final int capacityLowerLimit;
    private final int capacityUpperLimit;

    Capacity(int capacityLowerLimit, int capacityUpperLimit) {
        this.capacityLowerLimit = capacityLowerLimit;
        this.capacityUpperLimit = capacityUpperLimit;
    }

    public int capacityLowerLimit() {
        return capacityLowerLimit;
    }

    public int capacityUpperLimit() {
        return capacityUpperLimit;
    }

    @Override
    public String toString() {
        return "CapacityLowerLimit" + capacityLowerLimit +
                ", CapacityUpperLimit" + capacityUpperLimit;
    }
}
