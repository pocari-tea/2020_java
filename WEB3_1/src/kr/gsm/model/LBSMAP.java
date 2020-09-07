package kr.gsm.model;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import com.google.gson.Gson;

public class LBSMAP {
	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public Connection getConnect() {
		//Connection
		String URL="jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user="hr";
		String password="hr";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection(URL, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
			return conn;
	}
	
	public String memAllList() {
		List<MapVO> list=new ArrayList<MapVO>();
		conn=getConnect();
		String SQL="select * from bizcard";
		try {
			ps=conn.prepareStatement(SQL);
			rs=ps.executeQuery();
			
			while (rs.next()) {
				String name=rs.getString("name");
				String phone=rs.getString("phone");
				String companyName=rs.getString("companyName");
				double latitude=rs.getDouble("latitude");
				double longitude=rs.getDouble("longitude");
				//¹­°í->´ã°í
				MapVO vo=new MapVO(name, phone, companyName, latitude, longitude);
				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Gson g=new Gson();
		System.out.println(g.toJson(list));
		return g.toJson(list);
	 }//memAllList
	
	 public String getMaps(String location) throws Exception{
		 String addr = "https://dapi.kakao.com/v2/local/search/address.json";
		 String apiKey = "KakaoAK d82e01bee32fbbde06b1e8cbaf4c6666";
		 location = URLEncoder.encode(location, "UTF-8");
		 String query = "query=" + location;
		
		 StringBuffer stringBuffer = new StringBuffer();
		 stringBuffer.append(addr);
		 stringBuffer.append("?");
		 stringBuffer.append(query);
		
		 System.out.println("stringBuffer.toString() "+ stringBuffer.toString());
		
		 URL url = new URL(stringBuffer.toString());
		
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		
		 conn.setRequestProperty("Authorization", apiKey);
		 conn.setRequestMethod("GET");
		
		 BufferedReader rd = null;
		 rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
		 StringBuffer docJson = new StringBuffer();
		
		 String line;
		 while((line=rd.readLine())!=null){
			 docJson.append(line);
		 }
		 if(0<docJson.toString().length()){
			 System.out.println("docJson :"+docJson.toString());
		
		 }
		 rd.close();
		
		 JSONObject jsonObject = new JSONObject(docJson.toString());
		 JSONArray jsonArray= (JSONArray) jsonObject.get("documents");
		 JSONObject tempObj = (JSONObject) jsonArray.get(0);
		 return tempObj.toString();
	 }
}