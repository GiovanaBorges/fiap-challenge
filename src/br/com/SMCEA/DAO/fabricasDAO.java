package br.com.SMCEA.DAO;

import br.com.SMCEA.Fabrica.Fabrica;

import java.sql.*;

public class fabricasDAO implements IfabricasDAO{
    private final Connection connection;

    public fabricasDAO(Connection connection) {
        this.connection = connection;
    }
    @Override
    public Fabrica save(Fabrica fabricas) {
        try{
            String sql = "INSERT INTO t_SMCEA_FABRICA(id_fabrica,T_SMCEA_CALCULADORA_%_TIPO_ENERG_CONSUMIDA_T_SMCEA_CONVERTE_T_SMCEA_TIPO_ENERGIAS_RENOVAVEIS_id_energia_renvovavel,T_SMCEA_CONSUMO_ENERGIA_ELETRICA_T_SMCEA_CONSUMO_ENERGIA_ELETRICA_ID,T_SMCEA_CONSUMO_AGUA_T_SMCEA_CONSUMO_AGUA_ID) VALUES(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, fabricas.getIdFabrica());
            preparedStatement.setInt(2, fabricas.getIdEnergiaRenovavel());
            preparedStatement.setInt(3, fabricas.getIdEnergiaEletrica());
            preparedStatement.setInt(4, fabricas.getIdConsumoAgua());

            preparedStatement.executeUpdate();

            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            resultSet.next();


            preparedStatement.close();
            resultSet.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }

        return fabricas;
    }
}
