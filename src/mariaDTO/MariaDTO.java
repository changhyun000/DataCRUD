package mariaDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

//2022. 12. 20 이창현
//DTO Insert 데이터

public class MariaDTO {
	private String dataCode;
	private String month6;
	private String month7;
	private String month8;
	private String month9;
	private String month10;
	private String month11;

	public String getDataCode() {
		return dataCode;
	}

	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}

	public String getMonth6() {
		return month6;
	}

	public void setMonth6(String month6) {
		this.month6 = month6;
	}

	public String getMonth7() {
		return month7;
	}

	public void setMonth7(String month7) {
		this.month7 = month7;
	}

	public String getMonth8() {
		return month8;
	}

	public void setMonth8(String month8) {
		this.month8 = month8;
	}

	public String getMonth9() {
		return month9;
	}

	public void setMonth9(String month9) {
		this.month9 = month9;
	}

	public String getMonth10() {
		return month10;
	}

	public void setMonth10(String month10) {
		this.month10 = month10;
	}

	public String getMonth11() {
		return month11;
	}

	public void setMonth11(String month11) {
		this.month11 = month11;
	}

}
