public class Main {
  public static void main(String[] args) {
    CSchool objSchool = new CSchool("yh", "dgsw", "guji");
    CClass obj1_2 = new CClass(objSchool, 1, 2, "윤성원");
    CStudent objHyeongeon = new CStudent(objSchool, obj1_2, "박형언", 10, "ENTP");
    objHyeongeon.mShow();
    CStudent objJiwon = new CStudent(objSchool, obj1_2, "김지원", 8, "INTJ");
    objJiwon.mShow();

    CClass obj1_1 = new CClass(objSchool, 1, 1, "김창대");
    CStudent objMungar = new CStudent(objSchool, obj1_1, "문가인", 11, "ENTP");
    objMungar.mShow();
  }
}