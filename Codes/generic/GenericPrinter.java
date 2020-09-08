package generic;

public class GenericPrinter<T extends Material> {//material의 타입은 Plastic, Powder 모두 가능하다. 
	//material을 가져다 쓸 때 타입을 정하자는 의미에서 GenericPrinter<T>하였다.
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
}
