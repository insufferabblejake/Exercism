// Package weather does some stuff with the weather.
package weather

// CurrentCondition represents the current condition as a string.
var CurrentCondition string

// CurrentLocation represents the location as a string.
var CurrentLocation string

// Forecast takes city, condition as string parameters and returns a string that
// represents a forecast.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
