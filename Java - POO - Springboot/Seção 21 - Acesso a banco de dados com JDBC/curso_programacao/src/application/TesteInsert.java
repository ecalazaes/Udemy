package application;

import db.DB;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteInsert {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "Insert Into seller"
                    + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
                    + "Values "
                    + "(?, ?, ?, ?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            st.setString(1, "Erick Calazães");
            st.setString(2, "ecalazaes@gmail.com");
            st.setString(3, String.valueOf(new java.sql.Date(sdf.parse("02/03/1991").getTime())));
            st.setDouble(4, 3000.00);
            st.setInt(5, 4);



            st = conn.prepareStatement(
                    "insert into department (Name) values ('D1'), ('D2')",
                            Statement.RETURN_GENERATED_KEYS);

            int rowsAffected = st.executeUpdate();

            if (rowsAffected > 0 ) {
                ResultSet rs = st.getGeneratedKeys();
                while(rs.next()) {
                    int id = rs.getInt(1);
                    System.out.println("Pront! Id = " + id);
                }
            }
            else {
                System.out.println("Sem linhas alteradas!");
            }

        }
        catch ( SQLException e){
            e.printStackTrace();
        }
        catch ( ParseException e) {
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }
    }
}
