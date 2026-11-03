package com.aspose.slides.internal.k4y;

public class p5z extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("w_Alignment", "w_RelativeTo", "w_Leader");

   public p5z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p5z$1 var2 = new p5z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p5z() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("w:alignment", x0u.n5(this.n5));
      var2.l6("w:relativeTo", t3f.n5(this.l6));
      var2.l6("w:leader", b5a.n5(this.k5));
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(p5z var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(p5z var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(p5z var0, int var1) {
      return var0.k5 = var1;
   }
}
