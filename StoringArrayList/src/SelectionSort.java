import java.util.ArrayList;

public class SelectionSort {
	// Sort the list by roll number
	void sortRollno(ArrayList<Student> s) {
		
				for(int i = 0; i < s.size() - 1; i++){
				    int m = i;
				    for(int j = i + 1; j < s.size(); j++){
				        if(s.get(m).getRollno() > s.get(j).getRollno())
				            m = j;
				    }
				    //Swap elements position i and m
				    Student temp = s.get(i);
				    s.set(i, s.get(m));
				    s.set(m, temp);
				}
	}
	// Sort the list in alphabetical order
	void sortName(ArrayList<Student> s) {
		
				for(int i = 0; i < s.size() - 1; i++){
				    int m = i;
				    for(int j = i + 1; j < s.size(); j++){
				        if(s.get(j).getName().compareTo(s.get(m).getName())<0)
				            m = j;
				    }
				    //Swap elements position i and m
				    Student temp = s.get(i);
				    s.set(i, s.get(m));
				    s.set(m, temp);
				}
	}

}
