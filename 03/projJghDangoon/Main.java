public class Main {
  public static void main(String[] args) {
    CPeople objHwanwoong = new CPeople(null, null, "환웅", 800);
//    objHwanwoong.mShow();

    CPeople objWoongyeo = new CPeople(null, null, "웅녀", 850);
//    objWoongyeo.mShow();

    CPeople objDangoon = new CPeople(objHwanwoong, objWoongyeo, "단군", 900);
//    objDangoon.mShow();

    CPeople objBiseogabMo = new CPeople(null, null, "비서갑모", 950);

    CPeople objBiseogab = new CPeople(null, objBiseogabMo, "비서갑", 950);
      objBiseogab.mHistoryM(objBiseogab.getmMother());

    CPeople objBuru = new CPeople(objDangoon, objBiseogab, "부루", 1000);
    objBuru.mHistory(objBuru.getmFather());
  }
}