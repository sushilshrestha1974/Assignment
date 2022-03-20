
public class computer {

		private int name;
		private double price;
		private double serialnumber;
		public computer(int name, double price, double serialnumber) {
			super();
			this.name = name;
			this.price = price;
			this.serialnumber = serialnumber;
		}
		public int getName() {
			return name;
		}
		public void setName(int name) {
			this.name = name;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getSerialnumber() {
			return serialnumber;
		}
		public void setSerialnumber(double serialnumber) {
			this.serialnumber = serialnumber;
		}
		@Override
		public String toString() {
			return "computer [name=" + name + ", price=" + price + ", serialnumber=" + serialnumber + "]";
		}
		
		 
	}


