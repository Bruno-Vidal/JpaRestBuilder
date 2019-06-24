import java.util.List;

public class ModelBuilder {
    public String builder(ModelMapperClass modelMapperClass) {
        return "package br.com.original.demo.business.model;\n" +
                "\n" +
                "import lombok.Data;\n" +
                "\n" +
                "import javax.persistence.Column;\n" +
                "import javax.persistence.Entity;\n" +
                "import javax.persistence.Id;\n" +
                "import javax.persistence.Table;\n" +
                "\n" +
                "@Entity\n" +
                "@Table(name = \""+modelMapperClass.getTableName()+"\")\n" +
                "@Data\n" +
                "public class "+modelMapperClass.getModelName()+" extends AbstracAuditEntity {\n" +
                "\n" +
                "    @Id\n" +
                "    @Column(name = \""+modelMapperClass.getColunmId()+"\")\n" +
                "    private "+modelMapperClass.getColunmIdType()+" id;\n" +
                builderAttrToColunm(modelMapperClass.getAtributos()) +
                "\n}";
    }

    private String builderAttrToColunm(List<String> atributos) {
        StringBuilder sb = new StringBuilder();

        atributos.forEach((atributo) -> {
            sb.append( "\n" +
                            "@Column(name = \""+atributo+"\")\n" +
                            "private Object " + atributo.toLowerCase() +";\n");
        });

        return sb.toString();
    }
}
