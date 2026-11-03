package com.aspose.slides.internal.k4y;

public class m7a extends b3 {
   private int n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("iconSet", "iconId");

   public m7a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      m7a$1 var2 = new m7a$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public m7a() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("iconSet", z6c.n5(this.n5));
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("iconId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(m7a var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(m7a var0, long var1) {
      return var0.l6 = var1;
   }
}
