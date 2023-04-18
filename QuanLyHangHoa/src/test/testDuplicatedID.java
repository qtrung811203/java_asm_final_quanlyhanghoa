package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import model.HangHoa;
import model.HangHoaModel;

class testDuplicatedID {

	@Test
	void testDuplicatedID() {
		HangHoaModel listHH = new HangHoaModel();
		Date d = new Date();
		HangHoa hh = new HangHoa(1, "Sữa", 200, "Lon", 120000, 12500, d);
		
		Date d1 = new Date();
		HangHoa hh1 = new HangHoa(1, "Bánh mỳ", 200, "Ổ", 120000, 12500, d);
		
		Date d2 = new Date();
		HangHoa hh2 = new HangHoa(2, "Nước ngọt", 200, "Lon", 120000, 12500, d);
		
		listHH.addNew(hh);
		
		assertTrue(listHH.kiemTraID(hh1));
		assertFalse(listHH.kiemTraID(hh2));
	}

}
