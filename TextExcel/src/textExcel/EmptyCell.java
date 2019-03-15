package textExcel;

public class EmptyCell implements 	Cell{
	public EmptyCell(String cellText) {
	}
	public String abbreviatedCellText() {
		return "          ";
	}
	public String fullCellText() {
		return "";
	}
}
