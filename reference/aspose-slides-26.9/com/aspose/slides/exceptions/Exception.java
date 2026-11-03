package com.aspose.slides.exceptions;

import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.ms.System.p8;
import com.aspose.slides.ms.System.y8;

public class Exception extends RuntimeException {
   int a;
   private static final String b = "Exception of type System.Exception was thrown.";

   public Exception() {
      super("Exception of type System.Exception was thrown.");
   }

   public Exception(String message) {
      super(message);
   }

   public Exception(String message, Throwable cause) {
      super(message, cause);
   }

   public Exception(Throwable cause) {
      super(cause);
   }

   public Throwable getInnerException() {
      return this.getCause();
   }

   public y8 getType() {
      return k5.n5(this.getClass());
   }

   protected void setErrorCode(int hr) {
      this.setHResult(hr);
   }

   protected int getHResult() {
      return this.a;
   }

   protected void setHResult(int _HResult) {
      this.a = _HResult;
   }

   @Override
   public String toString() {
      String var1 = this.getMessage();
      StringBuilder var2;
      if (var1 != null && var1.length() > 0) {
         var2 = new StringBuilder(this.getClass().toString() + ": " + var1);
      } else {
         var2 = new StringBuilder(this.getClass().toString());
      }

      if (this.getCause() != null) {
         var2.append(" ---> ").append(this.getCause().toString()).append(p8.n5).append("   ").append("--- End of inner exception stack trace ---");
      }

      if (this.getStackTrace() != null && this.getStackTrace().length > 0) {
         for (StackTraceElement var6 : this.getStackTrace()) {
            var2.append(p8.n5).append(var6.toString());
         }
      }

      return var2.toString();
   }
}
