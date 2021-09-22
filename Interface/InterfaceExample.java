interface car extends Tesla{    
    String carNmae = "Maruthi"; //public static final int carName = "Maruthi";
    public void BMW(String model);  
    void Hyundai(String model);    // public abstract void Hyundai(String model);

    default void m2(){
        System.out.println("Default method");
        m3();
    }

    private void m3(){
        System.out.println("m3");
    };
    // protected void m4(){}   // only public, private, abstract, default, static and strictfp are permitted
}

interface Tesla{
    public void TeslaModel(String model);
}

public class InterfaceExample implements car{
    public static void main(String[] args) {
        car name = new InterfaceExample();
        name.BMW("BMW001");
        name.Hyundai("Astor");
        name.m2();
        name.TeslaModel("T modal X");
    }

    @Override
    public void BMW(String modelName) {
        System.out.println(modelName);
        
    }

    @Override
    public void Hyundai(String modelName) {
        System.out.println(modelName);
        
    }

    @Override
    public void TeslaModel(String model) {
        System.out.println(model);
        
    }
}
