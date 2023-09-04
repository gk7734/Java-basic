public class CPeople {
    private CPeople mFather;
    private CPeople mMother;
    private String mI;
    private int mLifeSpan;

    public CPeople(CPeople mFather, CPeople mMother, String mI, int mLifeSpan) {
        this.mFather = mFather;
        this.mMother = mMother;
        this.mI = mI;
        this.mLifeSpan = mLifeSpan;
    }

    public CPeople getmFather() {
        return mFather;
    }

    public void setmFather(CPeople mFather) {
        this.mFather = mFather;
    }

    public CPeople getmMother() {
        return mMother;
    }

    public void setmMother(CPeople mMother) {
        this.mMother = mMother;
    }

    public String getmI() {
        return mI;
    }

    public void setmI(String mI) {
        this.mI = mI;
    }

    public int getmLifeSpan() {
        return mLifeSpan;
    }

    public void setmLifeSpan(int mLifeSpan) {
        this.mLifeSpan = mLifeSpan;
    }

    public void mShow() {
        System.out.printf("아빠이름:%s 엄마이름:%s 내이름:%s 수명:%d\n", (this.mFather == null) ? "없음" : this.mFather.mI,
        (this.mMother == null)? "없음" : this.mMother.mI, this.mI, this.mLifeSpan);
    }

    public void mHistory() {

    }
}
