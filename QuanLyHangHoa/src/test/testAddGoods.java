package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.zip.DataFormatException;

import org.junit.jupiter.api.Test;

import model.HangHoa;
import model.HangHoaModel;

class testAddGoods {

	@Test
	public void testAddGoods() {
		HangHoaModel listHH = new HangHoaModel();
		Date d = new Date();
		HangHoa hh = new HangHoa(1, "Sữa", 200, "Lon", 120000, 12500, d);
		assertTrue(listHH.getHh().isEmpty());
		listHH.addNew(hh);
		assertFalse(listHH.getHh().isEmpty());
	}

}
