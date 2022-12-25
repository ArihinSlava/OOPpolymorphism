package Driver;

import Transport.Transport;
import Transport.Competing;

import java.util.Objects;

    public abstract class Driver <T extends Transport & Competing> {
        private String firstName;
        private String middleName;
        private String endName;
        private String driverLicense;
        private int experience;



        public Driver(String firstName, String middleName, String endName, String driverLicense, int experience ) {

            if (firstName == null || firstName.isEmpty() || firstName.isBlank()) {
                this.firstName = "Не указано";
            } else {
                this.firstName = firstName;
            }

            if (middleName == null || middleName.isEmpty() || middleName.isBlank()) {
                this.middleName = "Не указано";
            } else {
                this.middleName = middleName;
            }

            if (endName == null || endName.isEmpty() || endName.isBlank()) {
                this.endName = "Не указано";
            } else {
                this.endName = endName;
            }

            if (Objects.equals(driverLicense, "B") || Objects.equals(driverLicense, "C") || Objects.equals(driverLicense, "D")) {
                this.driverLicense = driverLicense;
            } else {
                this.driverLicense = "Не указано";
            }

            this.experience = Math.max(experience, 0);


        }
        @Override
        public String toString() {
            return "Водитель " + endName + " " + middleName + " " + firstName +
                    "Управляет транспортным средством категории" + driverLicense + "с опытом вождения:" + experience + "лет." ;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Driver<?> driver = (Driver<?>) o;
            return experience == driver.experience && Objects.equals(firstName, driver.firstName) && Objects.equals(middleName, driver.middleName) && Objects.equals(endName, driver.endName) && Objects.equals(driverLicense, driver.driverLicense);
        }

        @Override
        public int hashCode() {
            return Objects.hash(firstName, middleName, endName, driverLicense, experience);
        }

        public abstract void startMoving();

        public abstract void stopMoving();

        public abstract void refuel();


        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getMiddleName() {
            return middleName;
        }

        public void setMiddleName(String middleName) {
            this.middleName = middleName;
        }

        public String getEndName() {
            return endName;
        }

        public void setEndName(String endName) {
            this.endName = endName;
        }

        public String getDriverLicense() {
            return driverLicense;
        }

        public void setDriverLicense(String driverLicense) {
            this.driverLicense = driverLicense;
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }


    }


