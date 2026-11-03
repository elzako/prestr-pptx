package com.aspose.slides.internal.k4y;

public class f2z extends b3 {
   private int l6;
   private String k5;
   public static final int n5 = y3s.n5("col");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("dir");

   public f2z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      f2z$1 var2 = new f2z$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         var1.u9();
         this.k5 = var1.z1();
      }
   }

   public f2z() {
      this.k5();
   }

   private void k5() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("dir", y3s.n5(this.l6));
      }

      var2.l6(this.k5);
      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(f2z var0, int var1) {
      return var0.l6 = var1;
   }
}
