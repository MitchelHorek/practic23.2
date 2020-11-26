package com.company;

public class SaveMassType<E> {
    E[] array;

    public SaveMassType(E[] array){
        this.array = array;
    }

    public E[] getArray() {
        return array;
    }
}