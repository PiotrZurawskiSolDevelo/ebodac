package org.motechproject.ebodac.utils;


import org.joda.time.DateTime;
import org.motechproject.ebodac.dao.VisitDAO;
import org.motechproject.ebodac.domain.Subject;
import org.motechproject.ebodac.domain.Visit;
import org.motechproject.ebodac.domain.VisitType;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class VisitUtils {

    public static Visit createVisit(Subject subject, VisitType type, DateTime date,
                              DateTime projectedDate, String owner) {
        Visit ret = new Visit();
        ret.setSubject(subject);
        ret.setType(type);
        ret.setDate(date);
        ret.setDateProjected(projectedDate);
        ret.setOwner(owner);

        return ret;
    }

    public static void checkVisitFields(Visit expected, Visit actual) {
        assertEquals(expected.getSubject().getSubjectId(), actual.getSubject().getSubjectId());
        assertEquals(expected.getType(), actual.getType());
        assertEquals(expected.getDate(), actual.getDate());
        assertEquals(expected.getDateProjected(), actual.getDateProjected());
        assertEquals(expected.getOwner(), actual.getOwner());
    }

    public static List<Visit> convertDAOVisitsToVisits(List<VisitDAO> visitsDao) {
        ArrayList<Visit> ret = new ArrayList<Visit>();

        for(VisitDAO visitDao : visitsDao) {
            ret.add(visitDao.toVisit());
        }
        return ret;
    }
}