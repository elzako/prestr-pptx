package com.aspose.slides.exceptions;

public class OperationCanceledException extends SystemException {
   public OperationCanceledException() {
      super("The operation was canceled.");
   }

   public OperationCanceledException(String message) {
      super(message);
   }

   public OperationCanceledException(String message, Throwable cause) {
      super(message, cause);
   }
}
