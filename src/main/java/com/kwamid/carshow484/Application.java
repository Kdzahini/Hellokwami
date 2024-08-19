package com.kwamid.carshow484;

import com.kwamid.carshow484.entity.Car;
import com.kwamid.carshow484.repository.CarRepository;
import com.kwamid.carshow484.repository.OwnerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private CarRepository carRepository;

	@Autowired
	private OwnerRepository ownerRepository;

	private Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Car car1 = Car.builder()
				.make("Ford")
				.model("F150")
				.year(1992)
				.vin("euryudgu233fhbckd58")
				.mileage(150000.456)
				.build();
		Car car2 = Car.builder()
				.make("BMW")
				.model("F200")
				.year(2000)
				.vin("ehr375793eurjfjf90099")
				.mileage(1457996.678)
				.build();
		Car car3 = Car.builder()
				.make("Toyota")
				.model("Camry")
				.year(2010)
				.vin("ehr375793eurjf678")
				.mileage(145799.678)
				.build();
		carRepository.saveAll(List.of(car1, car2, car3));
		carRepository.findAll().forEach(x-> logger.info(x.toString()));


	}
}
