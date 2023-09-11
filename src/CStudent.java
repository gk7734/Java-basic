public class CStudent  extends CClass{
    private String mName;
    private int mNumber;
    private String mMBTI;

    public CStudent(CSchool pSchool, CClass pClass, String mName, int mNumber, String mMBTI) {
        super(pSchool, pClass);
        this.mName = mName;
        this.mNumber = mNumber;
        this.mMBTI = mMBTI;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmNumber() {
        return mNumber;
    }

    public void setmNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public String getmMBTI() {
        return mMBTI;
    }

    public void setmMBTI(String mMBTI) {
        this.mMBTI = mMBTI;
    }

    public void mShow() {
        super.mShow(); // 부모 mShow 호출
        System.out.printf("이름:%s 번호:%d MBTI:%s \n", mName, mNumber, mMBTI);
    }
}
