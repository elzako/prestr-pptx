package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a4w extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private byte u3;
   private byte a6;
   private float u9;
   private u2q h0;
   private f3w c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "by", "from", "to", "calcmode", "valueType", "p14:bounceEnd", "cBhvr", "tavLst"
   );

   public a4w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      a4w$1 var2 = new a4w$1(this);
      n5(var1, var2);
      n5(var1, new a4w$2(this, var1));
   }

   public a4w() {
      this.s7();
      this.h0 = new u2q();
   }

   private void s7() {
      this.u3 = -1;
      this.a6 = -1;
      this.u9 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("by", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("from", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("to", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("calcmode", v6.n5(this.u3));
      }

      if (this.a6 != -1) {
         var2.l6("valueType", x0.n5(this.a6));
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
         this.c8.n5("p", var2, "tavLst");
      }

      var2.s7();
   }

   public final f3w n5() {
      if (this.c8 != null) {
         throw new Exception("Only one <tavLst> element can be added.");
      }

      this.c8 = new f3w();
      return this.c8;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return this.u3;
   }

   public final void n5(byte var1) {
      this.u3 = var1;
   }

   public final byte u9() {
      return this.a6;
   }

   public final void l6(byte var1) {
      this.a6 = var1;
   }

   public final u2q h0() {
      return this.h0;
   }

   public final f3w c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(a4w var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a4w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(a4w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte n5(a4w var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static byte l6(a4w var0, byte var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static float n5(a4w var0, float var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static u2q n5(a4w var0, u2q var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static f3w n5(a4w var0, f3w var1) {
      return var0.c8 = var1;
   }
}
