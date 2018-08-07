package designPatterns.struct.flyWeight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 *
 * 通过连接池的管理，实现了数据库连接的共享，不需要每一次都重新创建连接，节省了数据库重新创建的开销，提升了系统的性能。
 *
 */
public class ConnectionPool {

    private Vector<Connection> pool;

    private String url ="test123";
    private String username="1";
    private String password="1";
    private String driverClassName="1";

    private int poolSize=100;
    Connection conn = null;

    private ConnectionPool(){
        pool = new Vector<Connection>();

        for(int i=0;i<poolSize;i++){
            try {
                Class.forName(driverClassName);
                conn= DriverManager.getConnection(url,username,password);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private synchronized void release(){
        pool.add(conn);
    }

    public synchronized Connection getConnection(){
        if(pool.size()>0){
            conn = pool.get(0);
            pool.remove(conn);
            return conn;
        }else{
            return null;
        }
    }



}
