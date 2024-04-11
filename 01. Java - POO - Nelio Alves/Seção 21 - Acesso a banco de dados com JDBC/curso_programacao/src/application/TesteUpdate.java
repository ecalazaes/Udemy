package application;

import db.DB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteUpdate {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            st = conn.prepareStatement(
                    "Update seller " +
                            "set BaseSalary = BaseSalary + ? " +
                            "where " +
                            "(DepartmentId = ?)"
            );

            st.setDouble(1, 200.00);
            st.setInt(2, 2);

            int rowsAffetecd = st.executeUpdate();

            System.out.println("Pront! Linhas Afetadas: " + rowsAffetecd);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}
