package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r5d extends b3 {
   private int n5;
   private int l6;
   private v2x k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("rig", "dir", "rot");

   public r5d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      r5d$1 var2 = new r5d$1(this);
      n5(var1, var2);
      n5(var1, new r5d$2(this, var1));
   }

   public r5d() {
      this.u9();
   }

   private void u9() {
      this.n5 = -1;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("rig", p7.n5(this.n5));
      var2.l6("dir", s9.n5(this.l6));
      if (this.k5 != null) {
         this.k5.n5("a", var2, "rot");
      }

      var2.s7();
   }

   public final v2x n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <rot> element can be added.");
      }

      this.k5 = new v2x();
      return this.k5;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final v2x u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(r5d var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(r5d var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static v2x n5(r5d var0, v2x var1) {
      return var0.k5 = var1;
   }
}
