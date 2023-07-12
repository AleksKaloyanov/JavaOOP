package SOLID.app.layout;

import SOLID.app.enums.ReportLevel;

public interface Layout {
    String format(String dateTime, ReportLevel reportLevel, String message);
}
