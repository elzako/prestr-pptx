package com.aspose.slides.exceptions;

public class TimeoutException extends SystemException {
   public TimeoutException() {
      super("timeout");
      super.setErrorCode(-2146233083);
   }

   public TimeoutException(String message) {
      super(message);
      super.setErrorCode(-2146233083);
   }

   public TimeoutException(String message, Exception innerException) {
      super(message, innerException);
      super.setErrorCode(-2146233083);
   }
}
