import br.com.SMCEA.Fabrica.Fabrica;
import br.com.SMCEA.Metas.ValidaMetas;

import java.sql.Connection;
import java.sql.SQLException;

public class Main_SMCEA {
    public static void main(String[] args) throws SQLException {

        Fabrica fab1 = new Fabrica(01);



        fab1.setvalorConsumoAgua(200);
        fab1.setValorConsumoEletricidade(200);

        fab1.exibeFichaTecnica();

        ValidaMetas testMetas = new ValidaMetas(01,fab1);
        System.out.println(testMetas.validaMeta1());

    }
}
