package by.htp.part02.block9.ex5;

/*
 * 5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного 
 * типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
 * Учитывать возможность выбора транспорта, питания и числа дней. Реализовать выбор и сортировку путевок.
 */
public class Voucher{
	
	private TypeOfVoucher type;
	private Destanation destanation;	
	private Transport transport;
	private Food food;
	private int duration;
		
	public Voucher(TypeOfVoucher type, Destanation dest, Transport transport, Food food, int duration) {
		this.type = type;
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
	
	public TypeOfVoucher getType() {
		return type;
	}

	public void setType(TypeOfVoucher type) {
		this.type = type;
	}	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destanation == null) ? 0 : destanation.hashCode());
		result = prime * result + duration;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Voucher other = (Voucher) obj;
		if (destanation != other.destanation) {
			return false;
		}
		if (duration != other.duration) {
			return false;
		}
		if (food != other.food) {
			return false;
		}
		if (transport != other.transport) {
			return false;
		}
		if (type != other.type) {
			return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return "Voucher [type=" + type + ", destanation=" + destanation + ", transport=" + transport + ", food=" + food
				+ ", duration=" + duration + "]";
	}
}
