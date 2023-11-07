package generics;


import java.util.function.Supplier;

class ClassAsFactory<T> implements Supplier<T> {

    Class<T> kind;


    public ClassAsFactory(Class<T> kind) {
        this.kind = kind;
    }

    @Override
    public T get() {
        try {
            return kind.getConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {
    public Employee() {
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe = new ClassAsFactory<>(Employee.class);
        System.out.println(fe.get());
    }
}
