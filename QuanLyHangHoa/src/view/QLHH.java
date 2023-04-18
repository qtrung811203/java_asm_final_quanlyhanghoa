package view;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import controller.QLHHController;
import model.HangHoa;
import model.HangHoaModel;

import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ComboBoxEditor;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;

public class QLHH extends JFrame {

	private JPanel contentPane;
	public JTextField txtGiaBan;
	public JTextField txtMaSP;
	public JTextField txtTenSP;
	public JTextField txtTonKho;
	public JTextField txtPhanLoai;
	public JTextField txtGiaNhap;
	public JTextField txtNgayKiemTra;
	private JTable table;
	public HangHoaModel model;
	private JTextField txtSearch;
	private JTextField txtTong;
	public JComboBox comboBox_Tong;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLHH frame = new QLHH();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public QLHH() {
		this.model = new HangHoaModel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(60, 42, 33));
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));

		ActionListener ac = new QLHHController(this);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setBackground(new Color(229, 229, 203));
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane_1.setBounds(10, 33, 864, 42);
		contentPane.add(contentPane_1);
		
		JLabel lblNewLabel = new JLabel("CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM");
		lblNewLabel.setForeground(new Color(26, 18, 11));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 0, 830, 45);
		contentPane_1.add(lblNewLabel);
		
		JPanel contentPane_1_1 = new JPanel();
		contentPane_1_1.setBackground(new Color(229, 229, 203));
		contentPane_1_1.setLayout(null);
		contentPane_1_1.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane_1_1.setBounds(10, 82, 699, 518);
		contentPane.add(contentPane_1_1);
		
		JLabel lblMaSP = new JLabel("Mã sản phẩm: ");
		lblMaSP.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblMaSP.setBounds(10, 11, 200, 29);
		contentPane_1_1.add(lblMaSP);
		
		JLabel lblTenSP = new JLabel("Tên sản phẩm: ");
		lblTenSP.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTenSP.setBounds(10, 51, 200, 29);
		contentPane_1_1.add(lblTenSP);
		
		JLabel lblTonKho = new JLabel("Tồn kho:");
		lblTonKho.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTonKho.setBounds(10, 91, 200, 29);
		contentPane_1_1.add(lblTonKho);
		
		JLabel lblPhanLoai = new JLabel("Phân loại:");
		lblPhanLoai.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblPhanLoai.setBounds(10, 131, 200, 29);
		contentPane_1_1.add(lblPhanLoai);
		
		JLabel lblGiaNhap = new JLabel("Giá nhập:");
		lblGiaNhap.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGiaNhap.setBounds(10, 171, 200, 29);
		contentPane_1_1.add(lblGiaNhap);
		
		JLabel lblGiaBan = new JLabel("Giá bán (VAT 10%):");
		lblGiaBan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblGiaBan.setBounds(10, 211, 200, 29);
		contentPane_1_1.add(lblGiaBan);
		
		JLabel lblNgayKT = new JLabel("Ngày kiểm tra:");
		lblNgayKT.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNgayKT.setBounds(10, 251, 200, 29);
		contentPane_1_1.add(lblNgayKT);
		
		txtMaSP = new JTextField();		
		txtMaSP.setColumns(10);
		txtMaSP.setBounds(210, 17, 479, 20);
		contentPane_1_1.add(txtMaSP);
		
		txtTenSP = new JTextField();
		txtTenSP.setColumns(10);
		txtTenSP.setBounds(210, 57, 479, 20);
		contentPane_1_1.add(txtTenSP);
		
		txtTonKho = new JTextField();
		txtTonKho.setColumns(10);
		txtTonKho.setBounds(210, 97, 479, 20);
		contentPane_1_1.add(txtTonKho);
		
		txtPhanLoai = new JTextField();
		txtPhanLoai.setColumns(10);
		txtPhanLoai.setBounds(210, 137, 479, 20);
		contentPane_1_1.add(txtPhanLoai);
		
		txtGiaNhap = new JTextField();
		txtGiaNhap.setColumns(10);
		txtGiaNhap.setBounds(210, 177, 479, 20);
		contentPane_1_1.add(txtGiaNhap);
		
		txtNgayKiemTra = new JTextField();
		txtNgayKiemTra.setColumns(10);
		txtNgayKiemTra.setBounds(210, 257, 479, 20);
		contentPane_1_1.add(txtNgayKiemTra);
		
		txtGiaBan = new JTextField();
		txtGiaBan.setEditable(false);
		txtGiaBan.setBounds(210, 217, 479, 20);
		contentPane_1_1.add(txtGiaBan);
		txtGiaBan.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 290, 679, 217);
		contentPane_1_1.add(scrollPane);
		
		//Tao bang de hien thi
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setDefaultEditor(Object.class, null);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "T\u1ED3n kho", "\u0110\u1ECBnh d\u1EA1ng", "Gi\u00E1 nh\u1EADp", "Gi\u00E1 b\u00E1n", "Ng\u00E0y ki\u1EC3m tra"
			}
		));
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		panel.setBackground(new Color(229, 229, 203));
		panel.setBounds(719, 82, 155, 370);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnNew = new JButton("Clear");
		btnNew.addActionListener(ac);
		btnNew.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNew.setBounds(10, 11, 135, 50);
		panel.add(btnNew);
		
		JButton btnUpdate = new JButton("Cập Nhật");
		btnUpdate.addActionListener(ac);
		btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnUpdate.setBounds(10, 72, 135, 50);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(ac);
		btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDelete.setBounds(10, 133, 135, 50);
		panel.add(btnDelete);
		
		JButton btnSave = new JButton("Lưu");
		btnSave.addActionListener(ac);
		btnSave.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSave.setBounds(10, 194, 135, 50);
		panel.add(btnSave);
		
		JLabel lblSearch = new JLabel("Tìm kiếm");
		lblSearch.setHorizontalAlignment(SwingConstants.CENTER);
		lblSearch.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblSearch.setBounds(10, 255, 135, 29);
		panel.add(lblSearch);
		
		txtSearch = new JTextField();
		txtSearch.setColumns(10);
		txtSearch.setBounds(10, 301, 135, 20);
		panel.add(txtSearch);
		
		JButton btnSearch = new JButton("Tìm");
		btnSearch.addActionListener(ac);
		btnSearch.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnSearch.setBounds(10, 332, 59, 29);
		panel.add(btnSearch);
		
		JLabel lblMSnPhm = new JLabel("Mã sản phẩm");
		lblMSnPhm.setHorizontalAlignment(SwingConstants.CENTER);
		lblMSnPhm.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblMSnPhm.setBounds(10, 281, 135, 20);
		panel.add(lblMSnPhm);
		
		JButton btnCancel = new JButton("Hủy");
		btnCancel.setBounds(86, 332, 59, 29);
		panel.add(btnCancel);
		btnCancel.addActionListener(ac);
		btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 884, 22);
		contentPane.add(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem menuOpen = new JMenuItem("Open");
		menuFile.add(menuOpen);
		menuOpen.addActionListener(ac);
		
		
		JMenuItem menuSave = new JMenuItem("Save");
		menuFile.add(menuSave);
		menuSave.addActionListener(ac);
		
		JPanel contentPane_1_2 = new JPanel();
		contentPane_1_2.setLayout(null);
		contentPane_1_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane_1_2.setBackground(new Color(229, 229, 203));
		contentPane_1_2.setBounds(719, 463, 155, 137);
		contentPane.add(contentPane_1_2);
		
		String[] luaChonTong = {"Giá Nhập", "Giá Bán", "Số Lượng"};
		comboBox_Tong = new JComboBox();
		for(int i = 0; i < luaChonTong.length; i++) {
			comboBox_Tong.addItem(luaChonTong[i]);
		}
		comboBox_Tong.setSelectedIndex(-1);
		comboBox_Tong.setBounds(10, 38, 135, 22);
		contentPane_1_2.add(comboBox_Tong);
		
		
		JLabel lblTnhTng = new JLabel("Tính Tổng");
		lblTnhTng.setHorizontalAlignment(SwingConstants.CENTER);
		lblTnhTng.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblTnhTng.setBounds(10, 11, 135, 29);
		contentPane_1_2.add(lblTnhTng);
		
		JButton btnTinh = new JButton("Tính");
		btnTinh.addActionListener(ac);
		btnTinh.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnTinh.setBounds(41, 97, 77, 29);
		contentPane_1_2.add(btnTinh);
		
		txtTong = new JTextField();
		txtTong.setHorizontalAlignment(SwingConstants.CENTER);
		txtTong.setColumns(10);
		txtTong.setBounds(10, 66, 135, 20);
		contentPane_1_2.add(txtTong);
		txtTong.setEditable(false);
		
		this.setVisible(true);
	}

	/**
	 * Cac phuong thuc xu ly
	 */
	
	/**
	 * Phuong thuc xoa thong tin tren form
	 */
	public void xoaForm() {		
		txtGiaBan.setText("");
		txtMaSP.setText("");
		txtMaSP.setEditable(true);
		txtTenSP.setText("");
		txtTonKho.setText("");
		txtPhanLoai.setText("");
		txtGiaNhap.setText("");
		txtNgayKiemTra.setText("");
	}
	
