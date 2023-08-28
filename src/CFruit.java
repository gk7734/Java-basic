public class CFruit {
    private String mName; // 과일 이름
    private int mCnt; // 갯수

    public CFruit(String mName, int mCnt) {
        this.mName = mName;
        this.mCnt = mCnt;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmCnt() {
        return mCnt;
    }

    public void setmCnt(int mCnt) {
        this.mCnt = mCnt;
    }

    public void mBuy(int pCnt) {
        this.mCnt += pCnt;
        this.mShow();
    }

    public void mEat(int pCnt) {
        this.mCnt -= pCnt;
        this.mShow();
    }

    public void mShow() {
        System.out.println(String.format("과일명:%s 갯수:%d", this.mName, this.mCnt));
    }
}
