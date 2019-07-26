package com.revature.daos;
import com.revature.beans.Monkeey;
import java.sql.SQLException;
import java.util.List;

public interface MonkeeyDAO {


		
			
			public List<Monkeey>getAllMonkeeys()
			throws SQLException;
			
			public Monkeey getMonkeey(String username)
					throws SQLException;


			
			public void updateMonkeeys(Monkeey m)
			throws SQLException;
			
			public void removeMonkeey(int ID)
			throws SQLException;
			
			public void addMonkeeys(Monkeey m)
					throws SQLException;
			
}
