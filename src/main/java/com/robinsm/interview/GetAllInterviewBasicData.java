package com.robinsm.interview;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The type Get all interview basic data.
 *
 * @author montez.robinson robinsm@live.com
 */
public class GetAllInterviewBasicData {

    /**
     * The Interviews.
     */
    final Collection<InterviewBasicData> interviews;

    /**
     * Instantiates a new Get all interview basic data.
     *
     * @param interviews the interviews
     */
    public GetAllInterviewBasicData(Collection<InterviewBasicData> interviews) {
        this.interviews = interviews;
    }

    /**
     * Gets interviews.
     *
     * @return the interviews
     */
    public Collection<InterviewBasicData> getInterviews() {
        return new ArrayList<>(this.interviews);
    }
}
