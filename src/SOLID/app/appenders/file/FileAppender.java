package SOLID.app.appenders.file;

import SOLID.app.appenders.BaseAppender;
import SOLID.app.enums.ReportLevel;
import SOLID.app.layout.Layout;

public class FileAppender extends BaseAppender {

    private File file;

    public FileAppender(Layout layout) {
        super(layout);
    }

    @Override
    public void append(String dateTime, ReportLevel reportLevel, String message) {
        if (super.checkIfReportLevelIsValid(reportLevel)) {
            this.file.write(super.getLayout().format(dateTime, reportLevel, message));
            super.setMessagesAppended(super.getMessagesAppended() + 1);
        }
    }

    public void setFile(File file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return super.toString() + ", File size: " + this.file.getSize();
    }
}