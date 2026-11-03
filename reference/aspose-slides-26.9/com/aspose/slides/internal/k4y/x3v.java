package com.aspose.slides.internal.k4y;

public class x3v extends b3 {
   private String n5;
   private long l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("manifest:start-key-generation-name", "manifest:key-size");

   public x3v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      x3v$1 var2 = new x3v$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x3v() {
      this.k5();
   }

   private void k5() {
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("manifest:start-key-generation-name", this.n5);
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("manifest:key-size", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(x3v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(x3v var0, long var1) {
      return var0.l6 = var1;
   }
}
