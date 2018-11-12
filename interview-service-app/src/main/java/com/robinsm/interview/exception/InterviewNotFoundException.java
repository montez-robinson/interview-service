package com.robinsm.interview.exception;

/**
 * The Interview not found exception.
 *
 * @author montez.robinson robinsm@live.com
 */
public class InterviewNotFoundException extends Exception {

    /**
     * Instantiates a new Interview not found exception.
     *
     * @param businessMessage the business message
     */
    public InterviewNotFoundException(String businessMessage) {
        super(businessMessage);
    }
}
