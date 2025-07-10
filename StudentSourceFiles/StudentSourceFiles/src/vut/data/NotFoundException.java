package vut.data;

/**
 * Used when the code could not be found
 * @author S Ribeiro
 */
public class NotFoundException extends java.lang.Exception
{
    
    /**
     * Creates a new instance of <code>NotFoundException</code> without detail message.
     */
    public NotFoundException()
    {
    }
    
    
    /**
     * Constructs an instance of <code>NotFoundException</code> with the specified detail message.
     * @param msg the detail message.
     */
    public NotFoundException(String msg)
    {
        super(msg);
    }
}
