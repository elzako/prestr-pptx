package com.aspose.slides.exceptions;

public class EndOfStreamException extends IOException {
   public EndOfStreamException() {
      super("Attempted to read past the end of the stream.");
   }

   public EndOfStreamException(String message) {
      super(message);
   }

   public EndOfStreamException(String message, Throwable cause) {
      super(message, cause);
   }
}
