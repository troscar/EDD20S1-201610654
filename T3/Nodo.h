#ifndef NODO_H_INCLUDED
#define NODO_H_INCLUDED
#include <iostream>
#include <string>
using namespace std;

class Nodo{
    public:
        Nodo(int carne_, string name_)
        {
            name = name_;
            carne = carne_;
        }

        string getName() {return name;}
        int getCarne() {return carne;}
        
     private:
        string name;
        int carne;

};

#endif //NODO_H_INCLUDED