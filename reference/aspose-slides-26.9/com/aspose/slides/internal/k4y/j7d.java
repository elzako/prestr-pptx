package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class j7d extends b3 {
   private long n5;
   private b9y l6;
   private h6m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("idx", "spPr", "extLst");

   public j7d(com.aspose.slides.ms.System.Xml.c7 var1) {
      j7d$1 var2 = new j7d$1(this);
      n5(var1, var2);
      n5(var1, new j7d$2(this, var1));
   }

   public j7d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         this.l6.n5("cx", var2, "spPr");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final b9y n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.l6 = new b9y();
      return this.l6;
   }

   public final void n5(h6m var1) {
      this.k5 = var1;
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final b9y k5() {
      return this.l6;
   }

   public final h6m u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(j7d var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(j7d var0, b9y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static h6m n5(j7d var0, h6m var1) {
      return var0.k5 = var1;
   }
}
