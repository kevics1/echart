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

            //4.定义sql

            //5.执行sql

            //6.遍历结果集，封装对象，装载集合

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
