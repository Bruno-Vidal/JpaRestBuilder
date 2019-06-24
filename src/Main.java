import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Scanner ler = new Scanner(System.in);
        String nameClass;
        String endpoint;
        String tableName;
        String colunmId;
        String colunmIdType;
        String auxAtributo ;
        List<String> atributos = new ArrayList<>();

        System.out.println("Digite o nome da tabela");
        tableName = ler.next();

        System.out.println("Digite o nome da Classe de modelo");
        nameClass = ler.next();

        System.out.println("Digite a Coluna do identificador");
        colunmId = ler.next();

        System.out.println("Digite o tipo da Coluna do identificador");
        colunmIdType = ler.next();

        while (true) {
            System.out.println("Digite a proxima coluna da tabela ou 0 para finalizar a lista de atributos");
            auxAtributo = ler.next();
            if (auxAtributo.equals("0")) break;
            atributos.add(auxAtributo);
        }


        System.out.println("Digite o endereco do endpoint");
        endpoint = ler.next();

        System.out.println("\n\n------------CONTROLLER--------------\n\n");

        System.out.println(new ControllerBuilder().builder(new ControllerMapperClass(nameClass,endpoint)));

        System.out.println("\n\n---------------MODEL----------------\n\n");

        System.out.println(new ModelBuilder().builder(new ModelMapperClass(tableName,nameClass,colunmId,atributos, colunmIdType)));

        System.out.println("\n\n-------------REPOSITORY----------------\n\n");

        System.out.println(new RepositoryBuilder().builder(new RepositoryMapperClass(nameClass,colunmIdType)));


    }
}
