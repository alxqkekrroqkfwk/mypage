package FEE;
import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.io.CharArrayReader;
import java.util.*;
import java.util.List;

public class kiosk {
    int count  = 0;
    double sum =0;
    double totalsum = 0;

    ArrayList<Product> cart = new ArrayList<>();

    Scanner scan = new Scanner(System.in);
    Product p = new Product();

    public void showMainMenu(){
        System.out.println("[ SHAKESHACK MENU ]");
        System.out.println("1.Burgers       | 앵거스 비프 통살을 다져 만든 버거");
        System.out.println("2.Frozen Custard       | 매장에서 신선하게 만든 아이스크림");
        System.out.println("3.Drinks       | 매장에서 직접 만드는 음료");
        System.out.println("4.Beer       | 뉴욕 브루클린 브루어리에서 양조한 맥주");

        System.out.println("[ ORDER MENU ]");
        System.out.println("5. Order       | 장바구니를 확인 후 주문합니다.");
        System.out.println("6. Cancel      | 진행중인 주문을 취소합니다.");
    }
    public void showBurgerMenu() {
        Product[] Burger = new Product[3];
        Burger[0] = new Product("햄버거1",5.5,"첫번째 메뉴");
        Burger[1] = new Product("햄버거2",2.2,"두번째 메뉴");
        Burger[2] = new Product("햄버거3",4.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Burger.length ; i++) { System.out.println(i+1 +". "+Burger[i].getName() + " | " + Burger[i].getPrice() + " | " + Burger[i].getExplain());}

        System.out.println("123 중 하나를 선택하세요");
        int choice = scan.nextInt();
        if (choice == 1 ){

            cart.add(Burger[choice-1]);
            System.out.println(Burger[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 2 ){

            cart.add(Burger[choice-1]);
            System.out.println(Burger[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 3 ){

            cart.add(Burger[choice-1]);
            System.out.println(Burger[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }

        return ;

    }


    public void showIceCreamMenu() {
        Product[] iceCream = new Product[3];
        iceCream[0] = new Product("아이스크림1",1.5,"첫번째 메뉴");
        iceCream[1] = new Product("아이스크림2",2.0,"두번째 메뉴");
        iceCream[2] = new Product("아이스크림3",4.4,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <iceCream.length ; i++) {
            System.out.println(iceCream[i].getName() + " | " + iceCream[i].getPrice() + " | " + iceCream[i].getExplain());
        }

        System.out.println("123 중 하나를 선택하세요");
        int choice = scan.nextInt();
        if (choice == 1 ){

            cart.add(iceCream[choice-1]);
            System.out.println(iceCream[choice-1].getName()+"이/(가) 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 2 ){

            cart.add(iceCream[choice-1]);
            System.out.println(iceCream[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 3 ){

            cart.add(iceCream[choice-1]);
            System.out.println(iceCream[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }


        return ;
    }
    public void showDrinkMenu() {
        Product[] Drink = new Product[3];
        Drink[0] = new Product("음료1",2.5,"첫번째 메뉴");
        Drink[1] = new Product("음료2",4.2,"두번째 메뉴");
        Drink[2] = new Product("음료3",2.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Drink.length ; i++) {
            System.out.println(Drink[i].getName() + " | " + Drink[i].getPrice() + " | " + Drink[i].getExplain());
        }

        System.out.println("123 중 하나를 선택하세요");
        int choice = scan.nextInt();
        if (choice == 1 ){

            cart.add(Drink[choice-1]);
            System.out.println(Drink[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 2 ){

            cart.add(Drink[choice-1]);
            System.out.println(Drink[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 3 ){
            cart.add(Drink[choice-1]);
            System.out.println(Drink[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }


        return ;
    }
    public void showBeerMenu() {
        Product[] Beer = new Product[3];
        Beer[0] = new Product("맥주1",5.5,"첫번째 메뉴");
        Beer[1] = new Product("맥주2",2.2,"두번째 메뉴");
        Beer[2] = new Product("맥주3",4.6,"세번째 메뉴");


        System.out.println("다음 메뉴 중에서 고르시오  ");

        for (int i = 0; i <Beer.length ; i++) {
            System.out.println(Beer[i].getName() + " | " + Beer[i].getPrice() + " | " + Beer[i].getExplain());
        }
        System.out.println("123 중 하나를 선택하세요");
        int choice = scan.nextInt();
        if (choice == 1 ){
            cart.add(Beer[choice-1]);
            System.out.println(Beer[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 2 ){
            cart.add(Beer[choice-1]);
            System.out.println(Beer[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }else if (choice == 3 ){
            cart.add(Beer[choice-1]);
            System.out.println(Beer[choice-1].getName()+"이가 장바구니에 추가되었습니다.");
            System.out.println("더 주문하러가기 ");
            System.out.print("1.을 입력하면 처음화면으로 돌아갑니다. 2.를 입력하면 장바구니로 이동합니다.>__"); int backMenu = scan.nextInt();
            if (backMenu  == 1){
                Order();
            }else if (backMenu == 2){
                showOrderMenu();
            }
        }


        return ;
    }

    public void showOrderMenu(){


        System.out.println("[ Orders ]");

        for (int i = 0; i < cart.size(); i++) {
            System.out.println(cart.get(i).toString());
            sum += cart.get(i).getPrice();
        }
        System.out.println("[Total] :: " + sum +"원" );
        System.out.println("1.결제하기       |       2.메인메뉴로 돌아가기");
        int orDerMn = scan.nextInt();
        if (orDerMn == 1){
            System.out.println("주문이 완료 되었습니다!");
            count += 1;
            System.out.println("대기번호는 [" + count + "] 입니다. ");
            totalsum  += sum;

            sum =0;

            try {
                System.out.println("3초 후에 처음 화면으로 돌아갑니다. ");
                System.out.println("해당 주문이 완료 되었으므로 장바구니가 초기화 됩니다.");
                cart.clear();
                Thread.sleep(3000);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            Order();

        }

    }
    public void showOrderCancel(){
        System.out.println("주문을 취소 하시겠습니까?");
        System.out.println("1.취소하기       |       2.계속주문하기");
        int choice = scan.nextInt();
        if (choice == 1){
            cart.clear();
            count -= 1;
            sum =0;
        } else if (choice==2) {
            Order();
        }

    }

    public void totalSum(){
        System.out.println("총 판매금액 현황");
        System.out.println("현재 까지 총 판매된 금액은 |" + totalsum+ "| 입니다.");
    }

    public void Order(){
        while (true){
            showMainMenu();
            int menuNumber  = scan.nextInt();

            if (menuNumber == 1) {
                showBurgerMenu();
            } else if (menuNumber == 2) {
                showIceCreamMenu();
            } else if (menuNumber == 3) {
                showDrinkMenu();
            } else if (menuNumber == 4) {
                showBeerMenu();
            } else if (menuNumber == 5) {
                showOrderMenu();
            }else if (menuNumber == 6){
                showOrderCancel();

            }else if(menuNumber ==0){
                totalSum();
            }
            else {
                System.out.println("1~6사이의 숫자만을 입력해주세요.");
            }
        }
    }

}
