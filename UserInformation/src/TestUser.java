
public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User("Monster", "Ko9N3*J69Sc", "Mufarreh", "Alshihrey", "MyEmail");

		System.out.println("User: " + user1.toString());

		System.out.println("I will change my username to :- ");

		user1.setUsername("Dragon");
		System.out.println("My new username is: " + user1.getUsername());

		System.out.println("My password is: " + user1.getPassword());

		System.out.println("I will change my password to :- ");

		user1.setPassword("H9prT5#d");
		System.out.println("My new password is: " + user1.getPassword());

	}

}
