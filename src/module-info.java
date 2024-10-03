module javafx_demo {
	
	requires java.se;
	
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.media;
	
	requires lombok;
	requires org.apache.logging.log4j;
	
	opens org.zerock.myapp 
	   to javafx.graphics,
	      javafx.fxml;
	
} // module
