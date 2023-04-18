package com.github.diegopacheco.elegantobjects.book.employment;

import java.io.File;

public class NeverAcceptNull {
    // Consider this: method - mask could be null
    public Iterable<String> find(String mask){
        // implementation
        // return null just to make java happy - should not return null;
        // would you do an IF here to check if mask is null?
        return null;
    }
}

// option #1 use Polymorphism
interface UserFiles{
    Iterable<String> findAll();
    Iterable<String> find(String mask);
}

// option #2 use optional behavior as part of the code
interface Mask{
    boolean matches(File file);
}
class AnyFile implements Mask{
    @Override
    public boolean matches(File file){
        return true;
    }
}
// now the user don't need to pass null can pass an AnyFile object
interface UserFilesV2{
    Iterable<String> find(Mask mask);
}
