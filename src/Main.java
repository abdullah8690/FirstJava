import game.Game;

import java.sql.*;

class Main {
    public static void main(String[] args) {
         Game test = new Game();
        test.demarage();



        try {
            Connection con =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/my_recipes","root","");
            Statement st = con.createStatement();
            String query = "select * from products";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()){
                System.out.println("Product No : "+rs.getString(1)+"\n"+"Product Name : "+rs.getString(2)+" \n"+"Product Desc : "+rs.getString(3));
            }
            st.close();
            con.close();

        } catch (
                SQLException e) {
            System.out.println(e);
        }catch (Exception e){
        }

    }

}