package com.aspose.slides.internal.k4y;

public class f2b extends b3 {
   private byte l6;
   public static final byte n5 = q1.n5("horz");
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("dir");

   public f2b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      f2b$1 var2 = new f2b$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f2b() {
      this.k5();
   }

   private void k5() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("dir", q1.n5(this.l6));
      }

      var2.s7();
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return k5;
   }

   // $VF: synthetic method
   static byte n5(f2b var0, byte var1) {
      return var0.l6 = var1;
   }
}
