package aug3;

import java.util.Comparator;

public class RatingComparator implements Comparator<Laptop>{

	@Override
	public int compare(Laptop o1, Laptop o2) {
		if(o1.getRating()>o2.getRating())
			return 2;
		    
		else
			return -2;
	}
	

}
