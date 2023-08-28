public class C1_2 {
    private int mGrade;
    private int mClass;
    private int mTeacher;
    private int mTotal;

    public C1_2(int mGrade, int mClass, int mTeacher, int mTotal) {
        this.mGrade = mGrade;
        this.mClass = mClass;
        this.mTeacher = mTeacher;
        this.mTotal = mTotal;
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

    public int getmTeacher() {
        return mTeacher;
    }

    public void setmTeacher(int mTeacher) {
        this.mTeacher = mTeacher;
    }

    public int getmTotal() {
        return mTotal;
    }

    public void setmTotal(int mTotal) {
        this.mTotal = mTotal;
    }

    public void mShow() {
        System.out.println(String.format("학년:%d 반%d 담임쌤:%s 학생수:%d", mGrade, mClass, mTeacher, mTotal));
    }
}
