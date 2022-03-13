package model2;

public class PurchasesData {
	private String[] columnNames = { "", "Chi tiết", "Mã nhập hàng", "Tên nhà cung cấp", "Số ĐT", "Tổng tiền" };
	private Object[][] rowData = {
			{ false, "Xem", "NH001", "Công ty xây dựng Bạch Đằng", "0947329501", 1330000 },
			{ false, "Xem", "NH002", "Công ty xây dựng Văn Lang", "0941231501", 1330000 },
			{ false, "Xem", "NH003", "Công ty xây dựng Châu Đốc", "123329501", 1330000 },
			{ false, "Xem", "NH004", "Nhà phân phối vật liệu An Tâm", "09473637234", 1330000 },
			{ false, "Xem", "NH005", "Đại lý vật liệu Thâm Châu", "018484248", 1330000 } };
	public PurchasesData() {
		
	}
 
	public String[] getColumnNames() {
		return columnNames;
	}
 
	public Object[][] getRowData() {
		return rowData;
	}
	

}
