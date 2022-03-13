package model2;

public class StaffData {
	private String[] columnNames = { "", "Mã nhân viên", "Tên nhân viên", "Điện thoại", "Hoạt động", "Ghi chú" };
	private Object[][] rowData = { { false, "0001", "Ngô Văn Lân", "0947329501", false, "Làm việc tốt" },
			{ false, "0001", "Ngô Văn Lân", "0947329501", true, "Làm việc tốt" } };
	public StaffData() {
		
	}
	
	public String[] getColumnNames() {
		return columnNames;
	}
	
	public Object[][] getRowData() {
		return rowData;
	}
	

}
