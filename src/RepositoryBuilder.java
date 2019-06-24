public class RepositoryBuilder implements Builder<RepositoryMapperClass> {


    @Override
    public String builder(RepositoryMapperClass mapper) {
        return "package br.com.original.demo.business.repository;\n" +
                "\n" +
                "import br.com.original.demo.business.model."+mapper.getModelClass()+";\n" +
                "import org.springframework.data.jpa.repository.JpaRepository;\n" +
                "\n" +
                "public interface "+mapper.getNameRepository()+" extends JpaRepository<"+mapper.getModelClass()+","+mapper.getColunmIdType()+"> {\n" +
                "}";
    }
}
