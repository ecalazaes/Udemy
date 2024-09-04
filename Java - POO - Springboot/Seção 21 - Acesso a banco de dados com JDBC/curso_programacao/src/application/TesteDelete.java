package application;

import db.DB;
import db.DbIntegrityException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TesteDelete {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement st = null;

        try{
            conn = DB.getConnection();

            st = conn.prepareStatement(
                    "Delete from seller " +
                            "where " +
                            "Id = ?"
            );
            st.setInt(1, 8);

            int rowsAffetecd = st.executeUpdate();

            System.out.println("Pront! Linhas Afetadas: " + rowsAffetecd);

        }
        catch ( SQLException e){
           throw new DbIntegrityException(e.getMessage());
        }
        finally {
            DB.closeStatment(st);
            DB.closeConnection();
        }

    }
}
