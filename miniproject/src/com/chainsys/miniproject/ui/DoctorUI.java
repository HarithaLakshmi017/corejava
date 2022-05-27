package com.chainsys.miniproject.ui;


import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.chainsys.miniproject.commonutil.InvalidInputDataException;
import com.chainsys.miniproject.commonutil.Validator;
import com.chainsys.miniproject.dao.Doctordao;
import com.chainsys.miniproject.pojo.Doctor;

public class DoctorUI {
	public static void addNewDoctor() {
		Scanner sc = new Scanner(System.in);
		Doctor newdoc = new Doctor();
		System.out.println("Enter Doctor Id: ");
		String id =sc.nextLine();
		newdoc.setDoc_id(Integer.parseInt(id));
		System.out.println("Enter Doctor Name: ");
		newdoc.setDoc_name(sc.nextLine());
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		newdoc.setDob(newDate);
		System.out.println("Enter Specilyst: ");
		newdoc.setSpeciality(sc.nextLine());
		System.out.println("Enter City: ");
		newdoc.setDoc_city(sc.nextLine());
		System.out.println("Enter Phone_Number: ");
		newdoc.setPhone(sc.nextLong());			
		System.out.println("Enter Standard_Fees: ");
		newdoc.setStandard_fees(sc.nextFloat());
		int result = Doctordao.insertDoctor(newdoc);
		System.out.println(result);
	}

		public static void updateDoctor() {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
				Doctor newdoc = new Doctor();
				System.out.println("Enter Doctor_Id :");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(Integer.parseInt(id));
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Doctor doc = Doctordao.getDoctorById(docId);
				if (doc == null) {
					System.out.println("Doctor Doesn't Exist For Id " + docId);
					return;
				}
				newdoc.setDoc_id(docId);
				System.out.println("Enter Update Name :");
				String name = sc.nextLine();
				try {
					Validator.checkStringOnly(name);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setDoc_name(name);
				newdoc.setDoc_name(name);
				Calendar c1 = Calendar.getInstance();
				java.util.Date newDate = new java.util.Date();
				newdoc.setDob(newDate);
				System.out.println("Enter Update Speciality :");
				String sp = sc.nextLine();
				try {
					Validator.checkStringOnly(sp);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setSpeciality(sp);
				// newdoc.setSpeciality(sc.nextLine());
				System.out.println("Enter Update City :");
				String cy = sc.nextLine();
				try {
					Validator.checkStringOnly(cy);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setDoc_city(cy);
				System.out.println("Enter Update Phone_Number");
				newdoc.setPhone(sc.nextLong());
				System.out.println("Enter Update Standard_Fees :");
				float fees = sc.nextFloat();
				try {
					Validator.CheckSalary(fees);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				newdoc.setStandard_fees(fees);
				int result = Doctordao.updateDoctor(newdoc);
				System.out.println(result);
			} finally {
				sc.close();
			}
		}

	
		public static void deleteDoctor() {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
				Doctor newdoc = new Doctor();
				System.out.println("Enter Doctor_Id :");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(Integer.parseInt(id));
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Doctor doc = Doctordao.getDoctorById(docId);

				if (doc == null) {
					System.out.println("Doctor Doesn't Exist For Id " + docId);
					return;
				}
				newdoc.setDoc_id(docId);
				int result = Doctordao.deleteDoctor(Integer.parseInt(id));
				System.out.println(result);
			} finally {
				sc.close();
			}
		}

		public static void getDoctorById() {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
				Doctor newdoc = new Doctor();
				System.out.println("Enter Doctor_Id :");
				String id = sc.nextLine();
				try {
					Validator.checkStringForParseInt(id);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				int docId = Integer.parseInt(id);
				newdoc.setDoc_id(Integer.parseInt(id));
				try {
					Validator.CheckNumberForGreaterThanZero(docId);
				} catch (InvalidInputDataException err) {
					err.printStackTrace();
					return;
				}
				Doctor doc = Doctordao.getDoctorById(docId);
				if (doc == null) {
					System.out.println("Doctor Doesn't Exist For Id " + docId);
					return;
				}
				newdoc.setDoc_id(docId);
				Doctor result = Doctordao.getDoctorById(Integer.parseInt(id));
				System.out.println(result.getDoc_id() + " " + result.getDoc_name() + " " + result.getDob() + " "
						+ result.getSpeciality() + " " + result.getDoc_city() + " " + result.getPhone() + " "
						+ result.getStandard_fees());
			} finally {
				sc.close();
			}
		}

		public static void getAllDoctorDetails() {
			List<Doctor> allDoctor = Doctordao.getAllDoctors();
			Iterator<Doctor> drIterator = allDoctor.iterator();
			while (drIterator.hasNext()) {
				Doctor dr = drIterator.next();
				System.out.println(dr.getDoc_id() + " " + dr.getDoc_name() + " " + dr.getDob() + " " + dr.getSpeciality()
						+ " " + dr.getDoc_city() + " " + dr.getPhone() + " " + dr.getStandard_fees());
			}
		}
	}