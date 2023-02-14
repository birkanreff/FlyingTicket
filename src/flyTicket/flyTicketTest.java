package flyTicket;

import java.util.Scanner;

public class flyTicketTest {

	public static void main(String[] args) {
		int yas, yolculuktipi;
		double mesafe;
		double indirimtutari, tutar, toplamtutar, yenitutar;
		
		System.out.println("Öncelikle yolculuk türünü belirleyiniz.");
		String menu = "Tek yön uçuş için 1'i , Gidiş-Dönüş uçuş için 2'yi tuşlayınız: ";
				
		System.out.println(menu);
		
		Scanner input=new Scanner(System.in);
		yolculuktipi=input.nextInt();
		
		System.out.print("Yaşınızı giriniz: ");
		yas = input.nextInt();
		
		if (yas <= 0 ) 
			System.out.println("Hatalı veri girdiniz.");
		
		
		System.out.println("Gidilecek mesafeyi giriniz");
		mesafe = input.nextInt();
		
		if (mesafe <= 0 )
			System.out.println("Hatalı veri girdiniz.");
		
		if (yolculuktipi == 1) {
			
			tutar = mesafe * 0.10;
			
			if (yas < 12) {
				indirimtutari = tutar*0.50;
				toplamtutar = tutar - indirimtutari;
			System.out.println("Ödemeniz gereken toplam tutar: " + toplamtutar);
			
			} else if ((yas >= 12) &&(yas <= 24)) {
				indirimtutari = tutar * 0.10;
				toplamtutar = tutar - indirimtutari;
			System.out.println("Ödemeniz gereken toplam tutar: " + toplamtutar);
			
			} else if (yas > 65) {
				indirimtutari = tutar * 0.30;
				toplamtutar = tutar - indirimtutari;
			System.out.println("Ödemeniz gereken toplam tutar: " + toplamtutar);
			
			} else if ((yas > 24) && (yas <=65))
				System.out.println("Ödemeniz gereken tutar: " + tutar);
			
				
		}
				if (yolculuktipi == 2) {
				
				tutar = mesafe * 0.20;
				
				if (yas < 12) {
					indirimtutari = tutar * 0.50;
					toplamtutar = tutar - indirimtutari;
					yenitutar = toplamtutar - (toplamtutar * 0.20);
			System.out.println("Ödemeniz gereken toplam tutar: " + yenitutar);
					
				} else if ((yas >=12) && (yas <= 24)) {
						indirimtutari = tutar * 0.10;
						toplamtutar = tutar - indirimtutari;
						 yenitutar = toplamtutar - (toplamtutar * 0.20);
			System.out.println("Ödemeniz gereken toplam tutar: " + yenitutar);
						
					} else if (yas > 65) {
							indirimtutari = tutar * 0.30;
							toplamtutar = tutar - indirimtutari;
							yenitutar = toplamtutar - (toplamtutar * 0.20);
			System.out.println("Ödemeniz gereken toplam tutar: " + yenitutar);
						} else if ((yas >24) && (yas <= 65)) {
							indirimtutari = tutar * 0.20;
							toplamtutar = tutar - indirimtutari;
							
							System.out.println("Ödemeniz gereken tutar: " + toplamtutar);
							
						}
				
			}
				
			
			
		}
		
		
		
		
		

	}


