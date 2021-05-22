package kodlamaio.northwind.core.utilities.result;

public class DataResult<T> extends Result{  //Birden fazla veri tipi döndürüldüğünde jenerik kullanılır

	private T data;
	public DataResult(T data, boolean success, String message) {
		super(success, message);	//super bilgisi base sınıfın constructorlarını çalıştırmaya yarıyor.
		this.data = data;
	}
	
	public DataResult(T data, boolean success) {
		super(success);	
		this.data = data;
	}
	
	public T getData() {
		return this.data;
	}
}
