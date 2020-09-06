package zsl;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Today {
    
	public String date(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf.format(d);
		return s;
	}
	
}
