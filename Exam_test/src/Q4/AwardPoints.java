package Q4;

import java.io.*;
public class AwardPoints {
	public AwardPoints(int numberOfPoints, String reasonForPoints) {
		
	}
	
	String pathname = "D:\\student.txt";
	File filename = new File(pathname)
	InputStreamReader reader = new InputStreamReader(
             new FileInputStream(filename));
	BufferedReader br = new BufferedReader(reader);
	String line = "";
	line = br.readLine();
    while (line != null) {
        line = br.readLine();
	
	
	
	public ADD() {
		
		String secondName;
		String firstName;
		int points;
		int numberOfPoints;
		String reason;
		
		
		
		File file = new File("student.txt");
	    file.createNewFile();
	    FileWriter writer = new FileWriter(file);
	    writer.write(secondName +" "+ firstName +" "+ points +" "+reason);
	    writer.flush();
	    writer.close();
	}
	
	
	
	public reset
	
	public list
	
	

	
	public static String read(String filePath){
		BufferedReader br = null;
		String line =null;
		//StringBuffer buf = new StringBuffer();
		try {
			
			br = new BufferedReader(new FileReader(filePath));//
			String str = "";
			
			//循环读取文件的每一行，对需要修改的行进行修改，放入缓冲对象中
			 while ((line = br.readLine()) != null) {
				 //if there are more than one space, see as one
				 str=line+"\r\n";
				 String[] dictionary =  str.split("\\s{2,}|\t");
				 for(int i=0;i<dictionary.length;i++){
					str = "insert into tablename values("+ dictionary[0]+",'"+dictionary[1]+"',"+dictionary[2]+"')";
				 }
				 System.out.println(str);
				 
			 }
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
	         if (br != null) {
	               try {
	                   br.close();
	               } catch (IOException e) {
	                     br = null;
		        }
		     }
		}
		return null;
	}

	
	File file=new File("E:\\student.txt");  
    BufferedReader reader=null;  
    String temp=null;  
    int line=1;  
    try{  
            reader=new BufferedReader(new FileReader(file));  
            while((temp=reader.readLine())!=null){  
                String string=AnalyzeStr.getAnalyze().getNewString(temp);
                System.out.println(string);
                AnalyzeStr.getAnalyze().saveRecordInFile(string);
                line++;  
            }  
    }  
    catch(Exception e){  
        e.printStackTrace();  
    }  
    finally{  
        if(reader!=null){  
            try{  
                reader.close();  
            }  
            catch(Exception e){  
                e.printStackTrace();  
            }  
        }  
    }  
	
	
    public boolean equals(Object obj){
		if(obj == null){
			return false;
		}else {			
				if(this.getClass() == obj.getClass()){
					User u = (User) obj;
					if(this.getUsername().equals(u.getUsername())){
						return true;
					}else{
						return false;
					}
				
			}else{
				return false;
			}
		}			
    
    
    
}
