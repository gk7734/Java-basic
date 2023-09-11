public class CSchool {
    private String mBoss;
    private String mSchnm;
    private String mAddr;

    public CSchool(String mBoss, String mSchnm, String mAddr) {
        this.mBoss = mBoss;
        this.mSchnm = mSchnm;
        this.mAddr = mAddr;
    }

    public CSchool(CSchool pObj) {
        this.mBoss = pObj.mBoss;
        this.mSchnm = pObj.mSchnm;
        this.mAddr = pObj.mAddr;
    }

    public String getmBoss() {
        return mBoss;
    }

    public void setmBoss(String mBoss) {
        this.mBoss = mBoss;
    }

    public String getmSchnm() {
        return mSchnm;
    }

    public void setmSchnm(String mSchnm) {
        this.mSchnm = mSchnm;
    }

    public String getmAddr() {
        return mAddr;
    }

    public void setmAddr(String mAddr) {
        this.mAddr = mAddr;
    }

    public void mShow() {
        System.out.printf("학교명:%s Boss:%s 주소:%s", this.mSchnm, this.mBoss, this.mAddr);
    }
}
