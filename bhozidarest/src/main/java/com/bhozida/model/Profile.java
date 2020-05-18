package com.bhozida.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.bhozida.security.model.User;

import lombok.ToString;
@ToString
@Entity
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    @OneToOne(mappedBy="profile")
    private User user;

    //personal information    
    private int yearOfBirth;
    private boolean maritalStatus;
    private int numberOfDirectDependencies;
    private boolean houseOwnership;
    private boolean carOwnership;
    private Double biggestExpense;
    private Double networthInUSD;
    
    //entrepreneur's background
    @Column(columnDefinition = "LONGTEXT")
    private String countryOfResidence; //ZIM, SA, Other SADC, Africa, EU, UK, US, Asia, Other;
    @Column(columnDefinition = "LONGTEXT")
    private String businessType;  //services, manufacturing, agriculcure , all
    @Column(columnDefinition = "LONGTEXT")
    private String entrepreneurHistory; // summary 
    private int entrepreneurStartYear; //1999
    private int employees;
    private int mentors;
    private int mentees;
    private boolean businessRegistered;


    //entrepreneur interests
    @Column(columnDefinition = "LONGTEXT")
    private String businessTypesOfInterest; //partnerships, shareholding, sole entrepreneur
    @Column(columnDefinition = "LONGTEXT")
    private String industriesOfInterest;
    @Column(columnDefinition = "LONGTEXT")
    private String financeSkillsInvestor;
    @Column(columnDefinition = "LONGTEXT")
    private String businessPartnerAgeGroup;
    @Column(columnDefinition = "LONGTEXT")
    private String businessPartnerGenderGroup;

    //education
    private boolean attendedFinancialLiteracyCourses;
    private boolean attendedSalesCoachingCourses;
    @Column(columnDefinition = "LONGTEXT")
    private String bestThreeMotivationalBooks;
    @Column(columnDefinition = "LONGTEXT")
    private String highestQualification; //high school / university degree or none

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getNumberOfDirectDependencies() {
        return numberOfDirectDependencies;
    }

    public void setNumberOfDirectDependencies(int numberOfDirectDependencies) {
        this.numberOfDirectDependencies = numberOfDirectDependencies;
    }

    public Double getBiggestExpense() {
        return biggestExpense;
    }

    public void setBiggestExpense(Double biggestExpense) {
        this.biggestExpense = biggestExpense;
    }

    public Double getNetworthInUSD() {
        return networthInUSD;
    }

    public void setNetworthInUSD(Double networthInUSD) {
        this.networthInUSD = networthInUSD;
    }

    public String getCountryOfResidence() {
        return countryOfResidence;
    }

    public void setCountryOfResidence(String countryOfResidence) {
        this.countryOfResidence = countryOfResidence;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getEntrepreneurHistory() {
        return entrepreneurHistory;
    }

    public void setEntrepreneurHistory(String entrepreneurHistory) {
        this.entrepreneurHistory = entrepreneurHistory;
    }

    public int getEntrepreneurStartYear() {
        return entrepreneurStartYear;
    }

    public void setEntrepreneurStartYear(int entrepreneurStartYear) {
        this.entrepreneurStartYear = entrepreneurStartYear;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public int getMentors() {
        return mentors;
    }

    public void setMentors(int mentors) {
        this.mentors = mentors;
    }

    public int getMentees() {
        return mentees;
    }

    public void setMentees(int mentees) {
        this.mentees = mentees;
    }

    public boolean isBusinessRegistered() {
        return businessRegistered;
    }

    public void setBusinessRegistered(boolean businessRegistered) {
        this.businessRegistered = businessRegistered;
    }

    public String getBusinessTypesOfInterest() {
        return businessTypesOfInterest;
    }

    public void setBusinessTypesOfInterest(String businessTypesOfInterest) {
        this.businessTypesOfInterest = businessTypesOfInterest;
    }

    public String getIndustriesOfInterest() {
        return industriesOfInterest;
    }

    public void setIndustriesOfInterest(String industriesOfInterest) {
        this.industriesOfInterest = industriesOfInterest;
    }

    public String getFinanceSkillsInvestor() {
        return financeSkillsInvestor;
    }

    public void setFinanceSkillsInvestor(String financeSkillsInvestor) {
        this.financeSkillsInvestor = financeSkillsInvestor;
    }

    public String getBusinessPartnerAgeGroup() {
        return businessPartnerAgeGroup;
    }

    public void setBusinessPartnerAgeGroup(String businessPartnerAgeGroup) {
        this.businessPartnerAgeGroup = businessPartnerAgeGroup;
    }

    public String getBusinessPartnerGenderGroup() {
        return businessPartnerGenderGroup;
    }

    public void setBusinessPartnerGenderGroup(String businessPartnerGenderGroup) {
        this.businessPartnerGenderGroup = businessPartnerGenderGroup;
    }

    public boolean isAttendedFinancialLiteracyCourses() {
        return attendedFinancialLiteracyCourses;
    }

    public void setAttendedFinancialLiteracyCourses(boolean attendedFinancialLiteracyCourses) {
        this.attendedFinancialLiteracyCourses = attendedFinancialLiteracyCourses;
    }

    public boolean isAttendedSalesCoachingCourses() {
        return attendedSalesCoachingCourses;
    }

    public void setAttendedSalesCoachingCourses(boolean attendedSalesCoachingCourses) {
        this.attendedSalesCoachingCourses = attendedSalesCoachingCourses;
    }

    public String getBestThreeMotivationalBooks() {
        return bestThreeMotivationalBooks;
    }

    public void setBestThreeMotivationalBooks(String bestThreeMotivationalBooks) {
        this.bestThreeMotivationalBooks = bestThreeMotivationalBooks;
    }

    public String getHighestQualification() {
        return highestQualification;
    }

    public void setHighestQualification(String highestQualification) {
        this.highestQualification = highestQualification;
    }

    public boolean isHouseOwnership() {
        return houseOwnership;
    }

    public void setHouseOwnership(boolean houseOwnership) {
        this.houseOwnership = houseOwnership;
    }

    public boolean isCarOwnership() {
        return carOwnership;
    }

    public void setCarOwnership(boolean carOwnership) {
        this.carOwnership = carOwnership;
    }

    @Override
    public String toString() {
        return "Profile [attendedFinancialLiteracyCourses=" + attendedFinancialLiteracyCourses
                + ", attendedSalesCoachingCourses=" + attendedSalesCoachingCourses + ", bestThreeMotivationalBooks="
                + bestThreeMotivationalBooks + ", biggestExpense=" + biggestExpense + ", businessPartnerAgeGroup="
                + businessPartnerAgeGroup + ", businessPartnerGenderGroup=" + businessPartnerGenderGroup
                + ", businessRegistered=" + businessRegistered + ", businessType=" + businessType
                + ", businessTypesOfInterest=" + businessTypesOfInterest + ", carOwnership=" + carOwnership
                + ", countryOfResidence=" + countryOfResidence + ", employees=" + employees + ", entrepreneurHistory="
                + entrepreneurHistory + ", entrepreneurStartYear=" + entrepreneurStartYear + ", financeSkillsInvestor="
                + financeSkillsInvestor + ", highestQualification=" + highestQualification + ", houseOwnership="
                + houseOwnership + ", id=" + id + ", industriesOfInterest=" + industriesOfInterest + ", maritalStatus="
                + maritalStatus + ", mentees=" + mentees + ", mentors=" + mentors + ", networthInUSD=" + networthInUSD
                + ", numberOfDirectDependencies=" + numberOfDirectDependencies + ", user=" + user + ", yearOfBirth="
                + yearOfBirth + "]";
    }

    
 
    

}