import java.util.Arrays;

public class FilmsManager {
	
	 private int filmCounter;
	    
	    private Films[] films = new Films [50];
	        {
	        	
	        	
	        }

	    public void filmList(Films film) {

	        films[filmCounter++]= film;
	    }
	    public void listFilms() {
	        System.out.println(Arrays.toString(films));
	    }

	    public void deleteFilm(Long id) {
	        int index = -1;
	        for (int i = 0; i < filmCounter; i++) {
	            if (films[i].getId() == id) {
	                index = i;
	                break;
	            }
	        }
	        if (index != -1) {
	            for (int i = index; i < filmCounter; i++) {
	                films[i] = films[i + 1];
	            }
	            filmCounter--;
	            

	        } else {
	        
	        }
	    }

	    public void searchFilm(Long id) {
	        for (int i = 0; i < filmCounter; i++) {
	            if (films[i].getId().equals(id)) {
	                System.out.println(films[i]);
	                break;
	            } else {
	            	
	            }
	        }
	    }
}
