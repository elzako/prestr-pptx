package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r6a extends b3 {
   private m0l n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("rPr", "t");

   public r6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r6a$1(this, var1));
   }

   public r6a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "rPr");
      }

      this.n5("a", var2, "t", this.l6, false);
      var2.s7();
   }

   public final m0l n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <rPr> element can be added.");
      }

      this.n5 = new m0l();
      return this.n5;
   }

   public final void n5(m0l var1) {
      this.n5 = var1;
   }

   public final m0l l6() {
      return this.n5;
   }

   public final String k5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static m0l n5(r6a var0, m0l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r6a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(r6a var0) {
      return var0.l6;
   }
}
