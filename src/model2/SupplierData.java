package model2;

public class SupplierData {
	private String[] columnNames = { "", "Mã NCC", "Tên nhà cung cấp", "Điện thoại", "Địa chỉ", "Nợ NCC", "Ghi chú" };
	private Object[][] rowData = {
			{ false, "0001", "Công ty xây dựng Bạch Đằng", "0945937291", "263 Trần Nguyên Hấn", 2000, "Nhà cung cấp tốt" },
			{ false, "0002", "Công ty xây dựng Văn Lang", "0945937291", "263 Trần Nguyên Hấn", 2000, "Nhà cung cấp tốt" },
			{ false, "0003", "Công ty xây dựng Châu Đốc", "0945937291", "263 Trần Nguyên Hấn", 2000, "Nhà cung cấp tốt" },
			{ false, "0004", "Nhà phân phối vật liệu An Tâm", "0945937291", "263 Trần Nguyên Hấn", 2000, "Nhà cung cấp tốt" },
			{ false, "0005", "Đại lý vật liệu Thâm Châu", "0945937291", "263 Trần Nguyên Hấn", 2000, "Nhà cung cấp tốt" } };
	
	public SupplierData() {
		
	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public Object[][] getRowData() {
		return rowData;
	}
	

}
