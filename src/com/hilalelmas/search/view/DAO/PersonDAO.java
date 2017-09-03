package com.hilalelmas.search.view.DAO;

import com.hilalelmas.search.view.entity.LoginEntity;
import com.hilalelmas.search.view.entity.PersonEntity;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PersonDAO extends ADao {

    public LoginEntity getLoginList(String username, String password) {
        LoginEntity loginEntity = new LoginEntity();
        PersonEntity personEntity = new PersonEntity();
        String SQL = "SELECT *FROM login l where l.username='%s' and l.password='%s' ";
        SQL = String.format(SQL, username, password);
        try {
            Statement statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            if (rs.next()) {
                loginEntity.setUsername(rs.getString("username"));
                loginEntity.setPassword(rs.getString("password"));
            }


            if (loginEntity.getUsername() != null) {
                SQL = "SELECT *FROM person l where l.username='%s";
                SQL = String.format(SQL, loginEntity.getUsername());
                rs = statement.executeQuery(SQL);
                if (rs.next()) {
                    personEntity.setPersonusername(rs.getString("personusername"));
                    personEntity.setName(rs.getString("name"));
                    personEntity.setPassword(rs.getString("password"));
                    personEntity.setBirthday(rs.getString("birthday"));
                    loginEntity.setPersonEntity(personEntity);

                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return loginEntity;
    }

}
