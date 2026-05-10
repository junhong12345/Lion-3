// role/Role.java

public abstract class Role {

    // 공통 속성
    private String name;
    private String major;
    private int generation;
    private String part;

    // 생성자
    public Role(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    // getter
    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getGeneration() {
        return generation;
    }

    public String getPart() {
        return part;
    }

    // 정책 객체 반환
    public abstract SubmitPolicy getPolicy();

    // 정보 출력용 추상 메서드
    public abstract String getInfo();

    // 과제 제출 가능 여부
    public boolean canSubmitAssignment() {
        return getPolicy().canSubmit();
    }
}
