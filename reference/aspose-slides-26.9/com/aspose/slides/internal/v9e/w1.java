package com.aspose.slides.internal.v9e;

public class w1 {
   protected e5 n5;

   public final e5 n5() {
      return this.n5;
   }

   public final e5 n5(String var1, String var2, String var3) {
      this.n5 = new e5(var1, var2, var3, this.n5);
      return this.n5;
   }

   public final String n5(String var1) {
      for (e5 var2 = this.n5; var2 != null; var2 = var2.u3()) {
         if (com.aspose.slides.ms.System.Xml.v8.n5(var2.n5(), var1)) {
            return var2.l6();
         }
      }

      return null;
   }

   public final String l6(String var1) {
      for (e5 var2 = this.n5; var2 != null; var2 = var2.u3()) {
         if (com.aspose.slides.ms.System.d1.a6(var2.n5(), var1)) {
            return var2.l6();
         }
      }

      return null;
   }
}
