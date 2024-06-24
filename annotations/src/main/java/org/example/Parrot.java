package org.example;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("parrot")
@Scope("prototype")
public class Parrot {
}
