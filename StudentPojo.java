public class StudentPojo {

    // create our fields
    private String id;
    private String name;
    private String DateOfBirth;
    private String classList;

    // create constructor
    public StudentPojo(String id, String name, String dateOfBirth, String classList) {
        this.id = id;
        this.name = name;
        DateOfBirth = dateOfBirth;
        this.classList = classList;
    }


    //toString to customise the representation of the return String
    @Override
    public String toString() {
        return "StudentPojo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", DateOfBirth='" + DateOfBirth + '\'' +
                ", classList='" + classList + '\'' +
                '}';
    }
}

