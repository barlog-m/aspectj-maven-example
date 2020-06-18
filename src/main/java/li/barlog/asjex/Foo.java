package li.barlog.asjex;

import lombok.extern.java.Log;

import java.util.logging.Level;

@Log
public class Foo {
    public void foo() {
        log.log(Level.SEVERE, "foo");
    }
}
