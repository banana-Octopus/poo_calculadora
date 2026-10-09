module dev.rampmaster.hbvhjbj {
    requires javafx.controls;
    requires javafx.fxml;

    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens dev.rampmaster.hbvhjbj to javafx.fxml;
    exports dev.rampmaster.hbvhjbj;
}