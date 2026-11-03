package com.aspose.slides.exceptions;

import com.aspose.slides.internal.h3d.c4;
import com.aspose.slides.internal.h3d.s3;
import com.aspose.slides.internal.m6n.l6;

public final class IdentityNotMappedException extends SystemException {
   private l6 n5;

   public IdentityNotMappedException() {
      super("Couldn't translate some identities.");
   }

   public IdentityNotMappedException(String message) {
      super(message);
   }

   public IdentityNotMappedException(String message, java.lang.Exception inner) {
      super(message, inner);
   }

   public l6 getUnmappedIdentities() {
      if (this.n5 == null) {
         this.n5 = new l6();
      }

      return this.n5;
   }

   public void getObjectData(c4 serializationInfo, s3 streamingContext) {
      throw new NotImplementedException();
   }
}
