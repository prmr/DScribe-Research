package $package$;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class $class$Test { 
	
	/**
	 * IF: $state$ THEN: [$ex$] [is] [thrown]
	 */
    @Template("template1")
    @Types($state$=EXPR, $ex$=EXCEPTION, $factory$=TYPE, $params$=EXPR_LIST)
    @Test
    public void testAssertThrows_$method$_$state$() {
        assertThrows($ex$.class, () ->  $factory$.$method$($params$));
    }
	
	/**
	 * IF: $state$ THEN: [$ex$] [is] [thrown]
	 */
    @Template("template2")
    @Types($state$=EXPR, $ex$=EXCEPTION, $factory$=METHOD, $params$=EXPR_LIST)
    @Test
    public void testAssertThrows_$method$_$state$() {
        assertThrows($ex$.class, () ->  $factory$().$method$($params$));
    }

	/**
	 * IF: $state$ THEN: [$ex$] [is] [thrown]
	 */
    @Template("template3")
    @Types($state$=EXPR, $ex$=EXCEPTION, $factory$=TYPE, $params$=EXPR_LIST, $message$=EXPR)
    @Test
    public void testAssertThrowsMessage_$method$_$state$() {
        final $ex$ thrown = assertThrows($ex$.class,() -> $factory$.$method$($params$));
        assertEquals($message$, thrown.getMessage());
    }
    
	/**
	 * IF: $state$ THEN: [$ex$] [is] [thrown]
	 */
    @Template("template4")
    @Types($state$=EXPR, $ex$=EXCEPTION, $factory$=METHOD, $params$=EXPR_LIST, $message$=EXPR)
    @Test
    public void testAssertThrowsMessage_$method$_$state$() {
        final $ex$ thrown = assertThrows($ex$.class,() -> $factory$().$method$($params$));
        assertEquals($message$, thrown.getMessage());
    }
    
	/**
	 * IF: $state$ THEN: [$ex$] [is] [thrown]
	 */
    @Template("template5")
    @Types($state$=EXPR, $ex$=EXCEPTION, $params$=EXPR_LIST, $message$=EXPR)
    @Test
    public void testAssertThrowsMessage_$method$_$state$() {
        final $ex$ thrown = assertThrows($ex$.class,() -> $method$($params$));
        assertEquals($message$, thrown.getMessage());
    }
}
