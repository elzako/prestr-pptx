package com.aspose.slides.exceptions;

public class TargetInvocationException extends ApplicationException {
   public TargetInvocationException() {
      super("Exception has been thrown by the target of an invocation.");
   }

   public TargetInvocationException(String message) {
      super(message);
   }

   public TargetInvocationException(Throwable cause) {
      super("Exception has been thrown by the target of an invocation.", cause);
   }

   public TargetInvocationException(String message, Throwable cause) {
      super(message, cause);
   }
}
