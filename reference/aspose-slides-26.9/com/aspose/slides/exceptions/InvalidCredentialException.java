package com.aspose.slides.exceptions;

public class InvalidCredentialException extends AuthenticationException {
   public InvalidCredentialException() {
      super("Invalid credentials exception.");
   }

   public InvalidCredentialException(String message) {
      super(message);
   }

   public InvalidCredentialException(String message, java.lang.Exception innerException) {
      super(message, innerException);
   }
}
