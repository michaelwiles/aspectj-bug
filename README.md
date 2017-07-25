# aspectj-bug
Test code to illustrate my aspectj bug

Clone and do mvn install

Aspectj compile will fail.

Comment out  x.andThen(this::get); line in FailsAspectJ and aspectj compile will pass.
