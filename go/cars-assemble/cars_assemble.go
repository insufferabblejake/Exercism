package cars

// CalculateWorkingCarsPerHour calculates how many working cars are
// produced by the assembly line every hour.
func CalculateWorkingCarsPerHour(productionRate int, successRate float64) float64 {
	prodRF := float64(productionRate)
	return (prodRF * successRate) / 100.0
}

// CalculateWorkingCarsPerMinute calculates how many working cars are
// produced by the assembly line every minute.
func CalculateWorkingCarsPerMinute(productionRate int, successRate float64) int {
	workCarsHour := int(CalculateWorkingCarsPerHour(productionRate, successRate))
	return workCarsHour / 60
}

// CalculateCost works out the cost of producing the given number of cars.
func CalculateCost(carsCount int) uint {
	numTensCars := carsCount / 10
	carsLeft := carsCount - (numTensCars * 10)
	return uint(numTensCars*95000 + carsLeft*10000)
}
