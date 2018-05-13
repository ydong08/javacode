
class TClassVar {
    /**
    * 类变量也称为静态变量，在类中以static关键字声明，但必须在方法构造方法和语句块之外。
    * 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
    * 静态变量除了被声明为常量外很少使用。常量是指声明为public/private，final和static类型的变量。常量初始化后不可改变。
    * 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
    * 静态变量在程序开始时创建，在程序结束时销毁。
    * 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
    * 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。
        变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
    * 静态变量可以通过：ClassName.VariableName的方式访问。
    * 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，
        其命名方式与实例变量以及局部变量的命名方式一致。
     */
    public static double salary;
    public static final String DEPARTMENT = "developer";

    public static void main(String[] args) {
        salary = 1000;
        //TClassVar tcv = new TClassVar();
        System.out.println(DEPARTMENT + " salary: " + salary);
    }
}