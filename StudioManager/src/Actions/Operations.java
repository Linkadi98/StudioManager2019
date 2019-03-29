package Actions;

import Model.Object;

public interface Operations {
    void add(Object object, String sql);
    void update(Object object, String sql);
    void delete(Object object, String sql);
    boolean isExcisted(Object object, String sql);
}
