#include <iostream>
using namespace std;

class Parent {
    private:
        string name;
    public:
        Parent () {this->name = "";}
        Parent (string name) {this->name = name;}
        string get_name() {return name;}
        void set_name(string name) {this->name = name;}

        string to_string() {return this->get_name();}
};

class Child : public Parent {
    private:
        string surname;
        typedef Parent super;
    public:
        Child (string name, string surname);
        string get_surname() {return this->surname;}

        string to_string() {return this->get_name() + " " + this->get_surname();}
};

Child::Child (string name, string surname) {
    this->set_name(name);
    this->surname = surname;
}

int main ()
{
    Parent p = Parent("Parent_name");
    Child c = Child("Child_name", "Child_surname");
    cout << p.to_string() << endl; // output: Parent_name
    cout << c.to_string() << endl; // output: Child_name Child_surname

    Parent pc = c;
    cout << pc.to_string() << endl; // output: Child_name
}
