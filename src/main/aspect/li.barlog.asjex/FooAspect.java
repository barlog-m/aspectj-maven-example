package li.barlog.asjex;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class FooAspect {
	@Pointcut("execution(* li.barlog.asjex.Foo.foo(..))")
	public void methodFooFromTypeFoo() {}

	@Before("methodFooFromTypeFoo()")
	public void before(JoinPoint joinPoint) {
		System.out.println("before " + joinPoint.toLongString());
	}
}
