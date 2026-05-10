// role/Lion.java

public class Lion extends Role {

    private String studentId;

    public Lion(
            String name,
            String major,
            int generation,
            String part,
            String studentId
    ) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public SubmitPolicy getPolicy() {
        return new LionPolicy();
    }

    @Override
    public String getInfo() {

        return " 역할: 아기사자\n"
                + " 이름: " + getName()
                + " 전공: " + getMajor()
                + " 기수: " + getGeneration()
                + " 파트: " + getPart()
                + "\n학번: " + studentId;
    }
}
