public class ccac {

    int id;
    String empName;
    String domain;
    public ccac(int id, String empName, String domain){
        this.id=id;
        this.empName=empName;
        this.domain=domain;
    }

    @Override
    public String toString() {
        return "Employee [domain=" + domain + ", empName=" + empName + ", id=" + id + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }  
}

class zensar{
    public static void main(String[] args) {
        ccac e = new ccac( 67620,"oadma", "java");
        System.out.println(e);
    }
}