package algorithm.metanetQuest.phoneNumberInformProgram;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneNumberInformProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Phone> phoneList = new ArrayList<>();
        System.out.println("========================");
        System.out.println("안녕하십니까! 전화번호 정보 관리 프로그렘입니다.");
        System.out.println("시작을 원하시면 start를 입력해주세요.");
        System.out.println("start를 입력하지 않으면 프로그렘은 종료됩니다.");
        System.out.println("========================");
        String s = scanner.nextLine();

        //프로그렘 시작
        while (s.equalsIgnoreCase("start")) {
            System.out.println("========================");
            System.out.println("원하시는 메뉴의 번호를 입력해 주세요.");
            System.out.println("1. 전화번호 정보 등록");
            System.out.println("2. 전화번호 정보 삭제");
            System.out.println("3. 전화번호 정보 찾기");
            System.out.println("4. 전화번호 정보 전체 보기");
            System.out.println("5. 프로그렘 종료");
            System.out.println("========================");

            //메뉴 외에 입력값 예외처리
            try {
                int menu = scanner.nextInt();

                //메뉴값 범위 지정
                if (1 <= menu && menu <= 5) {
                    if (menu == 1) {

                        //1번 메뉴 실행
                        do {
                            System.out.println("========================");
                            System.out.println("전화번호 정보 등록 메뉴를 선택하셨습니다.");
                            System.out.println("이름/주소/전화번호 순서로 각각 입력해 주세요. 나가시려면 out을 입력해주세요.");
                            System.out.println("※전화번호는 01양식으로 시작하며 중간'-'를 생략할 수 있습니다.");
                            System.out.println("========================");

                            //인트입력 다음 스트링입력시 인트값이 자동입력되는 상황 방지용(scanner.nextLine()으로 대신 입력 처리됨으로 처리)
                            scanner.nextLine();

                            //입력 양식에 안맞으면 생기는 예외 처리
                            try {
                                String s1 = scanner.nextLine();

                                //나가기 입력 if문
                                if (!s1.equalsIgnoreCase("out")) {
                                    String[] inform = s1.split("/");

                                    //유효성 체크
                                    if (Pattern.matches("^01([0|1|6|7|8|9])-?([0-9]{3,4})-?([0-9]{4})$", inform[2])) {
                                        Phone p = new Phone(inform[0], inform[1], inform[2]);

                                        System.out.println("========================");
                                        System.out.println("입력하신 정보가" + p + "가 맞습니까?");
                                        System.out.println("맞으시면 1번, 틀리면 2번을 입력해주세요.");
                                        System.out.println("========================");

                                        //등록 확인
                                        if (scanner.nextInt() != 1) menu = 0;
                                        else {
                                            phoneList.add(p);
                                            System.out.println("========================");
                                            System.out.println("등록 되었습니다.");
                                            System.out.println("========================");
                                            menu = 1;
                                        }

                                    } else {
                                        System.out.println("========================");
                                        System.out.println("※전화번호는 01양식으로 시작하며 중간'-'를 생략할 수 있습니다. 알겠으면 아무키나 입력해주세요.");
                                        System.out.println("========================");

                                        //위에 인트값으로 확인 처리 한거 때문에 인트값 자동 전달해줘야 scanner.nextLine()가 정상작동
                                        try {
                                            scanner.nextInt();
                                        } catch (Exception ignored) {
                                        }

                                        menu = 0;
                                    }

                                } else menu = 0;

                            } catch (ArrayIndexOutOfBoundsException e) {
                                System.out.println("========================");
                                System.out.println("입력값은 이름/주소/전화번호 순서로 양식에 맞춰 입력해주세요. 알겠으면 아무키나 입력해주세요.");
                                System.out.println("========================");
                                try {
                                    scanner.nextInt();
                                } catch (Exception ignored) {
                                }
                                menu = 0;
                            }
                        } while (menu == 0);

                    } else if (menu == 2) {

                        //2번 메뉴 실행
                        do {
                            System.out.println("========================");
                            System.out.println("전화번호 정보 삭제 메뉴를 선택하셨습니다.");
                            System.out.println("삭제하고자 하시는 전화번호 정보의 전화번호를 입력해주세요. 나가시려면 out을 입력해주세요.");
                            System.out.println("========================");

                            scanner.nextLine();
                            String delete = scanner.nextLine();
                            int f = 0;

                            if (delete.equalsIgnoreCase("out")) menu = 2;
                            else {
                                String check = "";

                                for (int i = 0; i < phoneList.size(); i++) {
                                    if (phoneList.get(i).getPhoneNumber().equals(delete)) {
                                        f = i;
                                        check = "pass";
                                    }
                                }

                                if (!check.equals("pass")) {
                                    System.out.println("========================");
                                    System.out.println("입력하신 정보가 없거나 찾을 수 없습니다.");
                                    System.out.println("다시 입력해주세요. 확인하셨으면 아무키나 입력해주세요.");
                                    System.out.println("========================");

                                    try {
                                        scanner.nextInt();
                                    } catch (Exception ignored) {
                                    }
                                    menu = 0;

                                } else {
                                    System.out.println("========================");
                                    System.out.println("삭제하려는 정보가 " + phoneList.get(f) + "맞습니까?");
                                    System.out.println("맞으시면 1번, 틀리면 2번을 입력해주세요.");
                                    System.out.println("========================");

                                    if (scanner.nextInt() != 1) menu = 0;
                                    else {
                                        phoneList.remove(f);
                                        System.out.println("========================");
                                        System.out.println("성공적으로 삭제가 되었습니다.");
                                        System.out.println("========================");
                                        menu = 2;
                                    }
                                }
                            }
                        } while (menu == 0);

                    } else if (menu == 3) {

                        //3번 메뉴 실행
                        do {
                            System.out.println("========================");
                            System.out.println("전화번호 정보 찾기 메뉴를 선택하셨습니다.");
                            System.out.println("찾고자 하시는 전화번호 정보의 이름을 입력해주세요. 나가시려면 out을 입력해주세요.");
                            System.out.println("========================");

                            scanner.nextLine();
                            String find = scanner.nextLine();
                            Phone p = null;

                            if (find.equalsIgnoreCase("out")) menu = 3;
                            else {
                                String check = "";

                                for (int i = 0; i < phoneList.size(); i++) {
                                    if (phoneList.get(i).getName().equals(find)) {
                                        p = phoneList.get(i);
                                        check = "pass";
                                    }
                                }

                                if (!check.equals("pass")) {
                                    System.out.println("========================");
                                    System.out.println("입력하신 정보가 없거나 찾을 수 없습니다.");
                                    System.out.println("다시 입력해주세요. 확인하셨으면 아무키나 입력해주세요.");
                                    System.out.println("========================");

                                    try {
                                        scanner.nextInt();
                                    } catch (Exception ignored) {
                                    }
                                    menu = 0;

                                } else {
                                    System.out.println("========================");
                                    System.out.println("찾으시는 정보가 " + p + "가 맞습니까?");
                                    System.out.println("맞으시면 1번, 틀리면 2번을 입력해주세요.");
                                    System.out.println("========================");

                                    if (scanner.nextInt() != 1) menu = 0;
                                    else menu = 3;
                                }
                            }
                        } while (menu == 0);


                    } else if (menu == 4) {

                        //4번 메뉴 실행
                        System.out.println("========================");
                        System.out.println("전화번호 정보 전체 보기 메뉴를 선택하셨습니다.");

                        //리스트에 데이터가 있는지 없는지 체크
                        if (phoneList.isEmpty()) System.out.println("등록된 정보가 없습니다.");
                        else phoneList.forEach(System.out::println);
                        System.out.println("========================");

                    } else break; //5번 메뉴 실행

                } else {
                    System.out.println("========================");
                    System.out.println("1 ~ 5에 해당하는 숫자값을 입력해주세요.");
                    System.out.println("========================");
                }

            } catch (InputMismatchException in) {
                System.out.println("========================");
                System.out.println("1 ~ 5 사이의 메뉴 번호를 입력해주세요.");
                System.out.println("========================");

                try {
                    scanner.nextLine();
                } catch (Exception ignored) {
                }
            }

        }

    }
}
