package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;

import model.HangHoa;
import model.HangHoaModel;

class testDeleteGoods {

	@Test
	void testDeleteGoods() {
		HangHoaModel listHH = new HangHoaModel();
		Date d = new Date();
		HangHoa hh = new HangHoa(1, "Sữa", 200, "Lon", 120000, 12500, d);
		listHH.addNew(hh);
		listHH.delete(hh);
		assertTrue(listHH.getHh().isEmpty());
	}

}
