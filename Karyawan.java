public class Karyawan extends Jabatan{
    protected String name,NIP;
    protected int permission,overtime,total_salary;


    public Karyawan(){}
    protected Karyawan(String name, String NIP, int permission, int overtime, int total_salary){
        this.name=name;
        this.NIP=NIP;
        this.permission=permission;
        this.overtime=overtime;
        this.total_salary=total_salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public int getTotal_salary() {
        return total_salary;
    }

    public void setTotal_salary(int total_salary) {
        this.total_salary = total_salary;
    }

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }
}
