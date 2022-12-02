package game;

import Personage.Magician;
import Personage.Personnage;
import Personage.Wrrior;
import com.mysql.cj.jdbc.ConnectionImpl;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.List;

public class Singleton {
    public List<Personnage> loadAllPersonnage;

    JOptionPane JOptionPane;
    static final String DB_URL = "jdbc:mysql://localhost/d&d";
    static final String USER = "root";
    static final String PASS = "";
    static final String QUERY = "SELECT id FROM hero";


    private static Singleton singleton = new Singleton();


    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {

    }

    public void loadPersonage() {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            String query = "select * from hero";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println("Hero Id : " + rs.getString(1)
                        + "\n" + "Game Hero Type : " + rs.getString(2)
                        + "\n" + "Player Name : " + rs.getString(3)
                        + "\n" + "NiveauVie : " + rs.getString(4)
                        + "\n" + "NiveauForce : " + rs.getString(5)
                        + "\n" + "Arme/Sort : " + rs.getString(6)
                        + "\n" + "Bouclier : " + rs.getString(7));
            }


            st.close();
            con.close();

        } catch (
                SQLException e) {
            System.out.println(e);
        } catch (Exception e) {
        }
    }

    public Integer insertIntoDB(Personnage personnage) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            String q = "insert into hero(Type,Name,NiveauVie,NiveauForce,ArmeSort,Bouclier) values(?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(q);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String type = "";
            if (personnage instanceof Wrrior) {
                type = "Warrior";
            } else if (personnage instanceof Magician) {
                type = "Magician";
            }

            String name = personnage.getName();
            int niveaVie = personnage.getPv();
            int niveaForce = personnage.getForce();
            String armeOuSort = personnage.getWeaponToAttack().getName();
            String bouclier = personnage.getThingToDefend().getName();

            pstmt.setString(1, type);
            pstmt.setString(2, name);
            pstmt.setInt(3, niveaVie);
            pstmt.setInt(4, niveaForce);
            pstmt.setString(5, armeOuSort);
            pstmt.setString(6, bouclier);
            pstmt.executeUpdate();

            con.close();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public Integer update(Personnage personnage) {
        try {

            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            String q = "UPDATE `hero` SET `Type`= ? ,`Name` = ? , `NiveauVie` = ?, `NiveauForce` = ?, `ArmeSort` = ? , `Bouclier` = ? where `id` = ?";
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String type = "";
            if (personnage instanceof Wrrior) {
                type = "Warrior";
            } else if (personnage instanceof Magician) {
                type = "Magician";
            }

            System.out.println("Enter Player name : ");
            String name = br.readLine();
            int niveaVie = personnage.getPv();
            int niveaForce = personnage.getForce();
            String armeOuSort =personnage.getWeaponToAttack().getName();
            String bouclier =  personnage.getThingToDefend().getName();

            System.out.println("Enter Id : ");
            int id = Integer.parseInt(br.readLine());

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, type);
            pstmt.setString(2, name);
            pstmt.setInt(3, niveaVie);
            pstmt.setInt(4, niveaForce);
            pstmt.setString(5, armeOuSort);
            pstmt.setString(6, bouclier);
            pstmt.setInt(7, id);


            pstmt.executeUpdate();

            System.out.println("Done......");
            con.close();

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        return 0;
    }

    public boolean delete(Personnage personnage) {
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            loadPersonage();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Id : ");
            String q = "DELETE FROM hero WHERE id =?";
            PreparedStatement pstmt = con.prepareStatement(q);
            int id = Integer.parseInt(br.readLine());
            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println(" Deleted");
            pstmt.close();
            con.close();
        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }


        return true;
    }

}
