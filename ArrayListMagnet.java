//block
import java.util.*;
//end-block

//block
public class ArrayListMagnet {
//end-block

  //block
  public static void main(String[] args) {
    //end-block

    //block
    ArrayList<String> a = new ArrayList<String>();
    //end-block

    //block
    a.add(0, "zero");
    a.add(1, "one");
    //end-block

    //block
    a.add(2, "two");
    //end-block

    //block
    a.add(3, "three");
    printAL(a);
    //end-block

    //block
    a.remove(2);
    //end-block

    //block
    if (a.contains("three")) {
      a.add("four");
    }
    //end-block

    //block
    printAL(a);
    //end-block

    //block
    if (a.indexOf("four") != 4) {
      a.add(4, "4.2");
    }
    //end-block

    //block
    printAL(a);
    //end-block

    //block
    if (a.contains("two")) {
      a.add(4, "2.2");
    }
    //end-block

    //block
    printAL(a);
    //end-block
  }

  //block
  public static void printAL(ArrayList<String> al) {
  //end-block

    //block
    for (String element : al) {
    //end-block

    //block
      System.out.print(element + "  ");
    }
    System.out.println(" ");
    //end-block

  }
}
