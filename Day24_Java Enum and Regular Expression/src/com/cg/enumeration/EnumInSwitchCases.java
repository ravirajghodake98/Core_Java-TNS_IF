package com.cg.enumeration;

enum Bike
{
	Ninja, Ducati, HarleyDavidson, DodgeTomahawk
}

public class EnumInSwitchCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b = Bike.Ninja;
		switch(b)
		{
		case Ducati:
			System.out.println("Ducati is chosen");
			break;
		case Ninja:
			System.out.println("Ninja is chosen");
			break;
		case HarleyDavidson:
			System.out.println("HarleyDavidson is chosen");
			break;
			
		default:
			System.out.println("Invalid name");
		}
	}

}