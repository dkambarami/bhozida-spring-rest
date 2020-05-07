package com.bhozida.service;
import java.util.List;

public interface JpaCrudService<T, ID> {
    T findById(ID id);

    T addUpdate(T object);

    List<T> findAll();

    void delete(T object);

    void deleteById(ID id);

    boolean empty();
}