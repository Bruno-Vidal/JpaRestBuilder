public class ControllerMapperClass {

    private String modelNameClass;
    private String nomeController;
    private String nomeRepository;
    private String endpoint;

    public ControllerMapperClass(String modelNameClass, String endpoint) {
        this.modelNameClass = modelNameClass;
        this.nomeController = modelNameClass + "Controller";
        this.nomeRepository = modelNameClass + "Repository";
        this.endpoint = endpoint;
    }

    public String getModelNameClass() {
        return modelNameClass;
    }

    public String getNomeController() {
        return nomeController;
    }

    public String getNomeRepository() {
        return nomeRepository;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
