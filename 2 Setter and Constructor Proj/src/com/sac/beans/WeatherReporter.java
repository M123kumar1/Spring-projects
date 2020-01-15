package com.sac.beans;

public class WeatherReporter {
	WeatherAnalyzer weatherAnalyzer;

	public void setWeatherAnalyzer(WeatherAnalyzer weatherAnalyzer) {
		this.weatherAnalyzer = weatherAnalyzer;
	}

	public void report(int zip) {
		double anlyze = weatherAnalyzer.anlyze(zip);
		System.out.println(anlyze);
	}
}
