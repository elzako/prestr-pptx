package com.aspose.slides.internal.k4y;

public class b5v extends b3 {
   private int n5;
   private int l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("v:ext", "type");

   public b5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b5v$1 var2 = new b5v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public b5v() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("type", r1c.n5(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(b5v var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(b5v var0, int var1) {
      return var0.l6 = var1;
   }
}
