package org.motechproject.ebodac.repository;

import org.joda.time.LocalDate;
import org.motechproject.commons.api.Range;
import org.motechproject.ebodac.domain.Visit;
import org.motechproject.ebodac.domain.VisitType;
import org.motechproject.mds.annotations.Lookup;
import org.motechproject.mds.annotations.LookupField;
import org.motechproject.mds.service.MotechDataService;
import org.motechproject.mds.util.Constants;

import java.util.List;

/**
 * Interface for repository that persists simple records and allows CRUD.
 * MotechDataService base class will provide the implementation of this class as well
 * as methods for adding, deleting, saving and finding all instances.  In this class we
 * define and custom lookups we may need.
 */
public interface VisitDataService extends MotechDataService<Visit> {

    @Lookup
    List<Visit> findVisitsByActualDate(@LookupField(name = "date") LocalDate date);

    @Lookup
    List<Visit> findVisitsByDateOfFollowupVisit(@LookupField(name = "date") LocalDate date);

    @Lookup
    List<Visit> findVisitsByDateOfFollowupVisitTypeAndAddress(@LookupField(name = "date") LocalDate date,
                                                              @LookupField(name = "type") VisitType visitType,
                                                              @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup
    List<Visit> findVisitsByActualDateAndType(@LookupField(name = "date") LocalDate date,
                                              @LookupField(name = "type") VisitType visitType);

    @Lookup
    List<Visit> findVisitsByActualDateRange(@LookupField(name = "date") Range<LocalDate> dateRange);

    @Lookup
    List<Visit> findVisitsByDateRangeOfFollowupVisit(@LookupField(name = "date") Range<LocalDate> dateRange);

    @Lookup
    List<Visit> findVisitsByDateRangeOfFollowupVisitTypeAndAddress(@LookupField(name = "date") Range<LocalDate> dateRange,
                                                                   @LookupField(name = "type") VisitType visitType,
                                                                   @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup
    List<Visit> findVisitsByActualDateRangeAndType(@LookupField(name = "date") Range<LocalDate> dateRange,
                                                   @LookupField(name = "type") VisitType visitType);

    @Lookup
    List<Visit> findVisitsByType(@LookupField(name = "type") VisitType visitType);

    @Lookup
    List<Visit> findVisitsByTypeAndAddress(@LookupField(name = "type") VisitType visitType,
                                           @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Id")
    List<Visit> findVisitsBySubjectId(@LookupField(name = "subject.subjectId",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String subjectId);

    @Lookup(name = "Find Visits By Participant Name")
    List<Visit> findVisitsBySubjectName(@LookupField(name = "subject.name",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String name);

    @Lookup(name = "Find Visits By Participant Community")
    List<Visit> findVisitsBySubjectCommunity(@LookupField(name = "subject.community",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String community);

    @Lookup(name = "Find Visits By Participant Address")
    List<Visit> findVisitsBySubjectAddress(@LookupField(name = "subject.address",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String address);

    @Lookup(name = "Find Visits By Participant Name Type And Address")
    List<Visit> findVisitsBySubjectNameTypeAndAddress(@LookupField(name = "subject.name",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String name,
                                                      @LookupField(name = "type") VisitType visitType,
                                                      @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Community Type And Address")
    List<Visit> findVisitsBySubjectCommunityTypeAndAddress(@LookupField(name = "subject.community",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String community,
                                                           @LookupField(name = "type") VisitType visitType,
                                                           @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Address And Type")
    List<Visit> findVisitsBySubjectAddressAndType(@LookupField(name = "subject.address",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String address, @LookupField(name = "type") VisitType visitType);

    @Lookup(name = "Find Visits By Participant Primer Vaccination Date")
    List<Visit> findVisitsBySubjectPrimerVaccinationDate(@LookupField(name = "subject.primerVaccinationDate") LocalDate primerVaccinationDate);

    @Lookup(name = "Find Visits By Participant Primer Vaccination Date Type And Address")
    List<Visit> findVisitsBySubjectPrimerVaccinationDateTypeAndAddress(@LookupField(name = "subject.primerVaccinationDate") LocalDate primerVaccinationDate,
                                                                       @LookupField(name = "type") VisitType visitType,
                                                                       @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Primer Vaccination Date Range")
    List<Visit> findVisitsBySubjectPrimerVaccinationDateRange(@LookupField(name = "subject.primerVaccinationDate")  Range<LocalDate> primerVaccinationDateRange);

    @Lookup(name = "Find Visits By Participant Primer Vaccination Date Range Type And Address")
    List<Visit> findVisitsBySubjectPrimerVaccinationDateRangeTypeAndAddress(@LookupField(name = "subject.primerVaccinationDate") Range<LocalDate> primerVaccinationDateRange,
                                                                            @LookupField(name = "type") VisitType visitType,
                                                                            @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Booster Vaccination Date")
    List<Visit> findVisitsBySubjectBoosterVaccinationDate(@LookupField(name = "subject.boosterVaccinationDate") LocalDate boosterVaccinationDate);

    @Lookup(name = "Find Visits By Participant Booster Vaccination Date Type And Address")
    List<Visit> findVisitsBySubjectBoosterVaccinationDateTypeAndAddress(@LookupField(name = "subject.boosterVaccinationDate") LocalDate boosterVaccinationDate,
                                                                        @LookupField(name = "type") VisitType visitType,
                                                                        @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup(name = "Find Visits By Participant Booster Vaccination Date Range")
    List<Visit> findVisitsBySubjectBoosterVaccinationDateRange(@LookupField(name = "subject.boosterVaccinationDate")  Range<LocalDate> boosterVaccinationDateRange);

    @Lookup(name = "Find Visits By Participant Booster Vaccination Date Range Type And Address")
    List<Visit> findVisitsBySubjectBoosterVaccinationDateRangeTypeAndAddress(@LookupField(name = "subject.boosterVaccinationDate") Range<LocalDate> boosterVaccinationDateRange,
                                                                             @LookupField(name = "type") VisitType visitType,
                                                                             @LookupField(name = "subject.address", customOperator = Constants.Operators.NEQ) String address);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDate(@LookupField(name = "motechProjectedDate") LocalDate motechProjectedDate);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateAndType(@LookupField(name = "motechProjectedDate") LocalDate motechProjectedDate,
                                                    @LookupField(name = "type") VisitType visitType);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateRange(@LookupField(name = "motechProjectedDate") Range<LocalDate> dateRange);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateRangeAndType(@LookupField(name = "motechProjectedDate") Range<LocalDate> motechProjectedDateRange,
                                                         @LookupField(name = "type") VisitType visitType);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateLess(@LookupField(name = "motechProjectedDate", customOperator = Constants.Operators.LT) LocalDate motechProjectedDate,
                                                 @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup(name = "Find Visits By Participant Name Less")
    List<Visit> findVisitsBySubjectNameLess(@LookupField(name = "subject.name",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String name,
                                            @LookupField(name = "motechProjectedDate", customOperator = Constants.Operators.LT) LocalDate motechProjectedDate,
                                            @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup(name = "Find Visits By Participant Community Less")
    List<Visit> findVisitsBySubjectCommunityLess(@LookupField(name = "subject.community",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String community,
                                                 @LookupField(name = "motechProjectedDate", customOperator = Constants.Operators.LT) LocalDate motechProjectedDate,
                                                 @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup(name = "Find Visits By Participant Address Less")
    List<Visit> findVisitsBySubjectAddressLess(@LookupField(name = "subject.address",
            customOperator = Constants.Operators.MATCHES_CASE_INSENSITIVE) String address,
                                               @LookupField(name = "motechProjectedDate", customOperator = Constants.Operators.LT) LocalDate motechProjectedDate,
                                               @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateEq(@LookupField(name = "motechProjectedDate") LocalDate motechProjectedDate,
                                               @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateAndTypeEq(@LookupField(name = "motechProjectedDate") LocalDate motechProjectedDate,
                                                      @LookupField(name = "type") VisitType visitType,
                                                      @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateRangeEq(@LookupField(name = "motechProjectedDate") Range<LocalDate> dateRange,
                                                    @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);

    @Lookup
    List<Visit> findVisitsByPlannedVisitDateRangeAndTypeEq(@LookupField(name = "motechProjectedDate") Range<LocalDate> motechProjectedDateRange,
                                                           @LookupField(name = "type") VisitType visitType,
                                                           @LookupField(name = "date", customOperator = Constants.Operators.EQ) LocalDate date);
}
