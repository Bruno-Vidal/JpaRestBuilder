public class RepositoryMapperClass {

    private String modelClass;
    private String colunmIdType;
    private String repositoryName;

    public RepositoryMapperClass(String modelClass, String colunmIdType) {
        this.modelClass = modelClass;
        this.colunmIdType = colunmIdType;
        this.repositoryName = modelClass + "Repository";
    }

    public String getModelClass() {
        return this.modelClass;
    }

    public String getColunmIdType() {
        return this.colunmIdType;
    }

    public String getNameRepository() {
        return this.repositoryName;
    }
}
