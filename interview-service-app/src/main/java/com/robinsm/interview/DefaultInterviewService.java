package com.robinsm.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.robinsm.interview.exception.InterviewNotFoundException;

/**
 * The default implementation of the interview service.
 *
 * @author montez.robinson robinsm@live.com
 */
public class DefaultInterviewService implements InterviewService {

    final Map<String, InterviewData> interviews = new HashMap<>();

    @Override
    public GetAllInterviewBasicData getAll() {
        return new GetAllInterviewBasicData(new ArrayList<>(interviews.values()));
    }

    @Override
    public InterviewData create(CreateInterviewRequest createInterviewRequest) {
        interviews.put(createInterviewRequest.getInterviewId(), createInterviewRequest);
        return createInterviewRequest;
    }

    @Override
    public InterviewBasicData getOne(InterviewIdData interviewIdData) throws InterviewNotFoundException {
        final InterviewData found = interviews.get(interviewIdData.getInterviewId());
        if (null == found) {
            throw new InterviewNotFoundException(String.format(
                    "The interview identifier '%s' does not exist",
                    interviewIdData.getInterviewId()));
        }
        return interviews.get(interviewIdData.getInterviewId());
    }

    @Override
    public void delete(InterviewIdData interviewIdData) throws InterviewNotFoundException {
        interviews.remove(interviewIdData.getInterviewId());
    }

    @Override
    public InterviewData update(InterviewData interviewData) throws InterviewNotFoundException {
        final InterviewData found = interviews.get(interviewData.getInterviewId());
        if (null == found) {
            throw new InterviewNotFoundException(String.format(
                    "The interview identifier '%s' does not exist",
                    interviewData.getInterviewId()));
        }
        interviews.remove(found.getInterviewId(), found);
        interviews.put(interviewData.getInterviewId(), interviewData);
        return interviewData;
    }
}
