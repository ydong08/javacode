
public class TVariable {
    /**
     * 局部变量声明在方法、构造方法或者语句块中；
    * 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
    * 访问修饰符不能用于局部变量；
    * 局部变量只在声明它的方法、构造方法或者语句块中可见；
    * 局部变量是在栈上分配的。
    * 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。  
     */

     /**
    * 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
    * 当一个对象被实例化之后，每个实例变量的值就跟着确定；
    * 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
    * 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
    * 实例变量可以声明在使用前或者使用后；
    * 访问修饰符可以修饰实例变量；
    * 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
    * 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
    * 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。
      */
    public String name;
    private double salary;
    public TVariable(String name) {
       this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printInfo() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);
    }

    public static void main(String[] args) {
        TVariable tv = new TVariable("castles");
        tv.setSalary(1000);
        tv.printInfo();
    }
}