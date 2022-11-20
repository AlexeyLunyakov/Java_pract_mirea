package git.old_pr.pr2_done;

public class Author {
    private String name, email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Автор - " + name + " (" + gender + ")" + " почта " + email;
    }
}







//if(gender != 'm' && gender != 'f')
//        throw new IllegalArgumentException("Недопустимый пол: "+ gender);