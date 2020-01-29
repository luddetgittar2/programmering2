package sample;

public abstract class Animal {

    private String _color;

    private String _name;

    public Animal(String color) {
        _color = color;
    }

    abstract void speak();

    abstract void sleep();

    abstract void eat();

    abstract void walk();

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        _color = color;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }
}
