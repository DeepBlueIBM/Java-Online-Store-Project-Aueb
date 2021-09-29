//OMADA 32 GEORGIOS KOTSIFOS-->P3190093 , VASILHS GKATZHS-->P3190043

import java.util.*;
import java.util.Scanner;



public class mainApp {
    
    private static final String Blu = "Blu-ray";
    private static final String DVD = "DVD";
    private static final String LED = "LED";
    private static final String LCD = "LCD";
    private static final String Plasma = "Plasma";
    private static final String PS3 = "PS3";
    private static final String PS4 = "PS4";
    private static final String XBOX = "XBOX";
    private static final String SPort = "SPort";
    private static final String DPort = "Dport";
    private static final String Drawer = "Drawer";
    private static final String HDMI = "HDMi";
    private static final String DVI = "DVI";
    private static final String Composite = "Composite";
    private static final String BDR = "BD-R";
    private static final String BDRD = "BD-RD";
    private static final String DVDRW = "DVD-RW";
    private static final String DVDRW2 = "DVD+RW";
    private static final String Compact = "Compact";
    private static final String DSLR = "SLR";
    private static final String Action = "Action Camera";
    
   
    public static void main(String [] args){
    String answer;
    String kathgoria;
    String typos;
    String name;
    String phone;
    String date;
    int codeCounter=000;
    int kommatia;
    

    

    Scanner in = new Scanner(System.in);



    //arxikopio thn lista me tis diathesimes syskeues
    ArrayList <Products> product = new ArrayList<Products>();
    ArrayList <Sale> sale = new ArrayList<Sale>();
    ArrayList <Order> order = new ArrayList<Order>();
    product.add(new TV("1000", "7series", "2018", "LG", 500.00, 0.10, 3, LED, "4k", "50 inch", HDMI));
    product.add(new TV("2000", "uv65", "2018", "Samsung", 700.00, 0.10, 3, LCD, "4k", "55 inch", DVI));
    product.add(new TV("3000", "fs905", "2017", "Sony", 600, 0.10, 12, Plasma, "1080p", "40 inch", Composite));
    product.add(new BlueOrDVDPlayers("0001", "ls96", "2014", "Panasonic", 80, 0.10, 6, Blu, "1080p", BDR));
    product.add(new BlueOrDVDPlayers("0002", "sml9", "2019", "Sony", 140, 0.10, 1, DVD, "4k", DVDRW));
    product.add(new BlueOrDVDPlayers("0003", "mal45", "2015", "LG", 100, 0.10, 0, Blu, "1080p", BDRD));
    product.add(new BlueOrDVDPlayers("0004", "lz10", "2017", "Sony", 90, 0.10, 4, DVD, "1080p", DVDRW2));
    product.add(new Camera("1100", "rng5", "2013", "Kodak", 50, 0.20, 3, Compact, "20", "20x", "10x", "11x8x7"));
    product.add(new Camera("1200", "lwx4", "2019", "Go Pro", 200, 0.20, 10, Action, "30", "30x", "10x", "15x9x10"));
    product.add(new Camera("1300", "fnc1", "2020", "Sony", 250, 0.20, 3, DSLR, "100", "30x", "20x", "16x12x9"));
    product.add(new Consoles("1010", "shy12", "2013", "Sony", 400, 0.10, 13, PS4, "AMD Jaguar 64", "Inhouse custom made", "dolby atmos", "1tb"));
    product.add(new Consoles("1020", "old34", "2007", "Sony", 200, 0.10, 5, PS3, "AMD Jaguar 32", "Inhouse custom made ", "dolby atmos", "500gb"));
    product.add(new Consoles("1030", "bad99", "2013", "Microsoft", 400, 0.10, 10, XBOX, "AMD custom", "Inhouse custom made", "dolby atmos", "1tb"));
    product.add(new Fridges("0100", "pr234", "2016", "Samsung", 1000, 0.25, 9, DPort, "A+", "25", "10"));
    product.add(new Fridges("0200", "psa23", "2012", "Pitsos", 400, 0.25, 3, SPort, "C", "15", "5"));
    product.add(new Fridges("0300", "fs24", "2019", "LG", 1500, 0.25, 10, Drawer, "A++", "30", "20"));
    product.add(new WashingMachine("0010", "fga25", "2018", "Whirpool", 400, 0.20, 0, "B++", "20", "100rpm"));
    product.add(new WashingMachine("0020", "dxo90", "2016", "LG", 300, 0.20, 5, "B", "25", "80rpm"));


    

    boolean done=false;
    while ( ! done)	{
        codeCounter++;	
        System.out.println("\n0. episkopish syskeyon ");
        System.out.println("1. episkopish paraggelion");
        System.out.println("2. episkopish poliseon");
        System.out.println("3. exit");

        System.out.print("> ");
        
        answer = in.nextLine();
        

        if (answer.equals ("0")){
            System.out.println("Dialekse kathgoria apo 1. eikona kai hxos | 2. gaming | 3. oikiakes syskeues :");
            System.out.print("> ");
            kathgoria = in.nextLine();
            if (kathgoria.equals("1")){//kathgoria eikona kai hxos 
                System.out.println("Dialekse kathogoria apo 1. thleorash | 2. BlurayDVD | 3. camera : ");
                System.out.print("> ");
                typos = in.nextLine();
                if(typos.equals("1")){//typos thleorash
                    for(int i=0;i<3;i++){
                        System.out.println("Dialekse modelo apo : "+ (i+1)+". "+ product.get(i).getModelName());
                    }
                    System.out.print("> ");
                    int x=in.nextInt();
                    in.nextLine();
                    System.out.println("h thleorash einai : "+product.get(x-1));
                    System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                    System.out.print("> ");
                    String naihoxi= in.nextLine();
                    if (naihoxi.equals("1")){//agora tv
                        System.out.println("Posa kommatia thes : ");
                        System.out.print("> ");
                        kommatia = in.nextInt();
                        in.nextLine();
                        System.out.println("Dose onoma : ");
                        System.out.print("> ");
                        name = in.nextLine();
                        System.out.println("Dose thlefono : ");
                        System.out.print("> ");
                        phone = in.nextLine();
                        System.out.println("Dose hmeromhnia : ");
                        System.out.print("> ");
                        date= in.nextLine();
                        if(product.get(x-1).getQuantity()>=kommatia){
                            sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                            product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                            System.out.println(product.get(x-1).getQuantity());
                            System.out.println("Egine h agora");
                        }else{
                            System.out.println("Den einai diathesimo tha ginei paraggelia");
                            order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                            System.out.println("Egine paraggelia");
                        }
                    }else{
                       continue;
                    }
                }else if(typos.equals("2")){//typos blueray
                    for(int i=3;i<7;i++){
                        System.out.println("Dialekse modelo apo : "+ (i-2)+". "+ product.get(i).getModelName());
                    }
                    System.out.print("> ");
                    int x=in.nextInt()+3;//checked
                    in.nextLine();
                    System.out.println("to blueray einai : "+product.get(x-1));
                    System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                    System.out.print("> ");
                    String naihoxi= in.nextLine();
                    if (naihoxi.equals("1")){//agora blueray
                        System.out.println("Posa kommatia thes : ");
                        System.out.print("> ");
                        kommatia = in.nextInt();
                        in.nextLine();
                        System.out.println("Dose onoma : ");
                        System.out.print("> ");
                        name = in.nextLine();
                        System.out.println("Dose thlefono : ");
                        System.out.print("> ");
                        phone = in.nextLine();
                        System.out.println("Dose hmeromhnia : ");
                        System.out.print("> ");
                        date= in.nextLine();
                        if(product.get(x-1).getQuantity()>=kommatia){
                            sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                            product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                            System.out.println(product.get(x-1).getQuantity());
                            System.out.println("Egine h agora");
                        }else{
                            System.out.println("Den einai diathesimo tha ginei paraggelia");
                            order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                            System.out.println("Egine paraggelia");
                        }
                    }else{
                       continue;
                    }
                }else{// typos camera
                    for(int i=7;i<10;i++){
                        System.out.println("Dialekse modelo apo : "+ (i-6)+". "+ product.get(i).getModelName());
                    }
                    System.out.print("> ");
                    int x=in.nextInt()+7;//checked
                    in.nextLine();
                    System.out.println("h camera einai : "+product.get(x-1));
                    System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                    System.out.print("> ");
                    String naihoxi= in.nextLine();
                    if (naihoxi.equals("1")){//agora camera
                        System.out.println("Posa kommatia thes : ");
                        System.out.print("> ");
                        kommatia = in.nextInt();
                        in.nextLine();
                        System.out.println("Dose onoma : ");
                        System.out.print("> ");
                        name = in.nextLine();
                        System.out.println("Dose thlefono : ");
                        System.out.print("> ");
                        phone = in.nextLine();
                        System.out.println("Dose hmeromhnia : ");
                        System.out.print("> ");
                        date= in.nextLine();
                        if(product.get(x-1).getQuantity()>=kommatia){
                            sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                            product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                            System.out.println(product.get(x-1).getQuantity());
                            System.out.println("Egine h agora");
                        }else{
                            System.out.println("Den einai diathesimo tha ginei paraggelia");
                            order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                            System.out.println("Egine paraggelia");
                        }
                    }else{
                       continue;
                    }
                }

            }
            if (kathgoria.equals("2")){// kathgoria gaming
                System.out.println("Dialekse kathogoria apo 1. consoles : ");
                System.out.print("> ");
                typos = in.nextLine();
                if(typos.equals("1")){//typos gaming
                    for(int i=10;i<13;i++){
                        System.out.println("Dialekse modelo apo : "+ (i-9)+". "+ product.get(i).getModelName());
                    }
                    System.out.print("> ");
                    int x=in.nextInt()+10;//checked
                    in.nextLine();
                    System.out.println("h consola einai : "+product.get(x-1));
                    System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                    System.out.print("> ");
                    String naihoxi= in.nextLine();
                    if (naihoxi.equals("1")){//agora consolas
                        System.out.println("Posa kommatia thes : ");
                        System.out.print("> ");
                        kommatia = in.nextInt();
                        in.nextLine();
                        System.out.println("Dose onoma : ");
                        System.out.print("> ");
                        name = in.nextLine();
                        System.out.println("Dose thlefono : ");
                        System.out.print("> ");
                        phone = in.nextLine();
                        System.out.println("Dose hmeromhnia : ");
                        System.out.print("> ");
                        date= in.nextLine();
                        if(product.get(x-1).getQuantity()>=kommatia){
                            sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                            product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                            System.out.println(product.get(x-1).getQuantity());
                            System.out.println("Egine h agora");
                        }else{
                            System.out.println("Den einai diathesimo tha ginei paraggelia");
                            order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                            System.out.println("Egine paraggelia");
                        }
                    }else{
                       continue;
                    }
            }
        }
            if (kathgoria.equals("3")){//kathgoria oikiakes syskeues
                System.out.println("Dialekse kathogoria apo 1. psygeio | 2. plynthrio : ");
                System.out.print("> ");
                typos = in.nextLine();
                if(typos.equals("1")){//typos psygeio
                    for(int i=13;i<16;i++){
                        System.out.println("Dialekse modelo apo : "+ (i-12)+". "+ product.get(i).getModelName());
                    }
                    System.out.print("> ");
                    int x=in.nextInt()+13;//checked
                    in.nextLine();
                    System.out.println("to psygeio  einai : "+product.get(x-1));
                    System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                    System.out.print("> ");
                    String naihoxi= in.nextLine();
                    if (naihoxi.equals("1")){//agora psygeio
                        System.out.println("Posa kommatia thes : ");
                        System.out.print("> ");
                        kommatia = in.nextInt();
                        in.nextLine();
                        System.out.println("Dose onoma : ");
                        System.out.print("> ");
                        name = in.nextLine();
                        System.out.println("Dose thlefono : ");
                        System.out.print("> ");
                        phone = in.nextLine();
                        System.out.println("Dose hmeromhnia : ");
                        System.out.print("> ");
                        date= in.nextLine();
                        if(product.get(x-1).getQuantity()>=kommatia){
                            sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                            product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                            System.out.println(product.get(x-1).getQuantity());
                            System.out.println("Egine h agora");
                        }else{
                            System.out.println("Den einai diathesimo tha ginei paraggelia");
                            order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                            System.out.println("Egine paraggelia");
                        }
                    }else{
                       continue;
                    }
            }else{//typos plynthrio
                for(int i=16;i<18;i++){
                    System.out.println("Dialekse modelo apo : "+ (i-15)+". "+ product.get(i).getModelName());
                }
                System.out.print("> ");
                int x=in.nextInt()+16;//checked
                in.nextLine();
                System.out.println("h consola einai : "+product.get(x-1));
                System.out.println("Theleis na to agoraseis 1.Nai | 2. Oxi : ");
                System.out.print("> ");
                String naihoxi= in.nextLine();
                if (naihoxi.equals("1")){//agora plynthrio
                    System.out.println("Posa kommatia thes : ");
                    System.out.print("> ");
                    kommatia = in.nextInt();
                    in.nextLine();
                    System.out.println("Dose onoma : ");
                    System.out.print("> ");
                    name = in.nextLine();
                    System.out.println("Dose thlefono : ");
                    System.out.print("> ");
                    phone = in.nextLine();
                    System.out.println("Dose hmeromhnia : ");
                    System.out.print("> ");
                    date= in.nextLine();
                    if(product.get(x-1).getQuantity()>=kommatia){
                        sale.add(new Sale(codeCounter, product.get(x-1).getModelName(), name, phone, date, kommatia*(product.get(x-1).getPrice()*0.75)));
                        product.get(x-1).setQuantity(product.get(x-1).getQuantity()-kommatia);
                        System.out.println(product.get(x-1).getQuantity());
                        System.out.println("Egine h agora");
                    }else{
                        System.out.println("Den einai diathesimo tha ginei paraggelia");
                        order.add(new Order(codeCounter, product.get(x-1).getModelName(), name, phone, date, "not yet", kommatia*(product.get(x-1).getPrice()*0.75), false));
                        System.out.println("Egine paraggelia");
                    }
                }else{
                   continue;
                }
            }
        }
    }else if(answer.equals("1")){//provolh paraggelion
        if(order.size()>0){
            for(int i=0; i<order.size(); i++){
                System.out.println(i+". " +order.get(i));
            }
            System.out.println("Dose paraggelia ");
            System.out.print("> ");
            int codikos = in.nextInt();
            in.nextLine();
            order.get(codikos).setArrivalDate("today");
            order.get(codikos).setDone(true);
            sale.add(new Sale(codeCounter, order.get(codikos).getDevice(), order.get(codikos).getName(), order.get(codikos).getPhone() ,order.get(codikos).getOrderDate(), order.get(codikos).getCost()));
            order.remove(codikos);
        }else{
            System.out.println("Den yparxoun paraggelies");
            continue;
        }
    }else if (answer.equals("2")){//provolh polhseon
        if(sale.size()>0){
            for(int i=0; i<sale.size(); i++){
                System.out.println(i+". " +sale.get(i));
            }
        }else{
            System.out.println("Den yparxoun polhseis");
            continue;
        }
    }else{
        in.close();
        break;
    }
}
}
}