package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class y4g extends b3 {
   private j0e n5;
   private b5x l6;
   private t5n k5;
   private c8q u3;
   private l6s a6;
   private l6s u9;
   private x8w h0;
   private b9y c8;
   private a9t t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "errDir", "errBarType", "errValType", "noEndCap", "plus", "minus", "val", "spPr", "extLst"
   );

   public y4g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new y4g$1(this, var1));
   }

   public y4g() {
      this.l6 = new b5x();
      this.k5 = new t5n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "errDir");
      }

      this.l6.n5("c", var2, "errBarType");
      this.k5.n5("c", var2, "errValType");
      if (this.u3 != null) {
         this.u3.n5("c", var2, "noEndCap");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "plus");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "minus");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "val");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "spPr");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final j0e n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <errDir> element can be added.");
      }

      this.n5 = new j0e();
      return this.n5;
   }

   public final c8q l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <noEndCap> element can be added.");
      }

      this.u3 = new c8q();
      return this.u3;
   }

   public final l6s k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <plus> element can be added.");
      }

      this.a6 = new l6s();
      return this.a6;
   }

   public final l6s u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <minus> element can be added.");
      }

      this.u9 = new l6s();
      return this.u9;
   }

   public final x8w a6() {
      if (this.h0 != null) {
         throw new Exception("Only one <val> element can be added.");
      }

      this.h0 = new x8w();
      return this.h0;
   }

   public final b9y u9() {
      if (this.c8 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.c8 = new b9y();
      return this.c8;
   }

   public final void n5(x8 var1) {
      this.t2 = (a9t)var1;
   }

   public final j0e h0() {
      return this.n5;
   }

   public final b5x c8() {
      return this.l6;
   }

   public final t5n t2() {
      return this.k5;
   }

   public final c8q s7() {
      return this.u3;
   }

   public final l6s x8() {
      return this.a6;
   }

   public final l6s n3() {
      return this.u9;
   }

   public final x8w y4() {
      return this.h0;
   }

   public final b9y e2() {
      return this.c8;
   }

   public final x8 t9() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return s7;
   }

   // $VF: synthetic method
   static j0e n5(y4g var0, j0e var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b5x n5(y4g var0, b5x var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static t5n n5(y4g var0, t5n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(y4g var0, c8q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l6s n5(y4g var0, l6s var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l6s l6(y4g var0, l6s var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static x8w n5(y4g var0, x8w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static b9y n5(y4g var0, b9y var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static a9t n5(y4g var0, a9t var1) {
      return var0.t2 = var1;
   }
}
