package modules.weather.domain.repository;

import modules.weather.domain.report.WeatherReport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherReportRepository extends JpaRepository<WeatherReport, Long> {

    String provideIdentity();

}
