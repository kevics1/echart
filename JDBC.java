package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JDBC {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            //1.注册驱动
            Class.forName("org.postgresql.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/wuhan","postgres","gis2023");
            System.out.println("连接数据库成功!");
            //3.获取执行sql的对象
            stmt = conn.createStatement();
            //4.定义sql
            String sql = "SELECT name,ST_AsGeoJSON(geom) AS geojson  FROM res1_4m LIMIT 1";
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            while(rs.next()){
                //获取数据
                String name = rs.getString("name");
                String json = rs.getString("geojson");
                System.out.println("name:"+name+" geojson:"+json);
            }
            //7.释放资源
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}