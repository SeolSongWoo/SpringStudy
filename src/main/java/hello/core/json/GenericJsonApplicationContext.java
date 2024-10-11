package hello.core.json;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.Resource;

public class GenericJsonApplicationContext extends GenericApplicationContext {
    private final JsonBeanDefinitionReader reader = new JsonBeanDefinitionReader(this);

    public GenericJsonApplicationContext(Resource resource) {
        this.load(resource);
        this.refresh();
    }
    public void load(Resource resource) {
        this.reader.loadBeanDefinitions(resource);
    }


}
