package prat.dam.visita.infraestructura;

import prat.dam.visita.domini.Visita;
import prat.dam.visita.domini.VisitaRepository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class JdbcVisitaRepository implements VisitaRepository {

    private static final String URL = "jdbc:postgresql://localhost:5432/c2526_m0486_ra2";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    private static final String INSERT_SQL =
            "INSERT INTO visitamedica (nompacient, nommetge, data, diagnostic) VALUES (?, ?, ?, ?)";
    private static final String SELECT_ALL_SQL = "SELECT * FROM visitamedica";
    private static final String SELECT_BY_ID_SQL = "SELECT * FROM visitamedica WHERE idvisita = ?";
    private static final String UPDATE_SQL =
            "UPDATE visitamedica SET nompacient = ?, nommetge = ?, data = ?, diagnostic = ? WHERE idvisita = ?";
    private static final String DELETE_SQL = "DELETE FROM visitamedica WHERE idvisita = ?";

    @Override
    public void crear(Visita visita) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(INSERT_SQL)) {
            stmt.setString(1, visita.getNomPacient());
            stmt.setString(2, visita.getNomMetge());
            stmt.setDate(3, Date.valueOf(visita.getData()));
            stmt.setString(4, visita.getDiagnostic());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al crear visita: " + e.getMessage(), e);
        }
    }

    @Override
    public List<Visita> listarTodas() {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_ALL_SQL);
             ResultSet rs = stmt.executeQuery()) {

            List<Visita> visitas = new ArrayList<>();
            while (rs.next()) {
                visitas.add(mapToVisita(rs));
            }
            return visitas;
        } catch (SQLException e) {
            throw new RuntimeException("Error al mostrar visitas: " + e.getMessage(), e);
        }
    }

    @Override
    public Optional<Visita> buscarPorId(int id) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(SELECT_BY_ID_SQL)) {
            stmt.setInt(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return Optional.of(mapToVisita(rs));
                }
                return Optional.empty();
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean actualizar(Visita visita) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(UPDATE_SQL)) {
            stmt.setString(1, visita.getNomPacient());
            stmt.setString(2, visita.getNomMetge());
            stmt.setDate(3, Date.valueOf(visita.getData()));
            stmt.setString(4, visita.getDiagnostic());
            stmt.setInt(5, visita.getIdVisita());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Error al actualizar: " + e.getMessage(), e);
        }
    }

    @Override
    public boolean eliminar(int id) {
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(DELETE_SQL)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar: " + e.getMessage(), e);
        }
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    private Visita mapToVisita(ResultSet rs) throws SQLException {
        return new Visita(
                rs.getInt("idvisita"),
                rs.getString("nompacient"),
                rs.getString("nommetge"),
                rs.getDate("data").toLocalDate(),
                rs.getString("diagnostic")
        );
    }
}
