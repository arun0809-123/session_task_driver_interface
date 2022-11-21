public  class Programmer extends Person{

    public Programmer(int id, String fullName, byte age, char gender, String email, long phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }
    public Programmer(){

    }
    @Override
    public void favoriteSport() {
        System.out.println("favoriteSport: fudbol");
    }

    @Override
    public void favoriteLanguage() {
        System.out.println("favoriteLanguage: kyrgistan");
    }

    @Override
    public void favoriteMouth() {
        System.out.println("favoriteMouth: kyrgiskiy");
    }

    @Override
    public void getLastName() {
        System.out.println("LastName: jalilava");
    }

    @Override
    public void getDateOfBrith() {
        System.out.println("DateOfBrith: brit");
    }

    @Override
    public void getPhoneNumberAndEmail() {
        System.out.println("jalilava@gmail.com");
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        return new long[0];
    }


}
