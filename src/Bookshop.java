import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *  A class for bookshop.
 *
 *  @author Minh Ngoc Ngo
 *  @author Thien Pham
 *
 *  @version 1.0
 */
public class Bookshop
{
    private final Map<String, Novel> map;

    /**
     * A constructor for Bookshop.
     *
     * @param novels  List<Novel>; list of novels.
     */
    public Bookshop(final List<Novel> novels)
    {
        map = new HashMap<>();

        for (final Novel novel : novels)
        {
            map.put(novel.getTitle(), novel);
        }

        Set<String> keySet;
        keySet = map.keySet();

        System.out.println("All titles in the Map:");

        Iterator<String> it;
        it = keySet.iterator();

        while (it.hasNext())
        {
            String key;
            key = it.next();
            System.out.println(key);
        }

        it = keySet.iterator();

        while (it.hasNext())
        {
            String key;
            key = it.next();
            if (key.toLowerCase().contains("the"))
            {
                it.remove();
            }
        }

        keySet = map.keySet();

        List<String> keyList;
        keyList = new ArrayList<>(keySet);

        Collections.sort(keyList);

        System.out.println("\nSorted novels with no 'the':");
        for (String key : keyList)
        {
            System.out.println(map.get(key));
        }
    }
}
