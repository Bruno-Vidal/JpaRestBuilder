public class ControllerBuilder {

    public String builder(ControllerMapperClass controllerMapperClass){
        return "package br.com.original.demo.resource;\n" +
                "\n" +
                "import br.com.original.demo.business.model."+ controllerMapperClass.getModelNameClass()+";\n" +
                "import br.com.original.demo.business.repository."+controllerMapperClass.getNomeRepository()+";\n" +
                "import org.springframework.web.bind.annotation.GetMapping;\n" +
                "import org.springframework.web.bind.annotation.RequestMapping;\n" +
                "import org.springframework.web.bind.annotation.RestController;\n" +
                "\n" +
                "import java.util.List;\n" +
                "\n" +
                "@RestController\n" +
                "@RequestMapping(\""+controllerMapperClass.getEndpoint()+"\")\n" +
                "public class "+controllerMapperClass.getNomeController()+" {\n" +
                "\n" +
                "    private "+controllerMapperClass.getNomeRepository()+" repository;\n" +
                "\n" +
                "\n" +
                "    public "+controllerMapperClass.getNomeController()+"("+controllerMapperClass.getNomeRepository()+" repository) {\n" +
                "        this.repository = repository;\n" +
                "    }\n" +
                "\n" +
                "    @GetMapping\n" +
                "    public List<"+controllerMapperClass.getModelNameClass()+"> buscarTodos() {\n" +
                "        return repository.findAll();\n" +
                "    }\n" +
                "}"
                ;
    }
}
