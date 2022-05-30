package p_30_05_2022;

public class InstagramUser {
    private String username;
    private String imeIPrezime;
    private String email;


    public InstagramUser(String username, String imeIPrezime, String email) {
        this.username = username;
        this.imeIPrezime = imeIPrezime;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
