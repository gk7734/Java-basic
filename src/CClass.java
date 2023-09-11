public class CClass extends CSchool{
    private int mGrade;
    private int mClass;
    private String mTeacher;

    public CClass(CSchool pObj, int mGrade, int mClass, String mTeacher) {
        super(pObj);
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
    }

    public CClass(CSchool pSchool, CClass pClass) {
        super(pSchool); // 부모 생성자 호출
        this.mGrade = pClass.mGrade;
        this.mClass = pClass.mClass;
        this.mTeacher = pClass.mTeacher;
    }

    public int getmGrade() {
        return mGrade;
    }

    public void setmGrade(int mGrade) {
        this.mGrade = mGrade;
    }

    public int getmClass() {
        return mClass;
    }

    public void setmClass(int mClass) {
        this.mClass = mClass;
    }

    public String getmTeacher() {
        return mTeacher;
    }

    public void setmTeacher(String mTeacher) {
        this.mTeacher = mTeacher;
    }

    public void mShow() {
        super.mShow(); // 학교(부모) 정보 출력
        System.out.printf("학년:%s 반:%s 담임:%s", this.mGrade, this.mClass, this.mTeacher);
    }
}