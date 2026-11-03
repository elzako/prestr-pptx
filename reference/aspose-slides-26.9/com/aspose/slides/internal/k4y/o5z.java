package com.aspose.slides.internal.k4y;

public class o5z extends b3 {
   private int n5;
   private v6p l6;
   private v6p k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("patternType", "fgColor", "bgColor");

   public o5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      o5z$1 var2 = new o5z$1(this);
      n5(var1, var2);
      n5(var1, new o5z$2(this, var1));
   }

   public o5z() {
      this.a6();
   }

   private void a6() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("patternType", t1c.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "fgColor");
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "bgColor");
      }

      var2.s7();
   }

   public final int n5() {
      return this.n5;
   }

   public final v6p l6() {
      return this.l6;
   }

   public final v6p k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(o5z var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v6p n5(o5z var0, v6p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static v6p l6(o5z var0, v6p var1) {
      return var0.k5 = var1;
   }
}
