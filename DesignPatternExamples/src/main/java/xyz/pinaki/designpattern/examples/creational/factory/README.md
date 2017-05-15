## What is it
<p align="center">
  <img src="../../../../../../../assets/factory-what.png?raw=true" width="450"/>
</p>

## Purpose
<p align="center">
  <img src="../../../../../../../assets/factory-method.png?raw=true" width="450"/>
</p>

## Applicability
<p align="center">
  <img src="../../../../../../../assets/factory-applicability.png?raw=true" width="450"/>
</p>

## Structure
<p align="center">
  <img src="../../../../../../../assets/factory-method.png?raw=true" width="450"/>
</p>

## Example
In code, either have the factory create the objects based on if-else / switch statements or precreate a hashmap as below.
~~~java
public class UserCommandFactory {
    /** 
     * Holds the expression tree that is the target of the commands.
     */
    private TreeOps treeOps;
	
    /** 
     * This interface uses the Command pattern to create @a
     * UserCommand implementations at runtime.
     */
    private static interface IUserCommandFactoryCommand {
        public UserCommand execute(String param);
    }
	
    /**
     * Map used to validate input requests for @a UserCommand
     * implementations and dispatch the execute() method of the
     * requested user command.
     */
    private HashMap<String, IUserCommandFactoryCommand> commandMap =
        new HashMap<String, IUserCommandFactoryCommand>();

    /** Ctor */
    UserCommandFactory(final TreeOps treeOps) {   	
    	/** Initialize the TreeOps member. */
        this.treeOps = treeOps;
   
    	/** 
         * A "format" string maps to a command object that creates
         * an @a FormatCommand implementation.
         */
        commandMap.put("format", new IUserCommandFactoryCommand() {
                public UserCommand execute(String param) {
                    return new FormatCommand(treeOps, param);
                }
            });
        
    	/** 
         * An "expr" string maps to a command object that creates
         * an @a ExprCommand implementation.
         */
        commandMap.put("expr", new IUserCommandFactoryCommand() { 
                public UserCommand execute(String param) {
                    return new ExprCommand(treeOps, param);
                }
            });
        // more similar stuff    
    }
    
    public UserCommand makeUserCommand(String inputString) {
        // ...
        IUserCommandFactoryCommand command = commandMap.get(inputString);
        return command.execute();
    }
}
~~~

## References
* [SafariOnline](https://www.safaribooksonline.com/library/view/design-patterns-in/9780133489989/5_10.html)
* [Youtube](https://www.youtube.com/watch?v=ub0DXaeV6hA&list=PLF206E906175C7E07&index=5)

