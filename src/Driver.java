public class Driver extends Person{
    public Driver(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }
    public Driver(){

    }


    @Override
    public void favoriteSport() {
        System.out.println("favoriteSport: tenis");
    }
    @Override
    public void favoriteLanguage() {
        System.out.println("favoriteLanguage: risskiy");
    }
    @Override
    public void favoriteMouth() {
        System.out.println("favoriteMouth: rassiy");
    }
    @Override
    public void getLastName() {
        System.out.println("getLastName: arun");
    }
    @Override
    public void getDateOfBrith() {
        System.out.println("getDateOfBrith: brit");
    }

    @Override
    public void getPhoneNumberAndEmail() {
        System.out.println("PhoneNumberAndEmail: arun@gmail.com");
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }
}
