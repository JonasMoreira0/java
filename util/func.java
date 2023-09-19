package util;

public class func {
    public String Name;
    public double GrossSalary;
    public double Tax;
    
    
    public double salarioLiquido () {
        return GrossSalary - Tax;
    }
    public void salarioBruto(double GrossSalary) {
        this.Tax += GrossSalary; 
    }
    public String toString() {
        return Name + ", $ "
        
        
        + String.format("%.2f", salarioLiquido ()); 
    }
}
