package model2;

public class ProductsData {
	private String[] columnNames = {"", "Mã hàng hóa", "Tên hàng hóa", "DVT", "Giá nhập", "Giá bán", "Tồn kho",
			"Loại hàng hóa" };
	private Object[][] rowData = { { false, "0001", "Gạch xi măng", "Cục", 2000, 3100, 1300, "Gạch" },
			{ false, "0002", "Gạch men", "Tấm", 4000, 5000, 2000, "Gạch" },
			{ false, "0003", "Đá xây móng", "Cục", 3200, 3600, 1400, "Đá" },
			{ false, "0004", "Cát xây", "Bao", 7000, 7600, 150, "Cát" },
			{ false, "0005", "Ống nước 350 - 5m", "Ống", 4000, 5600, 430, "Ống nước" },
			{ false, "0006", "Mái tôn 987", "Tấm", 46000, 70600, 120, "Mái tôn" } };

	public ProductsData() {

	}

	public String[] getColumnNames() {
		return columnNames;
	}
 
	public Object[][] getRowData() {
		return rowData;
	}

}
