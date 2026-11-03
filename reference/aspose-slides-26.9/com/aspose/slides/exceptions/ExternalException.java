package com.aspose.slides.exceptions;

public class ExternalException extends SystemException {
   public ExternalException() {
      super("External component has thrown an exception.");
      super.setErrorCode(-2147467259);
   }

   public ExternalException(String message) {
      super(message);
      super.setErrorCode(-2147467259);
   }

   public ExternalException(String message, Throwable cause) {
      super(message, cause);
      super.setErrorCode(-2147467259);
   }

   public ExternalException(String message, int errorCode) {
      super(message);
      super.setErrorCode(errorCode);
   }

   public int getErrorCode() {
      return super.getHResult();
   }
}
