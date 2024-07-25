module Week10assignment {
	requires javafx.controls;
	requires java.logging;
	requires java.sql;
	
	opens application to javafx.graphics, javafx.fxml;
}
