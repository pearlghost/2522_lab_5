
/**
 *
 *
 * @author Minh Ngoc Ngo
 * @author
 *
 * @version 1.0
 */
public class Novel
{
    private String title;
    private String authorName;
    private int yearPublished;
    
    /**
     * Validates and Initializes all Novel's instance variables.
     *
     * @param title             String;
     * @param authorName        String;
     * @param yearPublished     int;
     */
    public Novel(final String title,
                 final String authorName,
                 final int yearPublished)
    {
        validateTitle(title);
        validateAuthorName(authorName);
        validateYearPublished(yearPublished);
        
        this.title = title;
        this.authorName = authorName;
        this.yearPublished = yearPublished;
    }
    
    protected String getTitle()
    {
        return title;
    }
    
    public void setTitle(final String title)
    {
        this.title = title;
    }
    
    protected String getAuthorName()
    {
        return authorName;
    }
    
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }
    
    protected int getYearPublished()
    {
        return yearPublished;
    }
    
    public void setYearPublished(final int yearPublished)
    {
        this.yearPublished = yearPublished;
    }
    
    
    private static void validateTitle (final String title)
    {
        if (title == null || title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be empty or null.");
        }
    }
    
    private static void validateAuthorName(final String authorName)
    {
    
    }
    
    private static void validateYearPublished(final int yearPublished)
    {
    
    }
}
