package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q6i extends b3 {
   private byte n5;
   private float l6;
   private u2q k5;
   private c5h u3;
   private c5h a6;
   private c5h u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "zoomContents", "p14:bounceEnd", "cBhvr", "by", "from", "to"
   );

   public q6i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      q6i$1 var2 = new q6i$1(this);
      n5(var1, var2);
      n5(var1, new q6i$2(this, var1));
   }

   public q6i() {
      this.s7();
      this.k5 = new u2q();
   }

   private void s7() {
      this.n5 = -1;
      this.l6 = Float.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("zoomContents", this.n5 == 1 ? "1" : "0");
      }

      if (!com.aspose.slides.ms.System.n1.k5(this.l6)) {
         if (var2.n5) {
            var2.l6("p14:bounceEnd", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
         } else {
            var2.l6(
               "p14:bounceEnd",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14))
            );
         }
      }

      this.k5.n5("p", var2, "cBhvr");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "by");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "from");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "to");
      }

      var2.s7();
   }

   public final c5h n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <by> element can be added.");
      }

      this.u3 = new c5h();
      return this.u3;
   }

   public final c5h l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <from> element can be added.");
      }

      this.a6 = new c5h();
      return this.a6;
   }

   public final c5h k5() {
      if (this.u9 != null) {
         throw new Exception("Only one <to> element can be added.");
      }

      this.u9 = new c5h();
      return this.u9;
   }

   public final byte u3() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final u2q a6() {
      return this.k5;
   }

   public final c5h u9() {
      return this.u3;
   }

   public final c5h h0() {
      return this.a6;
   }

   public final c5h c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return h0;
   }

   // $VF: synthetic method
   static byte n5(q6i var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float n5(q6i var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u2q n5(q6i var0, u2q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c5h n5(q6i var0, c5h var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c5h l6(q6i var0, c5h var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c5h k5(q6i var0, c5h var1) {
      return var0.u9 = var1;
   }
}
