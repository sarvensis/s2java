package sberJPA.util.reader;

import sberJPA.util.reader.exeption.IncompleteOperationException;

public interface Reader<T> {
    T read(String consoleOut) throws IncompleteOperationException;
}
