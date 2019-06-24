import java.util.List;

public class ModelMapperClass {

    private String tableName;
    private String modelName;
    private String colunmId;
    private List<String> atributos;
    private String colunmIdType;

    public ModelMapperClass(String tableName, String modelName, String colunmId, List<String> atributos, String colunmIdType) {
        this.tableName = tableName;
        this.modelName = modelName;
        this.colunmId = colunmId;
        this.atributos = atributos;
        this.colunmIdType = colunmIdType;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getColunmId() {
        return this.colunmId;
    }

    public List<String> getAtributos() {
        return this.atributos;
    }

    public String getColunmIdType() {
        return this.colunmIdType;
    }
}
