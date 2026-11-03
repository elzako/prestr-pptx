package com.aspose.slides.internal.k4y;

public class c7e extends b3 {
   private float n5;
   private boolean l6;
   private long k5;
   private boolean u3;
   private n0d a6;
   private s2a u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("vol", "mute", "numSld", "showWhenStopped", "cTn", "tgtEl");

   public c7e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      c7e$1 var2 = new c7e$1(this);
      n5(var1, var2);
      n5(var1, new c7e$2(this, var1));
   }

   public c7e() {
      this.c8();
      this.a6 = new n0d();
      this.u9 = new s2a();
   }

   private void c8() {
      this.n5 = 50.0F;
      this.l6 = false;
      this.k5 = 1L;
      this.u3 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 50.0F) {
         if (var2.n5) {
            var2.l6("vol", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
         } else {
            var2.l6(
               "vol", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14))
            );
         }
      }

      if (this.l6) {
         var2.l6("mute", this.l6 ? "1" : "0");
      }

      if ((this.k5 & 4294967295L) != 1L) {
         var2.l6("numSld", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      }

      if (!this.u3) {
         var2.l6("showWhenStopped", this.u3 ? "1" : "0");
      }

      this.a6.n5("p", var2, "cTn");
      this.u9.n5("p", var2, "tgtEl");
      var2.s7();
   }

   public final float n5() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final boolean l6() {
      return this.l6;
   }

   public final void n5(boolean var1) {
      this.l6 = var1;
   }

   public final long k5() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final boolean u3() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final n0d a6() {
      return this.a6;
   }

   public final s2a u9() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return h0;
   }

   // $VF: synthetic method
   static float n5(c7e var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c7e var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(c7e var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c7e var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static n0d n5(c7e var0, n0d var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static s2a n5(c7e var0, s2a var1) {
      return var0.u9 = var1;
   }
}
