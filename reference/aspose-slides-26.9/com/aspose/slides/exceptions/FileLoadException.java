package com.aspose.slides.exceptions;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p8;

@j3
public class FileLoadException extends IOException {
   private String n5;

   public FileLoadException() {
      super("Could not load the specified file.");
   }

   public FileLoadException(String message) {
      super(message);
   }

   public FileLoadException(String message, String fileName) {
      super(message);
      this.n5 = fileName;
   }

   public FileLoadException(String message, Throwable inner) {
      super(message, inner);
   }

   public FileLoadException(String message, String fileName, Throwable inner) {
      super(message, inner);
      this.n5 = fileName;
   }

   public String getFileName() {
      return this.n5;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("com.aspose.slides.exceptions.FileLoadException");
      var1.n5(": {0}",new Object[]{ this.getMessage()});
      if (this.n5 != null) {
         var1.n5(" : {0}",new Object[]{ this.n5});
      }

      if (this.getCause() != null) {
         var1.n5(" ----> {0}",new Object[]{ this.getCause().getMessage()});
      }

      if (this.getStackTrace() != null) {
         for (StackTraceElement var5 : this.getStackTrace()) {
            var1.n5(p8.n5);
            var1.n5(var5.toString());
         }
      }

      return var1.toString();
   }
}
