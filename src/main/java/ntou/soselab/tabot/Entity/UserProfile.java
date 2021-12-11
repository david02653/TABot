package ntou.soselab.tabot.Entity;

import java.util.HashMap;

public class UserProfile {

    private String name;
    private String studentId;
    private String discordId;

    public UserProfile(String name, String studentId, String discordId){
        this.name = name;
        this.studentId = studentId;
        this.discordId = discordId;
    }

    public UserProfile(HashMap map){
        this.name = (String)map.get("name");
        this.studentId = (String)map.get("studentId");
        this.discordId = (String)map.get("discordId");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setDiscordId(String discordId) {
        this.discordId = discordId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getDiscordId() {
        return discordId;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                ", discordId='" + discordId + '\'' +
                '}';
    }
}
