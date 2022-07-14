package Interface_Study;

public interface Father {

	void nature();
	
	default void money()
	{
		System.out.println("father money");
	}
	
	
	
	
}
