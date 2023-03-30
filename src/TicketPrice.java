import java.util.Scanner;
public class TicketPrice {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int distance,age,type; double price;

        System.out.print("Mesafeyi km türünden giriniz :");
        distance = input.nextInt();

        System.out.print("Yasinizi giriniz : ");
        age = input.nextInt();

        System.out.print("Yolculuk tipini giriniz : 1 => Tek Yön , 2 => Gidiş Dönüş : ");
        type = input.nextInt();

        price =distance*0.10;

        if(distance<=0){
            System.out.println("Hatali veri girdiniz !");
        }else {
            if(age<12){
                if(age<=0){
                    System.out.println("Hatali veri girdiniz !");
                }else{
                    price-=price*0.50;
                    if (type==1 || type ==2){
                        if (type==1){
                            System.out.println("Tek yon ucus biletiniz hazır.Fiyat:"+price+"TL");
                        }else {
                            price-=price*0.20;
                            price=price*2;
                            System.out.println("Cift yon ucus biletiniz hazir.Fiyat:"+price+"TL");
                        }

                    }
                    else {
                        System.out.println("Hatali veri girdiniz !");
                    }
                }
            } else if (age>=12 && age<=24) {
                price-=price*0.10;
                if (type==1 || type ==2){
                    if (type==1){
                        System.out.println("Tek yon ucus biletiniz hazır.Fiyat:"+price+"TL");
                    }else {
                        price-=price*0.20;
                        price=price*2;
                        System.out.println("Cift yon ucus biletiniz hazir.Fiyat:"+price+"TL");
                    }
                }
                else {
                    System.out.println("Hatali veri girdiniz !");
                }
            }else if (age>=25 && age<=65){
                if (type==1 || type ==2){
                    if (type==1){
                        System.out.println("Tek yon ucus biletiniz hazır.Fiyat:"+price+"TL");
                    }else {
                        price-=price*0.20;
                        price=price*2;
                        System.out.println("Cift yon ucus biletiniz hazir.Fiyat:"+price+"TL");
                    }
                }
                else {
                    System.out.println("Hatali veri girdiniz !");
                }
            }

            else{
                price-=price*0.30;
                if (type==1 || type ==2){
                    if (type==1){
                        System.out.println("Tek yon ucus biletiniz hazır.Fiyat:"+price+"TL");
                    }else {
                        price-=price*0.20;
                        price=price*2;
                        System.out.println("Cift yon ucus biletiniz hazir.Fiyat:"+price+"TL");
                    }

                }
                else {
                    System.out.println("Hatali veri girdiniz !");
                }
            }

        }
    }
}
