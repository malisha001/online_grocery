package model;

public class admin extends person{
	public admin(int id, String name, String email, String password) {
		super(id, name, email, password);

	}
	@Override
	public void showName() {
		System.out.print("I am Admin");
	}
}
