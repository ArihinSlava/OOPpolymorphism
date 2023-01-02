package transport;

public enum BodyType {

    BODY_TYPE_SEDAN("Седан"),
    BODY_TYPE_HATCHBACK("Хетчбек"),
    BODY_TYPE_COUPE("Купе"),
    BODY_TYPE_UNIVERSAL("Универсал"),
    BODY_TYPE_OFFROAD("Внедорожник"),
    BODY_TYPE_CROSSOVER("Кроссовер"),
    BODY_TYPE_PICKUP("Пикап"),
    BODY_TYPE_VAN("Фургон"),
    BODY_TYPE_MINIVAN("Минивэн");


    private final String bodyType;

    BodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getBodyType() {
        return bodyType;
    }

    @Override
    public String toString() {
        return "BodyType" + bodyType;

    }
}
