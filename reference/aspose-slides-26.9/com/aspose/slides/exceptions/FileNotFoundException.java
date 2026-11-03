package com.aspose.slides.exceptions;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.x7n.l6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j3;
import com.aspose.slides.ms.System.p8;

@j3
public class FileNotFoundException extends IOException {
   private String n5;

   public FileNotFoundException() {
      super("Unable to find the specified file.");
   }

   public FileNotFoundException(String message) {
      super(message);
   }

   public FileNotFoundException(String message, Throwable innerException) {
      super(message, innerException);
   }

   public FileNotFoundException(String message, String fileName) {
      super(message);
      this.n5 = fileName;
   }

   public FileNotFoundException(String message, String fileName, Throwable innerException) {
      super(message, innerException);
      this.n5 = fileName;
   }

   public String getFileName() {
      return this.n5;
   }

   @Override
   public String getMessage() {
      return super.getMessage() == null && this.n5 != null
         ? d1.n5(
            l6.u3(), d1.n5(new String[]{"Could not load file or assembly '{0}' or one of", " its dependencies. The system cannot find the", " file specified."}),new Object[]{ this.n5
         })
         : super.getMessage();
   }

   @Override
   public String toString() {
      a5 var1 = new a5("com.aspose.slides.exceptions.FileNotFoundException");
      var1.n5(": {0}",new Object[]{ this.getMessage()});
      if (this.n5 != null && this.n5.length() > 0) {
         var1.n5(p8.n5);
         var1.n5("File name: '{0}'",new Object[]{ this.n5});
      }

      if (this.getCause() != null) {
         var1.n5(" ---> {0}",new Object[]{ this.getCause().getMessage()});
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
