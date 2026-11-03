package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w9n extends b3 {
   private String n5;
   private x2o l6;
   private a9t k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("f", "multiLvlStrCache", "extLst");

   public w9n(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w9n$1(this, var1));
   }

   public w9n() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5("c", var2, "f", this.n5, false);
      if (this.l6 != null) {
         this.l6.n5("c", var2, "multiLvlStrCache");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final x2o n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <multiLvlStrCache> element can be added.");
      }

      this.l6 = new x2o();
      return this.l6;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final x2o k5() {
      return this.l6;
   }

   public final x8 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(w9n var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(w9n var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static x2o n5(w9n var0, x2o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(w9n var0, a9t var1) {
      return var0.k5 = var1;
   }
}
