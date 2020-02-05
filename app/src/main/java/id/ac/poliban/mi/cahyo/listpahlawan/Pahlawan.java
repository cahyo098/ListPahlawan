package id.ac.poliban.mi.cahyo.listpahlawan;

public class Pahlawan {
    private String flag;
    private String pahlawanName;
    private String pahlawanDesc;

    public Pahlawan(String flag, String pahlawanName, String pahlawanDesc) {
        this.flag = flag;
        this.pahlawanName = pahlawanName;
        this.pahlawanDesc = pahlawanDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getPahlawanName() {
        return pahlawanName;
    }

    public void setPahlawanName(String pahlawanName) {
        this.pahlawanName = pahlawanName;
    }

    public String getPahlawanDesc() {
        return pahlawanDesc;
    }

    public void setPahlawanDesc(String pahlawanDesc) {
        this.pahlawanDesc = pahlawanDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getPahlawanName(), getPahlawanDesc());
    }
}
