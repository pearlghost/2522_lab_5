/**
 * A class for Novel.
 *
 * @author Minh Ngoc Ngo
 * @author Thien Pham
 *
 * @version 1.0
 */
public class Novel
{
    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 2026;
    
    private String title;
    private String authorName;
    private int yearPublished;
    
    /**
     * Validates and Initializes all Novel's instance variables.
     *
     * @param title             String; Novel's title
     * @param authorName        String; Novel's author name
     * @param yearPublished     int; Novel's published year
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

    /**
     * Accessor for title.
     *
     * @return  String; the title
     */
    protected String getTitle()
    {
        return title;
    }

    /**
     * Mutator for title.
     *
     * @param title  String; new title
     */
    public void setTitle(final String title)
    {
        this.title = title;
    }

    /**
     * Accessor for the author's name.
     *
     * @return  String; the author name
     */
    protected String getAuthorName()
    {
        return authorName;
    }

    /**
     * Mutator for the author name.
     *
     * @param authorName  String; new authorName
     */
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    /**
     * Accessor for year published.
     *
     * @return  int; the year published
     */
    protected int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Mutator for year published.
     *
     * @param yearPublished int; new yearPublished
     */
    public void setYearPublished(final int yearPublished)
    {
        this.yearPublished = yearPublished;
    }


    /**
     * A method to validate title.
     *
     * @param title  String; title to be validated
     */
    private static void validateTitle(final String title)
    {
        if (title == null ||
                title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be empty or null.");
        }
    }

    /**
     * A method to validate author name.
     *
     * @param authorName  String; the name to be validated.
     */
    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null ||
                authorName.isBlank())
        {
            throw new IllegalArgumentException("Author's name can't be null or empty");
        }
    }

    /**
     * A method to validate the year published.
     *
     * @param yearPublished  int; the year to be validated.
     */
    private static void validateYearPublished(final int yearPublished)
    {
        if (yearPublished < MIN_YEAR)
        {
            throw new IllegalArgumentException("Year must be higher than minimum");
        }

        if (yearPublished > MAX_YEAR)
        {
            throw new IllegalArgumentException("Year must be lower than maximum");
        }
    }

    /**
     * A toString method to return the title, author name and year published in correct format.
     *
     * @return  String; Novel's instance variables.
     */
    @Override
    public String toString()
    {
        return title + " by " + authorName + ", " + yearPublished;
    }
}
