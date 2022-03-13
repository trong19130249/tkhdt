package model2;

public class CustomerData {
	private String[] columnNames = { "", "Mã khách hàng", "Tên khách hàng", "Điện thoại", "Địa chỉ", "Số tiền nợ",
			"Ghi chú" };
	private Object[][] rowData = { { false, "0001", "Tú Nguyễn", "0947329501", "Cà Mau", 144, "Khách quen" },
			{ false, "0002", "Tú Nguyễn", "0947329501", "Cà Mau", 200, "Khách quen" },
			{ false, "0003", "Tú Nguyễn", "0947329501", "Cà Mau", 200, "Khách quen" },
			{ false, "0004", "Tú Nguyễn", "0947329501", "Cà Mau", 200, "Khách quen" },
			{ false, "0005", "Tú Nguyễn", "0947329501", "Cà Mau", 200, "Khách quen" } };
	public CustomerData() {
		
	}
	
	public String[] getColumnNames() {
		return columnNames;
	}
	
	public Object[][] getRowData() {
		return rowData;
	}
	

}
