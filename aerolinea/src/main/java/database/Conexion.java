package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class Conexion{
	/*
	Connection conexion = null;

	String database =  "bd_aerolinea";
	String hostname = "bd4free.net";
	String port = "3306";
	String url = "jdbc:mysql://"+hostname+":"+port+"/"+database+"?useTimezone=true&serverTimezone=UTC";
	String username = "victor_emmanuel";
	String password = "12345678";
	
	public Connection connect() {
		
		try {
			this.conexion = DriverManager.getConnection(this.url,this.username,this.password);
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer conexion!:\n" + e.getMessage());
		}

		if (conexion != null) {
			System.out.println("Conexion exitosa");
		} else {
			System.out.println("Conexion no valida");
		}
		
		return this.conexion;
		
	}*/
	private Connection conn;
    private String host;
    private String db;
    private String username;
    private String password;
    private static Conexion connect;

    public Conexion() {
            this("bd4free.net","bd_aerolinea","victor_emmanuel","12345678");
    }

    public Conexion(String jndi) {
        try {
            InitialContext cxt = new InitialContext();
            DataSource ds = (DataSource) cxt.lookup(jndi);
            conn = ds.getConnection();
        } catch (Exception ex) {
        }
        connect = this;
    }

    public Conexion(String host, String db, String username, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.host = host;
        this.db = db;
        this.username = username;
        this.password = password;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://db4free.net:3306/bd_aerolinea", "victor_emmanuel", "12345678");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        connect = this;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDb() {
        return db;
    }

    public void setDb(String db) {
        this.db = db;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Connection connection() {
        try {
            return conn;
        } finally {
        }
    }

    public ResultSet query(String sQuery) {
        try {
            Statement s = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            s.executeQuery(sQuery);
            return s.getResultSet();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
        return null;
    }

    public Statement execute(String sQuery) {
        try {
            Statement s = conn.createStatement();
            s.executeUpdate(sQuery);
            return s;
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
        return null;
    }

    public void close(Statement s) {
        try {
            s.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.err.println("Error: " + e.getMessage() + "\n" + e.getErrorCode());
        }
    }

    public static Conexion getConnect() {
        return connect;
    }

    public static void setConnect(Conexion connect) {
        Conexion.connect = connect;
    }
}
    	
		

