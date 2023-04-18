package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import model.HangHoa;
import model.HangHoaModel;

class testUpdate {

	@Test
	void testUpdate() {
		HangHoaModel listHH = new HangHoaModel();
		
		Date d = new Date();
		HangHoa hh = new HangHoa(1, "Sữa", 200, "Lon", 120000, 12500, d);
		
		listHH.addNew(hh);
		
		Date d1 = new Date();
		HangHoa hh1 = new HangHoa(1, "Bánh mỳ", 200, "Ổ", 120000, 12500, d);
		
		listHH.update(hh1, 0);
		
		HangHoa ud = listHH.getHh().get(0);
		assertTrue(ud.equals(hh1));
		assertTrue(listHH.getHh().size() == 1);
	}

}
