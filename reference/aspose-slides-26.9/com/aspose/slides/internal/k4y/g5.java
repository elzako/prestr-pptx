package com.aspose.slides.internal.k4y;

public class g5 extends b3 {
   private f6 n5;
   private e3m l6;
   private u7c k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("clrScheme", "fontScheme", "fmtScheme", "extLst");

   public g5(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new g5$1(this, var1));
   }

   public g5() {
      this.n5 = new f6();
      this.l6 = new e3m();
      this.k5 = new u7c();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "clrScheme");
      this.l6.n5("a", var2, "fontScheme");
      this.k5.n5("a", var2, "fmtScheme");
      if (this.u3 != null) {
         this.u3.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.u3 = (l8r)var1;
   }

   public final f6 n5() {
      return this.n5;
   }

   public final e3m l6() {
      return this.l6;
   }

   public final u7c k5() {
      return this.k5;
   }

   public final x8 u3() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static f6 n5(g5 var0, f6 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e3m n5(g5 var0, e3m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u7c n5(g5 var0, u7c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(g5 var0, l8r var1) {
      return var0.u3 = var1;
   }
}
