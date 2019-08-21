package lk.ijse.gms.dao;

import lk.ijse.gms.db.DBConnection;

import javax.naming.CommunicationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CrudUtil {
    public CrudUtil(){
    }

    protected static PreparedStatement getPreparedStatement(Connection conn, String sql, Object... params) throws Exception {
        int paramsCount = questionMark(sql);
        if (paramsCount != params.length) {
            throw new RuntimeException("Parameters count is mismatched");
        } else {
            PreparedStatement pStm = conn.prepareStatement(sql);

            for(int i = 0; i < params.length; ++i) {
                pStm.setObject(i + 1, params[i]);
            }

            return pStm;
        }
    }

    public static ResultSet executeQuery(String sql, Object... params) throws Exception {
        try {
            return getPreparedStatement(DBConnection.getInstance().getConnection(), sql, params).executeQuery();
        } catch ( CommunicationException var3) {
            return getPreparedStatement(DBConnection.getInstance().getConnection(), sql, params).executeQuery();
        }
    }

    public static int executeUpdate(String sql, Object... params) throws Exception {
        try {
            return getPreparedStatement(DBConnection.getInstance().getConnection(), sql, params).executeUpdate();
        } catch (CommunicationException var3) {
            return getPreparedStatement(DBConnection.getInstance().getConnection(), sql, params).executeUpdate();
        }
    }

    private static int questionMark(String sql) {
        byte count = 0;

        for(int i = 0; i < sql.length(); ++i) {
            if (sql.charAt(i) == '?') {
                ++count;
            }
        }
        return count;
    }
}



