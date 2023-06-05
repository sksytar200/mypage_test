package Group2.capstone_project.dto.client;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.multipart.MultipartFile;

public class ClientDto {

    private final PasswordEncoder passwordEncoder;

    public ClientDto(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private String id;
    private String name;
    private String age;
    private String studentNumber;
    private String password;

    private String school;
    private String email;
    private String department;

    private String joinCheck;

    private static String question;
    private static String answer;

    private String question2;
    private String answer2;

    private String adminCheck;

    private MultipartFile imageFile;

    public MultipartFile getImageFile() {
        return imageFile;
    }

    public void setImageFile(MultipartFile imageFile) {
        this.imageFile = imageFile;
    }


    public String getAdminCheck() {
        return adminCheck;
    }

    public void setAdminCheck(String adminCheck) {
        this.adminCheck = adminCheck;
    }

    public String getJoinCheck() {
        return joinCheck;
    }

    public void setJoinCheck(String joinCheck) {
        this.joinCheck = joinCheck;
    }

    public String getLeader() {
        return Leader;
    }

    public void setLeader(String leader) {
        Leader = leader;
    }

    private String Leader;

    public static String getQuestion(){ return question;}
    public void setQuestion(String question){this.question=question;}
    public static String getAnswer(){ return answer;}

    public void setAnswer(String answer){this.answer=answer; }





    public String getQuestion2(){ return question2;}
    public void setQuestion2(String question2){this.question2=question2;}
    public String getAnswer2(){ return answer2;}

    public void setAnswer2(String answer2){this.answer2=answer2; }



    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber (String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
