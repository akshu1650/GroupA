package Interface_Study;

public interface Mother {

	void love();
	
	default void money()
	{
		System.out.println("mother money");
	}

}
