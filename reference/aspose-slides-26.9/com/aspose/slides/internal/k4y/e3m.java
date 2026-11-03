package com.aspose.slides.internal.k4y;

public class e3m extends b3 {
   private String n5;
   private p4l l6;
   private p4l k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("name", "majorFont", "minorFont", "extLst");

   public e3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      e3m$1 var2 = new e3m$1(this);
      n5(var1, var2);
      n5(var1, new e3m$2(this, var1));
   }

   public e3m() {
      this.l6 = new p4l();
      this.k5 = new p4l();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      this.l6.n5("a", var2, "majorFont");
      this.k5.n5("a", var2, "minorFont");
      if (this.u3 != null) {
         this.u3.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.u3 = (l8r)var1;
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final p4l l6() {
      return this.l6;
   }

   public final p4l k5() {
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
   static String n5(e3m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static p4l n5(e3m var0, p4l var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static p4l l6(e3m var0, p4l var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(e3m var0, l8r var1) {
      return var0.u3 = var1;
   }
}
