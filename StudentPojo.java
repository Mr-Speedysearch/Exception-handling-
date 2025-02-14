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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getClassList() {
        return classList;
    }

    public void setClassList(String classList) {
        this.classList = classList;
    }
}

/* Pojo is a class with attributes and its getters and setters. boilerplate code
    However we can also use the *Record* Type, to replace boilerplate code and be more restrictive "plain data carriers"
    A record is a special class with data that cant be altered, it only contains methods like constructors.
    Record code doesn't need to be generated.
 */