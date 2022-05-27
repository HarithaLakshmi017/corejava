package com.chainsys.miniproject.dao;
import com.chainsys.miniproject.pojo.Appointments;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class AppointmentDao {
	public class Appointmentsdao {
		private static Connection getConnection() {
			String drivername = "oracle.jdbc.OracleDriver";
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "oracle";
			try {
				Class.forName(drivername);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			Connection con = null;
			try {
				con = DriverManager.getConnection(dbUrl, username, password);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return con;
		}

		private static java.sql.Date convertTosqlDate(java.util.Date date) {
			java.sql.Date sqldate = new java.sql.Date(date.getTime());
			return sqldate;
		}

		public static int insertAppointment(Appointments newapp) {
			String insertquery = "insert into appointments (APPOINTMENT_ID,APPOINTMENT_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED) values (?,?,?,?,?)";
			Connection con = null;
			int rows = 0;
//			int rows ;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(insertquery);
				ps.setInt(1, newapp.getApp_id());
				// convert java.util.Date to java.sql.date
				ps.setDate(2, convertTosqlDate(newapp.getApp_date()));
				ps.setInt(3,newapp.getApp_id());
				ps.setString(4, newapp.getPatient_name());
				ps.setFloat(5, newapp.getFees_collected());
				

				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}
		public static int updateAppointment(Appointments newapp) {
			String updatequery = "update appointments set APPOINTMENT_DATE=?,DOCTOR_ID=?,PATIENT_NAME=?,FEES_COLLECTED=? where APPOINTMENT_ID=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				
				// convert java.util.Date to java.sql.date
				ps.setDate(1, convertTosqlDate(newapp.getApp_date()));
				ps.setInt(2, (newapp.getApp_id()));
				ps.setString(3, newapp.getPatient_name());
				ps.setFloat(4, newapp.getFees_collected());
				ps.setInt(5, newapp.getApp_id());
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return rows;
		}

		// to update only one column of the table
		public static int updateAppointmentName(int id, String appname) {
			String updatequery = "update appointments set APP_NAME=? where APP_id=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setString(1, appname);
				ps.setInt(2, id);
				ps.executeUpdate();
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			return rows;
		}

		public static int updateAppointmentFees(int id, float fees) {
			String updatequery = "update appointments set fees=? where app_id=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(updatequery);
				ps.setDouble(1, fees);
				ps.setInt(2, id);
				ps.executeUpdate();
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}

		public static int deleteAppointment(int id) {
			String deletequery = "delete from appointments where APPOINTMENT_ID=?";
			Connection con = null;
			int rows = 0;
			PreparedStatement ps = null;

			try {
				con = getConnection();
				ps = con.prepareStatement(deletequery);
				ps.setInt(1, id);
				ps.executeUpdate();
				rows = ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return rows;
		}

		public static Appointments getAppointmentById(int id) {
			Appointments app = null;
			String selectquery = "select APPOINTMENT_ID,APPOINTMENT_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED from appointments where APPOINTMENT_ID=?";
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(selectquery);
				ps.setInt(1, id);
				 ps.executeQuery();
				rs = ps.executeQuery();

				if (rs.next()) {
					app = new Appointments();
					app.setApp_id(rs.getInt(1));
					java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
					app.setApp_date(date);
					app.setApp_id(rs.getInt(3));
					app.setPatient_name(rs.getString(4));
					app.setFees_collected(rs.getFloat(5));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return app;

		}

		public static List<Appointments> getAllAppointment() {
			List<Appointments> listOfAppointment = new ArrayList<Appointments>();
			Appointments app = null;
			String selectquery = "select APPOINTMENT_ID ,APPOINTMENT_DATE,DOCTOR_ID,PATIENT_NAME,FEES_COLLECTED from appointments ";
			Connection con = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			try {
				con = getConnection();
				ps = con.prepareStatement(selectquery);
				rs = ps.executeQuery();

				while (rs.next()) {
					app = new Appointments();
					app.setApp_id(rs.getInt(1));
					java.util.Date date = new java.util.Date(rs.getDate(2).getTime());
					app.setApp_date(date);
					app.setApp_id(rs.getInt(3));
					app.setPatient_name(rs.getString(4));
					app.setFees_collected(rs.getFloat(5));
					listOfAppointment.add(app);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			return listOfAppointment;
		}

	}



}
