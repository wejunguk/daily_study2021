package com.share.ftp;

import com.share.util.Prompt;

public class LoginMain {

  public static void main(String[] args) {
    while (true) {
      try {
        int menuNo = doMainMenu();

        if (menuNo == 0) {
          break;
        } else if (menuNo == 1) {
          doLoginMenu();
        } else if (menuNo == 2) {
          doSignupMenu();
        } else if (menuNo == 3) {
          doFindIdMenu();
        } else if (menuNo == 4) {
          doFindpwMenu();
        } else if (menuNo == 5) {
          doSnsLoginMenu();
        } else {
          System.out.println("메뉴 번호가 유효하지 않습니다.");
        }
        System.out.println();
      } catch (Throwable e) {
        System.out.println("--------------------------------------------------------------");
        System.out.printf("오류 발생: %s\n", e.getClass().getName());
        System.out.println("--------------------------------------------------------------");
      }
    }
    Prompt.close();
  }

  static void doLoginMenu() {
    while (true) {
      System.out.println("[메인/로그인]");
      System.out.println("1. 로그인");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("0. 이전메뉴");

      int menuNo = Prompt.inputInt("함께해요> ");
      switch (menuNo) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: return;
        default:
          System.out.println("무효한 메뉴 번호입니다.");
      }
      System.out.println();
    }
  }

  static void doSignupMenu() {
    while (true) {
      System.out.println("[메인/함께해요]");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("0. 이전메뉴");

      int menuNo = Prompt.inputInt("함께해요> ");
      switch (menuNo) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: return;
        default:
          System.out.println("무효한 메뉴 번호입니다.");
      }
      System.out.println();
    }
  }

  static void doFindIdMenu() {
    while (true) {
      System.out.println("[메인/함께해요]");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("0. 이전메뉴");

      int menuNo = Prompt.inputInt("함께해요> ");
      switch (menuNo) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: return;
        default:
          System.out.println("무효한 메뉴 번호입니다.");
      }
      System.out.println();
    }
  }

  static void doFindpwMenu() {
    while (true) {
      System.out.println("[메인/함께해요]");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("0. 이전메뉴");

      int menuNo = Prompt.inputInt("함께해요> ");
      switch (menuNo) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: return;
        default:
          System.out.println("무효한 메뉴 번호입니다.");
      }
      System.out.println();
    }
  }

  static void doSnsLoginMenu() {
    while (true) {
      System.out.println("[메인/함께해요]");
      System.out.println("1. ");
      System.out.println("2. ");
      System.out.println("3. ");
      System.out.println("4. ");
      System.out.println("5. ");
      System.out.println("6. ");
      System.out.println("0. 이전메뉴");

      int menuNo = Prompt.inputInt("함께해요> ");
      switch (menuNo) {
        case 1: break;
        case 2: break;
        case 3: break;
        case 4: break;
        case 5: break;
        case 0: return;
        default:
          System.out.println("무효한 메뉴 번호입니다.");
      }
      System.out.println();
    }
  }


  static int doMainMenu() {
    System.out.println("[행복하share에 오신것을 환영합니다.]");

    System.out.println("1. 로그인");
    System.out.println("2. 회원가입");
    System.out.println("3. 아이디찾기");
    System.out.println("4. 비밀번호찾기");
    System.out.println("5. SNS로그인");
    System.out.println("0. 종료");
    return Prompt.inputInt("메뉴번호> "); 
  }

}
