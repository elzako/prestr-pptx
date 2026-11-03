package com.aspose.slides.exceptions;

public class ArrayTypeMismatchException extends SystemException {
   public ArrayTypeMismatchException() {
      super("Attempted to access an element as a type incompatible with the array.");
   }

   public ArrayTypeMismatchException(String message) {
      super(message);
   }

   public ArrayTypeMismatchException(String message, Throwable innerException) {
      super(message, innerException);
   }
}
