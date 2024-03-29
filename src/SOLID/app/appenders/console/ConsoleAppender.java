package SOLID.app.appenders.console;

import SOLID.app.appenders.BaseAppender;
import SOLID.app.enums.ReportLevel;
import SOLID.app.layout.Layout;

public class ConsoleAppender extends BaseAppender {
    public ConsoleAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String dateTime, ReportLevel reportLevel, String message) {
        if (super.checkIfReportLevelIsValid(reportLevel)) {
            System.out.println(super.getLayout().format(dateTime, reportLevel, message));
            super.setMessagesAppended(super.getMessagesAppended() + 1);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
