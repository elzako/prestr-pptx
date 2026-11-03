package com.aspose.slides.exceptions;

public class TargetParameterCountException extends ApplicationException {
   public TargetParameterCountException() {
      super("Number of parameters specified does not match the expected number.");
   }

   public TargetParameterCountException(String message) {
      super(message);
   }

   public TargetParameterCountException(String message, Throwable cause) {
      super(message, cause);
   }
}
