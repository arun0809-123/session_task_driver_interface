public class Doctor extends Person{
    public Doctor(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    public Doctor() {

    }

    public void Doctor(){

    }


    @Override
    public void favoriteSport() {
        System.out.println("favoriteSport: fudbol");
    }

    @Override
    public void favoriteLanguage() {
        System.out.println("favoriteLanguage: English");
    }

    @Override
    public void favoriteMouth() {
        System.out.println("favoriteMouth: amerika");
    }

    @Override
    public void getLastName() {
        System.out.println("LastName: altyn");
    }

    @Override
    public void getDateOfBrith() {
        System.out.println("DateOfBrith: brit");
    }

    @Override
    public void getPhoneNumberAndEmail() {
        System.out.println("PhoneNumberAndEmail: altyn@gmail.com");
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }

}
