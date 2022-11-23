package exercicios.nelio;

public class Rectangle {
	//Atributos da classe:
			 private double width;
			 private double height;
//Métodos da classe:
			public double getWidth() {
					return width;
				}

			public void setWidth(double width) {
					this.width = width;
				}

			public double getHeight() {
					return height;
				}

			public void setHeight(double height) {
					this.height = height;
				}

			public double area() {
				return this.width*this.height;
			}
			public double perimeter() {
				return (this.height+this.width)*2;
			}
			public double diagonal() {
				double c = Math.pow(this.width, 2) + Math.pow(this.height, 2);
				return Math.sqrt(c);
			}
		
		
		
		
		
		
		

}
