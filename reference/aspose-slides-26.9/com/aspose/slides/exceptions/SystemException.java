package com.aspose.slides.exceptions;

public class SystemException extends Exception {
   public SystemException() {
      super("System error.");
      super.setErrorCode(-2146233087);
   }

   public SystemException(String message) {
      super(message);
      super.setErrorCode(-2146233087);
   }

   public SystemException(String message, Throwable cause) {
      super(message, cause);
      super.setErrorCode(-2146233087);
   }

   public SystemException(Throwable cause) {
      super(cause);
      super.setErrorCode(-2146233087);
   }
}
