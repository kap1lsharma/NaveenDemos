package stepdefinitions;

import io.cucumber.java.en.*;

public class UberBookingSteps {
	
	@Given("User wants to select a car type {string} from uber application")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		System.out.println("Step 1:" +carType);
	   
	}

	@When("User selects car {string} and pick point {string} and drop location {string}")
	public void user_selects_car_and_pick_point_and_drop_location(String carType, String pickUpPointLocation, String DropPointLocation) {
		System.out.println("Step 2:" +carType + " " +pickUpPointLocation + " " +DropPointLocation);

		
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("Step 3");

	}

	@And("Driver ends the journey")
	public void driver_ends_the_journey() {
		System.out.println("Step 4");

	}

	@Then("^User pays (\\d+) USD$")
	public void user_pays_usd(Integer price) {
		System.out.println("Step 5 :" +price	);

	}


}
