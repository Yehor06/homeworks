
package cartest;

public class driver {

    public driver(String Name, String LastName, String nickname) {
        this.Name = Name;
        this.LastName = LastName;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "driver{" + "Name=" + Name + ", LastName=" + LastName + ", nickname=" + nickname + '}';
    }

    public String getName() {
        return Name;
    }

    public String getLastName() {
        return LastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    private String Name;
    private String LastName;
    private String nickname;
}
