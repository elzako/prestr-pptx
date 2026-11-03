package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b8c extends b3 {
   private float n5;
   private boolean l6;
   private boolean k5;
   private s2b u3;
   private q8g a6;
   private s2b u9;
   private q8g h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("rot", "flipH", "flipV", "off", "ext", "chOff", "chExt");

   public b8c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      b8c$1 var2 = new b8c$1(this);
      n5(var1, var2);
      n5(var1, new b8c$2(this, var1));
   }

   public b8c() {
      this.y4();
   }

   private void y4() {
      this.n5 = 0.0F;
      this.l6 = false;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0F) {
         var2.l6("rot", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 60000.0F), 14)));
      }

      if (this.l6) {
         var2.l6("flipH", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("flipV", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "off");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "ext");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "chOff");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "chExt");
      }

      var2.s7();
   }

   public final s2b n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <off> element can be added.");
      }

      this.u3 = new s2b();
      return this.u3;
   }

   public final q8g l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <ext> element can be added.");
      }

      this.a6 = new q8g();
      return this.a6;
   }

   public final s2b k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <chOff> element can be added.");
      }

      this.u9 = new s2b();
      return this.u9;
   }

   public final q8g u3() {
      if (this.h0 != null) {
         throw new Exception("Only one <chExt> element can be added.");
      }

      this.h0 = new q8g();
      return this.h0;
   }

   public final float a6() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final boolean u9() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final boolean h0() {
      return this.k5;
   }

   public final void l6(boolean var1) {
      this.k5 = var1;
   }

   public final s2b c8() {
      return this.u3;
   }

   public final q8g t2() {
      return this.a6;
   }

   public final s2b s7() {
      return this.u9;
   }

   public final q8g x8() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return c8;
   }

   // $VF: synthetic method
   static float n5(b8c var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b8c var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(b8c var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s2b n5(b8c var0, s2b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static q8g n5(b8c var0, q8g var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static s2b l6(b8c var0, s2b var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static q8g l6(b8c var0, q8g var1) {
      return var0.h0 = var1;
   }
}
