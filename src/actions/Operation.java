package actions;

import java.util.Objects;

public class Operation {
    private String first;
    private String second;
    private String result;
    private String operation;

    public String getOperation() {
        return operation;
    }
    public void sum(){
        System.out.println(first+" "+second+" "+result+" "+operation);
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operation operation1 = (Operation) o;
        return Objects.equals(first, operation1.first) &&
                Objects.equals(second, operation1.second) &&
                Objects.equals(result, operation1.result) &&
                Objects.equals(operation, operation1.operation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second, result, operation);
    }

    @Override
    public String toString() {
        return "Operation{" +
                "first='" + first + '\'' +
                ", second='" + second + '\'' +
                ", result='" + result + '\'' +
                ", operation='" + operation + '\'' +
                '}';
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }
}
