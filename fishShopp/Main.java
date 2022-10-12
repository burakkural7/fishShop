package fishShopp;

public class Main {

	public static void main(String[] args) {
		FishShop fish1=new FishShop();
		fish1.setFish("Memo");
		fish1.setRod("Discovery Başlangıç Seti Yeni Dft Racer 360CM 100-150GR Charisma Silver Misinalı");
		fish1.setBait("Ahm Guppy Granulat Lepistes Balık Yemi 250 Ml");
		fish1.setAquarium("Fluval Flex Akvaryum");
		System.out.println(fish1.getFish()+" "+fish1.getRod()+" "+fish1.getBait()+" "+fish1.getAquarium());

	}

}
