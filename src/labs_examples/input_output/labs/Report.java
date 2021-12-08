package labs_examples.input_output.labs;

public class Report {
    private String tool;
    private String equipmentNumber;
    private String author;
    private String date;

    public Report() {
    }

    public Report(String tool, String equipmentNumber, String author, String date) {
        this.tool = tool;
        this.equipmentNumber = equipmentNumber;
        this.author = author;
        this.date = date;
    }

    public void setTool(String tool) {
        this.tool = tool;
    }

    public void setEquipmentNumber(String equipmentNumber) {
        this.equipmentNumber = equipmentNumber;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTool() {
        return tool;
    }

    public String getEquipmentNumber() {
        return equipmentNumber;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Report{" +
                "tool='" + tool + '\'' +
                ", equipmentNumber='" + equipmentNumber + '\'' +
                ", author='" + author + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
