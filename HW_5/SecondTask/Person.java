package HW5_2;

class Person {
    private String firstName, lastName;
    Season favSeason;

    public Person(String firstName, String lastName, Season favSeason) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favSeason = favSeason;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public Season getFavSeason() {
        return favSeason;
    }

    public void setFavSeason(Season favSeason) {
        this.favSeason = favSeason;
    }

    @Override
    public String toString() {
        return "Person{" +
                "First Name='" + firstName + '\'' +
                ", Last Name='" + lastName + '\'' +
                ", Favorite Season=" + favSeason +
                ", Favorite Game " + favSeason.gameForSeason +
                '}';
    }
}
