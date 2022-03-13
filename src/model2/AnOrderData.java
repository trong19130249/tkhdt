package model2;

public class AnOrderData {
	private String[] columnNames = { "", "Mã hàng hóa", "Tên hàng hóa", "DVT", "Giá bán", "Số lượng", "Loại hàng hóa",
			"Tiền KM", "Thành tiền" };
	private Object[][] rowData = { { false, "0001", "Gạch xi măng", "Cục", 1900, 130, "Gạch", "", 247000 },
			{ false, "0002", "Gạch men", "Tấm", 3600, 200, "Gạch", "", 720000 },
			{ false, "0003", "Gạch men", "Tấm", 3600, 200, "", "", 720000 },
			{ false, "0004", "Gạch men", "Tấm", 3600, 200, "Gạch", "", 720000 },
			{ false, "0005", "Gạch men", "Tấm", 3600, 200, "Gạch", "", 720000 },
			{ false, "0006", "Gạch men", "Tấm", 3600, 200, "Gạch", "", 720000 } };

	public AnOrderData() {

	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public Object[][] getRowData() {
		return rowData;
	}

}
