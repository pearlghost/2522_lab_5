import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * @author
 * @author
 *
 * @version 1.0
 */
public class BookStore
{
    private final String bookStoreName;
    private final List<Novel> books;
    
    /**
     *
     */
    public BookStore(final String bookStoreName)
    {
        validateBookStoreName(bookStoreName);
        
        this.bookStoreName = bookStoreName;
        books = new ArrayList<>();
    }
    
    public static void main(String[] args)
    {
    
    }
    
    private static void validateBookStoreName(final String bookStoreName)
    {
    
    }
}
