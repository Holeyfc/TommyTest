/**
 * 
 */
package controllers;

import java.util.*;
import Entity.*;

/**
 * @author nhoberg001
 *
 */
public class SearchController {

	/**
	 * 
	 */

	public DatabaseController database;
	public boolean found;
	public String name;
	public ArrayList<University> schoolsClone;

	public SearchController() {
		this.database = new DatabaseController();
	}

	/**
	 * 
	 */
	public void searchResults() {
		for(int i = 0; i < schoolsClone.size(); i++) {
			System.out.println(schoolsClone.get(i).getName());
		}
	}

	/**
	 * 
	 */
	public void searchUniversities(String name, String state, String location, String control, int numOfStudents,
			double percentFemale, double SATVerbal, double satMath, double expenses, double finAid, int numApplicants,
			double perAdmitted, double perEnrolled, int academicScale, int socialScale, int lifeScale) {
		ArrayList<University> schools = database.getListOfUniversities();
		this.schoolsClone = (ArrayList<University>) schools.clone();
		for (int i = 0; i < schools.size(); i++) {
			if (!name.equals(null) && !name.equals("-1") && !name.equals("")) {
				if (schools.get(i).getName().toLowerCase().indexOf(name.toLowerCase()) < 0) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!state.equals(null) && !state.equals("-1") && !state.equals("")) {
				if (schools.get(i).getState().toLowerCase().indexOf(state.toLowerCase()) < 0) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!location.equals(null) && !location.equals("-1") && !location.equals("")) {
				if (schools.get(i).getLocation().toLowerCase().indexOf(location.toLowerCase()) < 0) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!control.equals(null) && !control.equals("-1") && !control.equals("")) {
				if (schools.get(i).getControl().toLowerCase().indexOf(control.toLowerCase()) < 0) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Integer.toString(numOfStudents).equals(null) && !Integer.toString(numOfStudents).equals("-1") && !Integer.toString(numOfStudents).equals("")){
				if (!(-1 < schools.get(i).getNumOfStudents() && schools.get(i).getNumOfStudents() <= numOfStudents)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Double.toString(percentFemale).equals(null) && !Double.toString(percentFemale).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getPercentFemale() && schools.get(i).getPercentFemale() <= percentFemale)) {
					schoolsClone.remove(schools.get(i));
				}
			}

			if (!Double.toString(SATVerbal).equals(null) && !Double.toString(SATVerbal).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getSatVerbal() && schools.get(i).getSatVerbal() <= SATVerbal)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (Double.toString(satMath).equals(null) && !(Double.toString(satMath).equals("-1.0")))
					 {
				if (!(-1.0 < schools.get(i).getSatMath() && schools.get(i).getSatMath() <= satMath)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Double.toString(expenses).equals(null) && !Double.toString(expenses).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getExpenses() && schools.get(i).getExpenses() <= expenses)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Double.toString(finAid).equals(null) && !Double.toString(finAid).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getFinAid() && schools.get(i).getFinAid() <= finAid)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Integer.toString(numApplicants).equals(null) && !Integer.toString(numApplicants).equals("-1"))
					 {
				if (!(-1 < schools.get(i).getNumApplicants() && schools.get(i).getNumApplicants() <= numApplicants)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Double.toString(perAdmitted).equals(null) && !Double.toString(perAdmitted).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getPerAdmitted() && schools.get(i).getPerAdmitted() <= perAdmitted)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Double.toString(perEnrolled).equals(null) && !Double.toString(perEnrolled).equals("-1.0"))
					 {
				if (!(-1.0 < schools.get(i).getPerEnrolled() && schools.get(i).getPerEnrolled() <= perEnrolled)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Integer.toString(academicScale).equals(null) && !Integer.toString(academicScale).equals("-1"))
					 {
				if (!(-1 < schools.get(i).getAcademicScale() && schools.get(i).getAcademicScale() <= academicScale)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Integer.toString(socialScale).equals(null) && !Integer.toString(socialScale).equals("-1"))
					 {
				if (!(-1 < schools.get(i).getSocialScale() && schools.get(i).getSocialScale() <= socialScale)) {
					schoolsClone.remove(schools.get(i));
				}
			}
			if (!Integer.toString(lifeScale).equals(null) && !Integer.toString(lifeScale).equals("-1"))
					 {
				if (!(-1 < schools.get(i).getLifeScale() && schools.get(i).getLifeScale() <= lifeScale)) {
					schoolsClone.remove(schools.get(i));
				}
			}

		}
	}


	/**
	 * 
	 */
	public void getUniversities() {
	}

	/**
	 * @param args
	 */
}