/*
 * Phuong thuc them thong tin vao bang
 */
	public void themThongTinVaoBang(HangHoa hh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		model_table.addRow(new Object[] {
				hh.getMaSP()+"",
				hh.getTenSP(),
				hh.getTonKho()+"",
				hh.getPhanLoai(),
				hh.getGiaNhap()+"",
				hh.getGiaBan()+"",
				new SimpleDateFormat("MM/dd/yyyy").format(hh.getNgayKT())});
	}
	
	
	/*
	 * phuong thuc them hoa cap nhat thong tin hang hoa
	 */
	public void themHoacCapnhat(HangHoa hh) {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		
		//Check index trong truong hop da co
		int index = -1;
		for(int i = 0; i < model.getHh().size(); i++) {
			if(hh.getMaSP() == model.getHh().get(i).getMaSP()) {
				index = i;
			}
		}
		//check ID
		if(!this.model.kiemTraID(hh)) {	
		this.model.addNew(hh);
		this.themThongTinVaoBang(hh);
		}else {
			int soDong = model_table.getRowCount();
			for(int i = 0; i < soDong; i++) {
				int id = Integer.valueOf(model_table.getValueAt(i, 0)+"");
				if(id == hh.getMaSP()) {
					txtMaSP.setEditable(false);
					model_table.setValueAt(hh.getTenSP()+"",i,1);
					model_table.setValueAt(hh.getTonKho()+"",i,2);
					model_table.setValueAt(hh.getPhanLoai()+"",i,3);
					model_table.setValueAt(hh.getGiaNhap()+"",i,4);
					model_table.setValueAt((hh.getGiaNhap() + 0.1*hh.getGiaNhap())+"",i,5);
					model_table.setValueAt(new SimpleDateFormat("MM/dd/yyyy").format(hh.getNgayKT()),i,6);
				}
			}
			this.model.update(hh, index);
		}
	}

	public HangHoa getHangHoaDangChon() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		int maSP = Integer.valueOf(model_table.getValueAt(i_row, 0)+"");
		String tenSP = model_table.getValueAt(i_row, 1)+"";
		int tonKho = Integer.valueOf(model_table.getValueAt(i_row, 2)+"");
		String phanLoai = model_table.getValueAt(i_row, 3)+"";
		double giaNhap = Double.valueOf(model_table.getValueAt(i_row, 4)+"");
		double giaBan = Double.valueOf(model_table.getValueAt(i_row, 5)+"");
		Date ngayKT = new Date(model_table.getValueAt(i_row, 6)+"");
		
		HangHoa hh = new HangHoa( maSP,  tenSP,  tonKho,  phanLoai,  giaNhap,  giaBan,  ngayKT);
		return hh;
	}
	
	public void hienThiThongTinDaChon() {
		HangHoa hh = getHangHoaDangChon();
		this.txtMaSP.setText(hh.getMaSP()+"");
		this.txtMaSP.setEditable(false);
		this.txtTonKho.setText(hh.getTonKho()+"");
		this.txtTenSP.setText(hh.getTenSP()+"");
		this.txtPhanLoai.setText(hh.getPhanLoai());
		this.txtGiaBan.setText(hh.getGiaBan()+"");
		this.txtGiaNhap.setText(hh.getGiaNhap()+"");
		this.txtNgayKiemTra.setText(new SimpleDateFormat("MM/dd/yyyy").format(hh.getNgayKT()));
	}

	public void xoaThongTin() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int i_row = table.getSelectedRow();
		if (i_row < 0) {
			JOptionPane.showMessageDialog(this, "Hãy chọn thông tin cần xóa",
                    "Lỗi",JOptionPane.ERROR_MESSAGE);
		}else {
		int choose = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa dữ liệu không?");
		if(choose == JOptionPane.YES_OPTION) {
			HangHoa hh = getHangHoaDangChon();
			this.model.delete(hh);
			model_table.removeRow(i_row);
		}
	}
	}

	/*
	 * Phuong thuc them hang hoa
	 */
	public void ThemThongTinHangHoa() throws Exception {
		this.txtMaSP.setEditable(true);
		
		//Lay du lieu
		int maSP = Integer.valueOf(this.txtMaSP.getText());
		int tonKho = Integer.valueOf(this.txtTonKho.getText());
		String tenSP = this.txtTenSP.getText();
		String phanLoai = this.txtPhanLoai.getText();
		double giaNhap = Double.valueOf(this.txtGiaNhap.getText());
		double giaBan = Double.valueOf(this.txtGiaNhap.getText()) + 0.1* Double.valueOf(this.txtGiaNhap.getText());
		this.txtGiaBan.setText(giaBan+"");
		Date ngayKT = new Date(this.txtNgayKiemTra.getText());
		HangHoa hh = new HangHoa(maSP, tenSP, tonKho, phanLoai, giaNhap, giaBan, ngayKT);

		this.themHoacCapnhat(hh);
		
	}

	public void timThongTin() {
		this.thucHienTaiLaiDuLieu();
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int soDong = model_table.getRowCount();
		int maHangHoa = Integer.valueOf(this.txtSearch.getText());
		Set<Integer> maHangHoaCanXoa = new TreeSet<Integer>();
		if(maHangHoa>0) {
			for(int i = 0; i < soDong; i++) {
				int maSpInTable = Integer.valueOf(model_table.getValueAt(i, 0)+"");
				if(maSpInTable != maHangHoa) {
					maHangHoaCanXoa.add(Integer.valueOf(maSpInTable));
				}
			}
		}
		
		for(Integer maCanXoa: maHangHoaCanXoa) {
			soDong = model_table.getRowCount();
			for(int i = 0; i < soDong; i++) {
				int maSpInTable = Integer.valueOf(model_table.getValueAt(i, 0)+"");
				if(maSpInTable == maCanXoa) {
					try {
						model_table.removeRow(i);
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}
	
	public void thucHienTaiLaiDuLieu() {
		while (true) {
			DefaultTableModel model_table = (DefaultTableModel) table.getModel();
			int soLuongDong = model_table.getRowCount();
			if(soLuongDong==0)
				break;
			else
				try {
					model_table.removeRow(0);
				} catch (Exception e) {
					e.printStackTrace();
				}
		}
		for (HangHoa hh : this.model.getHh()) {
			this.themThongTinVaoBang(hh);
		}
	}

	public void tinhTong() {
		DefaultTableModel model_table = (DefaultTableModel) table.getModel();
		int luaChonBox = comboBox_Tong.getSelectedIndex();
		double Tong = 0;
		if(luaChonBox == 0) {
			for(int i = 0; i < model_table.getRowCount(); i++) {
				Tong = Tong + Double.parseDouble(model_table.getValueAt(i, 4)+"");
			}
		}else if(luaChonBox == 1) {
			for(int i = 0; i < model_table.getRowCount(); i++) {
				Tong = Tong + Double.parseDouble(model_table.getValueAt(i, 5)+"");
			}
		}else if(luaChonBox == 2) {
			for(int i = 0; i < model_table.getRowCount(); i++) {
				Tong = Tong + Double.parseDouble(model_table.getValueAt(i, 2)+"");
			}
		}
		this.txtTong.setText(Tong+"");
	}

	public void save(String path) {
		try {
			this.model.setTenFile(path);
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (HangHoa hh : this.model.getHh()) {
				oos.writeObject(hh);
			}
			oos.close();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Error when saving file! Please try again.",
                    "Lỗi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void thucHienSaveFile() {
		if(this.model.getTenFile().length()>0) {
			save(this.model.getTenFile());
		}else {
			JFileChooser fc = new JFileChooser();
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
				File file = fc.getSelectedFile();
				save(file.getAbsolutePath());
			} 
		}
	}
	
	public void open(File file) {
		ArrayList<HangHoa> ds = new ArrayList<HangHoa>();
		try {
			this.model.setTenFile(file.getAbsolutePath());
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			HangHoa hh = null;
			while((hh = (HangHoa) ois.readObject())!=null) {
				ds.add(hh);
			}
			ois.close();
		} catch (Exception e) {
		}
		this.model.setHh(ds);
	}
	
	public void thucHienOpenFile() {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			File file = fc.getSelectedFile();
			open(file);
			thucHienTaiLaiDuLieu();
		} 
	}
	
}
