package hello.core.json;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.support.AbstractBeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.NamedThreadLocal;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

public class JsonBeanDefinitionReader extends AbstractBeanDefinitionReader {
    private final ThreadLocal<Set<EncodedResource>> resourcesCurrentlyBeingLoaded;

    public JsonBeanDefinitionReader(BeanDefinitionRegistry registry) {
        super(registry);
        this.resourcesCurrentlyBeingLoaded = new NamedThreadLocal<Set<EncodedResource>>("JSON bean definition resources currently being loaded") {
            protected Set<EncodedResource> initialValue() { return new HashSet<>(4);
            }
        };
    }

    @Override
    public int loadBeanDefinitions(Resource resource) throws BeanDefinitionStoreException {
        //return this.loadBeanDefinitions(new EncodedResource(resource));
        return 5;
    }
}
