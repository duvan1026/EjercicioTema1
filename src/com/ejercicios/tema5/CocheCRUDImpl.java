package com.ejercicios.tema5;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("metodo save");
    }

    @Override
    public void findAll() {
        System.out.println("metodo findAll");

    }

    @Override
    public void delete() {
        System.out.println("metodo delete");

    }
}
