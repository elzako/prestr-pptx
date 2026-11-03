package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h7g extends b3 {
   private byte n5;
   private String l6;
   private byte k5;
   private float u3;
   private String a6;
   private float u9;
   private u2q h0;
   private c5h c8;
   private c5h t2;
   private c5h s7;
   private c5h x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "origin", "path", "pathEditMode", "rAng", "ptsTypes", "p14:bounceEnd", "cBhvr", "by", "from", "to", "rCtr"
   );

   public h7g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z1();
      h7g$1 var2 = new h7g$1(this);
      n5(var1, var2);
      n5(var1, new h7g$2(this, var1));
   }

   public h7g() {
      this.z1();
      this.h0 = new u2q();
   }

   private void z1() {
      this.n5 = -1;
      this.k5 = -1;
      this.u3 = Float.NaN;
      this.u9 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("origin", x7.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("path", this.l6);
      }

      if (this.k5 != -1) {
         var2.l6("pathEditMode", z0.n5(this.k5));
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u3)) {
         var2.l6("rAng", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 60000.0F), 14)));
      }

      if (this.a6 != null) {
         var2.l6("ptsTypes", this.a6);
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.u9)) {
         if (var2.n5) {
            var2.l6("p14:bounceEnd", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u9), "%"}));
         } else {
            var2.l6(
               "p14:bounceEnd",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u9 * 1000.0F), 14))
            );
         }
      }

      this.h0.n5("p", var2, "cBhvr");
      if (this.c8 != null) {
         this.c8.n5("p", var2, "by");
      }

      if (this.t2 != null) {
         this.t2.n5("p", var2, "from");
      }

      if (this.s7 != null) {
         this.s7.n5("p", var2, "to");
      }

      if (this.x8 != null) {
         this.x8.n5("p", var2, "rCtr");
      }

      var2.s7();
   }

   public final c5h n5() {
      if (this.c8 != null) {
         throw new Exception("Only one <by> element can be added.");
      }

      this.c8 = new c5h();
      return this.c8;
   }

   public final c5h l6() {
      if (this.t2 != null) {
         throw new Exception("Only one <from> element can be added.");
      }

      this.t2 = new c5h();
      return this.t2;
   }

   public final c5h k5() {
      if (this.s7 != null) {
         throw new Exception("Only one <to> element can be added.");
      }

      this.s7 = new c5h();
      return this.s7;
   }

   public final c5h u3() {
      if (this.x8 != null) {
         throw new Exception("Only one <rCtr> element can be added.");
      }

      this.x8 = new c5h();
      return this.x8;
   }

   public final byte a6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String u9() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final byte h0() {
      return this.k5;
   }

   public final void l6(byte var1) {
      this.k5 = var1;
   }

   public final float c8() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public final String t2() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final u2q s7() {
      return this.h0;
   }

   public final c5h x8() {
      return this.c8;
   }

   public final c5h n3() {
      return this.t2;
   }

   public final c5h y4() {
      return this.s7;
   }

   public final c5h e2() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t9() {
      return n3;
   }

   // $VF: synthetic method
   static byte n5(h7g var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(h7g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte l6(h7g var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float n5(h7g var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(h7g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static float l6(h7g var0, float var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u2q n5(h7g var0, u2q var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c5h n5(h7g var0, c5h var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c5h l6(h7g var0, c5h var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c5h k5(h7g var0, c5h var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static c5h u3(h7g var0, c5h var1) {
      return var0.x8 = var1;
   }
}
