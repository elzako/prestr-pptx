package com.aspose.slides.exceptions;

import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.ms.System.j3;

@j3
public class SerializationException extends SystemException {
   public SerializationException() {
      super("An error occurred during (de)serialization");
   }

   public SerializationException(String message) {
      super(message);
   }

   public SerializationException(String message, Exception innerException) {
      super(message, innerException);
   }

   protected SerializationException(c4 info, s3 context) {
      throw new NotImplementedException();
   }
}
