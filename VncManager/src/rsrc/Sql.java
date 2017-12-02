package rsrc;
/**
 * JDBC 드라이버와 사용될 쿼리문을 String형의 필드로 모아놓은 클래스
 * @author Dominic
 *
 */
public class Sql {
	//드라이버 정보
	public static final String DB_DRIVER = "oracle.jdbc.OracleDriver";
//	public static final String DB_ADDR = "jdbc:oracle:thin:@70.12.113.130:1521:orcl";
//	public static final String DB_USER_NAME = "m2";
//	public static final String DB_USER_PW = "1111";
	
	public static final String DB_ADDR = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String DB_USER_NAME = "user1";
	public static final String DB_USER_PW = "user1";
	
	//프로시저 쿼리문
	public static final String USP_REGISTER = "{call usp_register(?,?,?,?,?)}";
	public static final String USP_ADDV = "{call usp_addv(?,?,?,?,?,?,?,?)}";
	public static final String USP_ADDC = "{call usp_addc(?,?,?,?,?,?,?)}";
	public static final String USP_RENT = "{call usp_rent(?,?,?)}";
	public static final String USP_RETURN = "{call usp_return(?,?,?)}";
	public static final String USP_BOOK = "{call usp_book(?,?,?)}";
	
	//select문
	public static final String SELECT_CUSTOMER = "";
	public static final String SELECT_BOOKDATA = 
			"select b.ID, c.name, c.tel, b.p_id, p.title, b.b_no, r.due_date, p.kind"
			+ " from customer c join booking b on b.id = c.id"
			+ " join product p on b.p_id = p.p_id"
			+ " join rent_return r on p.p_id = r.p_id and r.return_date is null";
}
