package by.htp.part02.block9.Ex5;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного 
 * типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public enum Voucher implements Comparable<Voucher>{
    VACATION(Destanation.GREECE, Transport.TRAIN, Food.BREAKFASTONLY, 10),
	EXCURSION(Destanation.SPAIN, Transport.AIRPLANE, Food.ALLINCLUSIVE, 4),
	HEART_TREATNENT(Destanation.BELARUS, Transport.MINIBUS, Food.THREETIMES, 21),
	NERVOUS_TREATMENT(Destanation.SRI_LANKA, Transport.AIRPLANE, Food.THREETIMES, 15),
	SHOPPING(Destanation.CZECH_REPUBLIC, Transport.BUS, Food.BREAKFASTONLY, 4),
	CRUISE(Destanation.SRI_LANKA, Transport.SHIP, Food.BREAKFASTDINNER, 8);
	
	
	Destanation destanation;	
	Transport transport;
	Food food;
	int duration;
	
	Voucher(Destanation dest, Transport transport, Food food, int duration) {
		this.destanation = dest;
		this.transport = transport;
		this.food = food;
		this.duration = duration;
		
	}
	
	public Destanation getDestanation() {
		return destanation;
	}

	public void setDestanation(Destanation destanation) {
		this.destanation = destanation;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

}
