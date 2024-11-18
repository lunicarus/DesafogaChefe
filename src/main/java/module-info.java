module projetos.desafogachefe {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires jbcrypt;
    requires java.management;

    opens projetos.desafogachefe to javafx.fxml;
    exports projetos.desafogachefe;
}