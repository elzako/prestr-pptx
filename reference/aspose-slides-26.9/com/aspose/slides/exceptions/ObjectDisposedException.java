package com.aspose.slides.exceptions;

import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p8;

public class ObjectDisposedException extends InvalidOperationException {
   private String n5;

   private ObjectDisposedException() {
      this(null, "Cannot access a disposed object.");
   }

   public ObjectDisposedException(String objectName) {
      this(objectName, "Cannot access a disposed object.");
   }

   public ObjectDisposedException(String message, Throwable cause) {
      super(message, cause);
   }

   public ObjectDisposedException(String objectName, String message) {
      super(message);
      this.n5 = objectName;
   }

   @Override
   public String getMessage() {
      return this.n5 != null && this.n5.length() > 0 ? super.getMessage() + p8.k5() + d1.n5("Object name: '{0}'.", new Object[]{this.n5}) : super.getMessage();
   }

   public String getObjectName() {
      return this.n5 == null ? "" : this.n5;
   }
}
