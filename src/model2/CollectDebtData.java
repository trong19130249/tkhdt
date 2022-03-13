package model2;

public class CollectDebtData {
	private String[] columnNames = { "", "Tên khách hàng", "Số tiền", "Ngày thu", "Điện thoại", "Địa chỉ", "Ghi chú" };
	private Object[][] rowData = { { false, "Trung Trường",3500000, "5/24/2021", "0947329501", "Hẻm 24, thôn Văn Tây, Xã Bình Châu, Cà Mau", "Khách quen" },
			{ false, "Tú Nguyễn", 2000000,"5/24/2021", "0947329501", "Cà Mau", "Khách quen" },
			{ false, "Duy Tài", 5400000, "5/24/2021", "0947329501", "Cà Mau", "Khách quen" },
			{ false, "Văn Khánh", 4000000, "5/24/2021", "0947329501", "Cà Mau", "Khách quen" },
			{ false, "Tú Nguyễn", 6090000, "5/24/2021", "0947329501", "Cà Mau", "Khách quen" } };
	public CollectDebtData() {
		
	}
	
	public String[] getColumnNames() {
		return columnNames;
	}
	
	public Object[][] getRowData() {
		return rowData;
	}
	

}
