import java.security.Provider;
import java.security.Provider.Service;
import java.util.List;
import java.util.Map;

public class ServiceConstruction extends Service {

    public ServiceConstruction(Provider provider, String type, String algorithm, String className, List<String> aliases,
            Map<String, String> attributes) {
        super(provider, type, algorithm, className, aliases, attributes);
        //TODO Auto-generated constructor stub
    }
    
}
