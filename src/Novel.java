/**
 * A class for Novel.
 *
 * @author Minh Ngoc Ngo
 * @author Thien Pham
 * @version 1.0
 */
public class Novel
{
    private String title;
    private String authorName;
    private int yearPublished;

    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 2026;


    /**
     * Validates and Initializes all Novel's instance variables.
     *
     * @param title         String;
     * @param authorName    String;
     * @param yearPublished int;
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
     * Accesstor for title.
     * @return the title.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Mutator for title.
     * @param title  title.
     */
    public void setTitle(final String title)
    {
        this.title = title;
    }

    /**
     * Accesstor for the author's name.
     * @return the author name.
     */
    public String getAuthorName()
    {
        return authorName;
    }

    /**
     * Setter for the author name.
     * @param authorName  authorName.
     */
    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    /**
     * Accesstor for year published.
     * @return the year published.
     */
    public int getYearPublished()
    {
        return yearPublished;
    }

    /**
     * Mutators for year published.
     * @param yearPublished  yearPublished.
     */
    public void setYearPublished(final int yearPublished)
    {
        this.yearPublished = yearPublished;
    }


    /*
     * A method to validate title.
     * @param title title to be validate.
     */
    private static void validateTitle(final String title)
    {
        if (title == null ||
                title.isBlank())
        {
            throw new IllegalArgumentException("Title cannot be empty or null.");
        }
    }

    /*
     * A method to validate author name.
     * @param authorName the name to be validate.
     */
    private static void validateAuthorName(final String authorName)
    {
        if (authorName == null ||
                authorName.isBlank())
        {
            throw new IllegalArgumentException("Author's name can't be null or empty");
        }
    }

    /*
     * A method to validate the year published.
     * @param yearPublished the year to be validate.
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
     * A toString method to return the title, author name and year pushblished in correct format.
     * @return the string.
     */
    @Override
    public String toString()
    {
        return title + " by " + authorName + ", " + yearPublished;
    }
}
