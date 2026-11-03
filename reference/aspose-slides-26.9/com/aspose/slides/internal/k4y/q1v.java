package com.aspose.slides.internal.k4y;

public class q1v extends b3 {
   private String n5;
   private String l6;
   private w7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("rName", "rVer", "blip");

   public q1v(com.aspose.slides.ms.System.Xml.c7 var1) {
      q1v$1 var2 = new q1v$1(this);
      n5(var1, var2);
      n5(var1, new q1v$2(this, var1));
   }

   public q1v() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      com.aspose.slides.internal.f8y.n5.n5(this.n5 != null, "Required property \"RName\" is uninitialized.");
      var2.l6("rName", this.n5);
      com.aspose.slides.internal.f8y.n5.n5(this.l6 != null, "Required property \"RVer\" is uninitialized.");
      var2.l6("rVer", this.l6);
      if (this.k5 != null) {
         this.k5.n5("am3d", var2, "blip");
      }

      var2.s7();
   }

   public final void n5(w7 var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(q1v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(q1v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w7 n5(q1v var0, w7 var1) {
      return var0.k5 = var1;
   }
}
