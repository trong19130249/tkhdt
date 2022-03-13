package model2;

public class PayDebtData {
	private String[] columnNames = { "", "Tên nhà cung cấp", "Số tiền", "Ngày trả", "Ghi chú" };
	private Object[][] rowData = { { false, "Công ty xây dựng Bạch Đằng",3500000, "5/24/2021",  "nhà cung cấp tốt" },
			{ false, "Công ty xây dựng Văn Lang", 2000000,"5/24/2021",  "nhà cung cấp tốt và thân thiện" },
			{ false, "Công ty xây dựng Châu Đốc", 5400000, "5/24/2021", "nhà cung cấp tệ" },
			{ false, "Nhà phân phối vật liệu An Tâm", 4000000, "5/24/2021",  "nơi cung cấp nhiều hàng" },
			{ false, "Đại lý vật liệu Thâm Châu", 6090000, "5/24/2021",  "nhà cung cấp quen" } };
	public PayDebtData() {
		
	}
	 
	public String[] getColumnNames() {
		return columnNames;
	}
	 
	public Object[][] getRowData() {
		return rowData;
	}
	

}
