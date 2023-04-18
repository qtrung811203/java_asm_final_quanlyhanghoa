package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.HangHoa;
import view.QLHH;

public class QLHHController implements ActionListener {

	public QLHH view;
	
	
	public QLHHController(QLHH view) {
		this.view = view;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String cm = e.getActionCommand();
		if(cm.equals("Clear")) {
			this.view.xoaForm();
		}else if(cm.equals("Lưu")) {
			try { 
				this.view.ThemThongTinHangHoa();
				
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(view, "Hãy nhập đầy đủ thông tin \n" + 
						"Hoặc thông tin bạn đã nhập chưa đúng", 
						"Thông tin nhập chưa đúng", JOptionPane.ERROR_MESSAGE);
			}
		}else if(cm.equals("Cập Nhật")){
			try {
				this.view.hienThiThongTinDaChon();
			} catch (Exception e1) {
				JOptionPane.showMessageDialog(view, "Hãy chọn thông tin cần sửa",
                        "Lỗi",JOptionPane.ERROR_MESSAGE);
			}
		}else if(cm.equals("Delete")) {
			try {
				this.view.xoaThongTin();
			} catch (Exception e2) {
				JOptionPane.showMessageDialog(view, "Hãy chọn thông tin cần xóa",
                        "Lỗi",JOptionPane.ERROR_MESSAGE);
			}
		}else if(cm.equals("Tìm")) {
			this.view.timThongTin();
		}else if(cm.equals("Hủy")) {
			this.view.thucHienTaiLaiDuLieu();
		}else if(cm.equals("Tính")) {
			this.view.tinhTong();
		}else if(cm.equals("Open")) {
			this.view.thucHienOpenFile();
		}else if(cm.equals("Save")) {
			this.view.thucHienSaveFile();
		}
		
	}

}
