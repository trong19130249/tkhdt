package model2;

public class OrdersData {
	private String[] columnNames = { "", "Chi tiết", "Mã đơn hàng", "Tên khách hàng", "Số điện thoại", "Địa chỉ GH", "Ngày lập",
			"Ngày giao", "Tiền KM", "Tổng tiền" };
	private Object[][] rowData = {
			{ false, "Xem", "DH001", "Trung Trường", "0947329501", "Hẻm 24, thôn Văn Tây, Xã Bình Châu, Cà Mau", "3/16/2021", "4/16/2021", 140, 120, 1330000 },
			{ false, "Xem", "DH002", "Nguyễn Thị Hương", "0941231501", "Đường số 2, quân Châu Đốc, Huế", "3/16/2021", "4/16/2021", 140, 120, 1330000 },
			{ false, "Xem", "DH003", "Văn Khánh", "123329501", "Cà Mau", "3/16/2021", "4/16/2021", 140, 120, 1330000 },
			{ false, "Xem", "DH004", "Duy Tài", "09473637234", "Cà Mau", "3/16/2021", "4/16/2021", 140, 120, 1330000 },
			{ false, "Xem", "DH005", "Tú Nguyễn", "018484248", "Cà Mau", "3/16/2021", "4/16/2021", 140, 120, 1330000 } };

	public OrdersData() {

	}

	public String[] getColumnNames() {
		return columnNames;
	}

	public Object[][] getRowData() {
		return rowData;
	}
	

}
