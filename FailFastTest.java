import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastTest {

		public static void main(String[] args) {
			List<Integer> in=new ArrayList<>();
			//Vector<Integer> in=new Vector<>();
			in.add(165);
			in.add(265);
			in.add(365);
			in.add(465);
			in.add(565);
			
			
			Iterator<Integer> it=in.iterator();
			
			while (it.hasNext()) {
				Integer integer = (Integer) it.next();
				if (integer==565)
				   System.out.println(in.remove(2));
					System.out.println(in);
			}
		}
}
