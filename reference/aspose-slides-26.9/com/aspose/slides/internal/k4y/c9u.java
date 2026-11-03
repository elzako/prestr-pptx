package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c9u extends b3 {
   private g3p n5;
   private g3p l6;
   private g3p k5;
   private s1y u3;
   private g3p a6;
   private r6c u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("opEmu", "noBreak", "diff", "brk", "aln", "ctrlPr");

   public c9u(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new c9u$1(this, var1));
   }

   public c9u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "opEmu");
      }

      if (this.l6 != null) {
         this.l6.n5("m", var2, "noBreak");
      }

      if (this.k5 != null) {
         this.k5.n5("m", var2, "diff");
      }

      if (this.u3 != null) {
         this.u3.n5("m", var2, "brk");
      }

      if (this.a6 != null) {
         this.a6.n5("m", var2, "aln");
      }

      if (this.u9 != null) {
         this.u9.n5("m", var2, "ctrlPr");
      }

      var2.s7();
   }

   public final void n5(g3p var1) {
      this.n5 = var1;
   }

   public final void l6(g3p var1) {
      this.l6 = var1;
   }

   public final void k5(g3p var1) {
      this.k5 = var1;
   }

   public final void n5(s1y var1) {
      this.u3 = var1;
   }

   public final void u3(g3p var1) {
      this.a6 = var1;
   }

   public final r6c n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <ctrlPr> element can be added.");
      }

      this.u9 = new r6c();
      return this.u9;
   }

   public final g3p l6() {
      return this.n5;
   }

   public final g3p k5() {
      return this.l6;
   }

   public final g3p u3() {
      return this.k5;
   }

   public final s1y a6() {
      return this.u3;
   }

   public final g3p u9() {
      return this.a6;
   }

   public final r6c h0() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return h0;
   }

   // $VF: synthetic method
   static g3p n5(c9u var0, g3p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g3p l6(c9u var0, g3p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g3p k5(c9u var0, g3p var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s1y n5(c9u var0, s1y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g3p u3(c9u var0, g3p var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static r6c n5(c9u var0, r6c var1) {
      return var0.u9 = var1;
   }
}
