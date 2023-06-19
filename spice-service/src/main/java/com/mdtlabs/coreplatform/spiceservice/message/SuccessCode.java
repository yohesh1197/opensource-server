package com.mdtlabs.coreplatform.spiceservice.message;

/**
 * <p>
 * Success code to fetch message from property. Property
 * file(application.property) present in resource folder.
 * </p>
 *
 * @author Vigneshkumar created on Jun 30, 2022
 */
public enum SuccessCode {

    // Assessment
    ASSESSMENT_SAVE(1001), ASSESSMENT_BP_LOG_SAVE(1002), ASSESSMENT_GLUCOSE_LOG_SAVE(1003),

    // BpLog
    BP_LOG_SAVE(1051), GET_BP_LOG_LIST(1052),

    // Device Details
    DEVICE_DETAILS_SAVE(1101),

    // Frequency
    FREQUENCY_SAVE(1151), GET_FREQUENCY(1152),

    //Glucose log
    GLUCOSE_LOG_SAVE(7001), GET_GLUCOSE_LOG_LIST(7002),

    //MedicalReview
    MEDICAL_REVIEW_SAVE(1251), GET_MEDICAL_REVIEW_SUMMARY(1003),
    GET_MEDICAL_REVIEW_LIST(1004), GET_MEDICAL_REVIEW_COUNT(1005),
    GET_MEDICAL_REVIEW_STATIC_DATA(1006), GET_STATIC_DATA(1007),

    //Mental Health
    MENTAL_HEALTH_SAVE(4006), MENTAL_HEALTH_UPDATE(1302), MENTAL_HEALTH_DETAILS(4010),

    // Patient
    PATIENT_SAVE(3001), GET_PATIENT(3002), PATIENT_UPDATE(4005),
    SEARCH_PATIENTS(1354), PATIENT_VISIT_SAVE(3005),
    PATIENT_BASIC_DETAILS(4004), GET_META_DATA(1357), PATIENT_REMOVE(1358),

    // PatientPregnancy
    PATIENT_PREGNANCY_SAVE(1401), GET_PATIENT_PREGNANCY(1402), UPDATE_PATIENT_PREGNANCY(1403),

    // PatientLabTest and LabTest Result
    PATIENT_LAB_TEST_SAVE(1451), GET_PATIENT_LAB_TEST_LIST(1452), PATIENT_LAB_TEST_DELETE(1453),
    REVIEW_PATIENT_LAB_TEST(1454), PATIENT_LAB_TEST_RESULT_SAVE(1455), GOT_PATIENT_LAB_TEST_RESULTS(1456),
    GET_LAB_TEST(1457),

    // Patient Nutrition Lifestyle
    PATIENT_NUTRITION_LIFESTYLE_SAVE(1501), PATIENT_NUTRITION_LIFESTYLE_UPDATE(1502),
    PATIENT_NUTRITION_LIFESTYLE_LIST(1503), PATIENT_NUTRITION_LIFESTYLE_DELETE(1504),
    PATIENT_NUTRITION_LIFESTYLE_UPDATE_VIEW(1505), PATIENT_LIFESTYLE_DETAILS(1506),

    // Patient Tracker
    PATIENT_TRACKER_SAVE(4001), GET_PATIENT_TRACKER(4002),
    CONFIRM_DIAGNOSIS_UPDATE(1553),

    //PatientTreatmentPlan
    TREATMENT_PLAN_SAVE(4008), GET_TREATMENT_PLAN(4009),
    TREATMENT_PLAN_UPDATE(4007),

    // Prescription
    PRESCRIPTION_SAVE(1651), PRESCRIPTION_GET(1652), PRESCRIPTION_HISTORY_GET(1653), PRESCRIPTION_DELETE(1654),
    FILL_PRESCRIPTION_GET(1655), FILL_PRESCRIPTION_UPDATE(1656), REFILL_PRESCRIPTION_GET(1657),

    //Screening Log
    SCREENING_LOG_SAVE(9001), GET_SCREENING_LOG(9002),

    // Symptoms
    GET_SYMPTOMS(5001), SYMPTOM_SAVE(5002),
    // Patient Transfer
    PATIENT_TRANSFER_SAVE(16001), PATIENT_TRANSFER_COUNT(16002), PATIENT_TRANSFER_UPDATE(16003), PATIENT_TRANSFER_VALIDATE(16004), PATIENT_TRANSFER_LIST(16005),

    HEALTH_CHECK(17001),
    RED_RISK_UPDATE(17002),
    APP_VERSION_UPDATE(5011),
    UPDATE_APP_VERSION(2054);

    private final int key;

    SuccessCode(int key) {
        this.key = key;
    }

    public int getKey() {
        return this.key;
    }
}
