module pl.crystaldpf.pogodnik {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.crystaldpf.pogodnik to javafx.fxml;
    exports pl.crystaldpf.pogodnik;
}