package com.aspose.slides.internal.k4y;

public class r2d extends b3 {
   private g3p n5;
   private y1w l6;
   private c1m k5;
   private g7 u3;
   private s1y a6;
   private g3p u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("lit", "nor", "scr", "sty", "brk", "aln");

   public r2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r2d$1(this, var1));
   }

   public r2d() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "lit");
      }

      if (this.u3 != null) {
         switch (h0.n5(this.u3.n5())) {
            case 1:
               ((g3p)this.u3.k5()).n5("m", var2, this.u3.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "scr");
      }

      if (this.k5 != null) {
         this.k5.n5("m", var2, "sty");
      }

      if (this.a6 != null) {
         this.a6.n5("m", var2, "brk");
      }

      if (this.u9 != null) {
         this.u9.n5("m", var2, "aln");
      }

      var2.s7();
   }

   public final void n5(g3p var1) {
      this.n5 = var1;
   }

   public final void n5(y1w var1) {
      this.l6 = var1;
   }

   public final void n5(c1m var1) {
      this.k5 = var1;
   }

   public final void n5(s1y var1) {
      this.a6 = var1;
   }

   public final void l6(g3p var1) {
      this.u9 = var1;
   }

   public final g3p n5() {
      return this.n5;
   }

   public final y1w l6() {
      return this.l6;
   }

   public final c1m k5() {
      return this.k5;
   }

   public final g7 u3() {
      return this.u3;
   }

   public final void n5(g7 var1) {
      this.u3 = var1;
   }

   public final s1y a6() {
      return this.a6;
   }

   public final g3p u9() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static g3p n5(r2d var0, g3p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r2d var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static y1w n5(r2d var0, y1w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c1m n5(r2d var0, c1m var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s1y n5(r2d var0, s1y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g3p l6(r2d var0, g3p var1) {
      return var0.u9 = var1;
   }
}
