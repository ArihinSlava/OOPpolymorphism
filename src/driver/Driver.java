package driver;

import transport.Competing;
import transport.Transport;

import java.time.LocalDate;
import java.util.Objects;

    public class Driver <T extends Transport & Competing> {
        private String firstName;
        private String middleName;
        private String endName;
        private String driverLicense;
        private int experience;



        public Driver(String firstName, String middleName, String endName, String driverLicense, int experience) {

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

            this.experience = experience;
        }

        @Override
        public String toString() {
            return "Водитель: " + getEndName() + " " + getMiddleName() + " " +
                    getFirstName() + ". Имеет водительские права категории: " + getDriverLicense() +
                    ". Опыт вождения: " + getExperience();
        }

        public void drive(T transport) {
            System.out.println("Водитель ФИО: " + firstName + " " + middleName + " " + endName +
                    ". Управляет транспортным средством " + transport.getBrand() + " " + transport.getModel() +
                    ". Будет учавстовать в заезде. ");

        }

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
            if (driverLicense == null || driverLicense.isEmpty()) {
                try {
                    throw new DriversLicenceException("Необходимо указать категорию прав для водителя " + getEndName() + getMiddleName() + getFirstName());
                } catch (DriversLicenceException e) {
                    System.out.println(e.getMessage());
                }
            } else if (driverLicense.equals("B") || driverLicense.equals("C") || driverLicense.equals("D")) {
                this.driverLicense = driverLicense;
            } else {
                try {
                    throw new DriversLicenceException("Необходимо указать категорию прав для водителя " + getEndName() + getMiddleName() + getFirstName());
                } catch (DriversLicenceException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        public int getExperience() {
            return experience;
        }

        public void setExperience(int experience) {
            this.experience = experience;
        }


        public void startMoving() {
            System.out.println("Водитель " + endName + " " +
                    middleName + " " + endName + " начинает движение.");
        }

        public void stopMoving() {
            System.out.println("Водитель " + endName + " " +
                    middleName + " " + endName + " заканчивает движение.");
        }

        public void refuelCar() {
            System.out.println("Водитель " + endName + " " +
                    middleName + " " + endName + " заправляется.");
        }
    }


