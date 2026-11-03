package com.aspose.slides.internal.k4y;

public class c6 extends b3 {
   private boolean n5;
   private i7 l6;
   private l8r k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("isComment", "cpLocks", "extLst");

   public c6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c6$1 var2 = new c6$1(this);
      n5(var1, var2);
      n5(var1, new c6$2(this, var1));
   }

   public c6() {
      this.l6();
   }

   private void l6() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("isComment", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         this.l6.n5("a14", var2, "cpLocks");
      }

      if (this.k5 != null) {
         this.k5.n5("a14", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(c6 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static i7 n5(c6 var0, i7 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(c6 var0, l8r var1) {
      return var0.k5 = var1;
   }
}
