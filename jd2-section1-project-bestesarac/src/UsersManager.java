public class UsersManager {

	
	private int userCounter;
    
    private Users[] users = new Users[50];
    {
    	
    }

    public void addUser(Users user) {
        users[userCounter++] = user;

    }
    public void deleteUser(Long id) {
        int index = -1;
        for (int i = 0; i < userCounter; i++) {
            if (users[i].getId() == id) {
                index = i;
                
            }
        }
        if (index != -1) {
            for (int i = index; i < userCounter; i++) {
                users[i] = users[i + 1];
            }
            userCounter--;

        } else {
            
        }
    }

    public void searchUser(Long id) {
        for (int i = 0; i < userCounter; i++) {
            if (users[i].getId().equals(id)) {
                System.out.println(users[i]);
                
            }else {
            	
            }
        } 
    }
    }

