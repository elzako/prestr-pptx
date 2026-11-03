package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.j3;

@j3
public class MissingManifestResourceException extends SystemException {
   public MissingManifestResourceException() {
      super("The assembly does not contain the resources for the required culture.");
   }

   public MissingManifestResourceException(String message) {
      super(message);
   }

   public MissingManifestResourceException(String message, Exception inner) {
      super(message, inner);
   }
}
