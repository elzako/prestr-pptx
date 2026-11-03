package com.aspose.slides.internal.g7;

public class a8 {
   public static String n5(n2 var0) {
      com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();
      var1.n5("Font Name: {0}", var0.n5());
      var1.n5("Font Type: {0}", com.aspose.slides.ms.System.s3.n5(b1.class, var0.l6()));
      if (var0.k5() != null && var0.k5().length > 0) {
         var1.n5("Font File Definitions:");

         for (p9 var5 : var0.k5()) {
            var1.n5("File Name: {0}", var5.n5());
            var1.n5("File Extension: {0}", var5.l6());
            var1.n5("Stream Source Type: {0}", com.aspose.slides.internal.v6g.k5.l6(var5.k5(), x0.class) ? "file" : "byte array");
         }
      } else {
         var1.n5("Font File Definitions: not present");
      }

      return var1.toString();
   }
}
