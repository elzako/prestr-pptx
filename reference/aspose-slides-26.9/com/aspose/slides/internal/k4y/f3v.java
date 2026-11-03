package com.aspose.slides.internal.k4y;

public class f3v extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private c3j l6;
   private y1g k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("sectionId", "zmPr", "extLst");

   public f3v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      f3v$1 var2 = new f3v$1(this);
      n5(var1, var2);
      n5(var1, new f3v$2(this, var1));
   }

   public f3v() {
      this.u3();
      this.l6 = new c3j();
   }

   private void u3() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("sectionId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      this.l6.n5("psez", var2, "zmPr");
      if (this.k5 != null) {
         this.k5.n5("psez", var2, "extLst");
      }

      var2.s7();
   }

   public final com.aspose.slides.ms.System.o0 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final c3j l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(f3v var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c3j n5(f3v var0, c3j var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(f3v var0, y1g var1) {
      return var0.k5 = var1;
   }
}
