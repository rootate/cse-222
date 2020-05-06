
public  abstract class AbstractUser implements User{
			protected Profile person; 
			
			public void showProfile() {
				System.out.println(person.toString());
			}
			
			public abstract void showClasses();
			public abstract void showNotification();
			public abstract void showSchedule();
			public abstract void addClass();
			
			
		
}
