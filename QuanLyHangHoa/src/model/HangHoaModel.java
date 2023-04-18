package model;

import java.util.ArrayList;

public class HangHoaModel {
	private ArrayList<HangHoa> dsHangHoa;
	private String tenFile;
	
	public HangHoaModel() {
		this.dsHangHoa = new ArrayList<HangHoa>();
		this.tenFile ="";
	}

	public HangHoaModel(ArrayList<HangHoa> hh) {
		this.dsHangHoa = hh;
	}

	public ArrayList<HangHoa> getHh() { 
		return dsHangHoa;
	}

	public void setHh(ArrayList<HangHoa> hh) {
		this.dsHangHoa = hh;
	}
	
	
	public String getTenFile() {
		return tenFile;
	}

	public void setTenFile(String tenFile) {
		this.tenFile = tenFile;
	}

	//Them hang hoa
	public void addNew(HangHoa hh) {
		this.dsHangHoa.add(hh);		
	}
	
	//Xoa hang hoa
	public void delete(HangHoa hh) {
		int index = -1;
		for(int i = 0; i < this.dsHangHoa.size(); i++) {
			if(hh.getMaSP() == this.dsHangHoa.get(i).getMaSP()) {
				index = i;
			}
		}
		this.dsHangHoa.remove(index);
	}
	
	//Update hang hoa
	public void update(HangHoa hh, int indexDelete) {
		this.dsHangHoa.remove(indexDelete);
		this.dsHangHoa.add(hh);
	}

	//Check duplicated ID
	public boolean kiemTraID(HangHoa hh) {
		for(HangHoa hangHoa: dsHangHoa) {
			if(hangHoa.getMaSP() == hh.getMaSP()) {
				return true;
			}
		}
		return false; 
	}
}
