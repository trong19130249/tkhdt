package model2;

public class APurchaseData {
	private String[] columnNames = { "", "Mã hàng hóa", "Tên hàng hóa", "DVT", "Giá nhập", "Số lượng", "Loại hàng hóa",
			 "Tổng tiền" };
	private Object[][] rowData = { { false, "0001", "Gạch xi măng", "Cục", 1900, 130, "Gạch", 247000 },
			{ false, "0002", "Gạch men", "Tấm", 3600, 200, "Gạch", 720000 },
			{ false, "0003", "Gạch men", "Tấm", 3600, 200, "", 720000 },
			{ false, "0004", "Gạch men", "Tấm", 3600, 200, "Gạch", 720000 },
			{ false, "0005", "Gạch men", "Tấm", 3600, 200, "Gạch", 720000 },
			{ false, "0006", "Gạch men", "Tấm", 3600, 200, "Gạch", 720000 } };
	public APurchaseData() {
		
	}
	 
	public String[] getColumnNames() {
		return columnNames;
	}
	 
	public Object[][] getRowData() {
		return rowData;
	}
	

}
