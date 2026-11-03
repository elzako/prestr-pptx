package com.aspose.slides.internal.k4y;

public class a5e extends b3 {
   private com.aspose.slides.ms.System.j5 l6 = new com.aspose.slides.ms.System.j5();
   private y4q k5;
   private c3k u3;
   private c2z a6;
   private s1i u9;
   public static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "w_FullDate", "dateFormat", "lid", "storeMappedDataAs", "calendar"
   );

   public a5e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      a5e$1 var2 = new a5e$1(this);
      n5(var1, var2);
      n5(var1, new a5e$2(this, var1));
   }

   public a5e() {
      this.l6();
   }

   private void l6() {
      n5.u3(this.l6);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (com.aspose.slides.ms.System.j5.c8(this.l6, n5)) {
         var2.l6("w:fullDate", com.aspose.slides.ms.System.Xml.f4.n5(this.l6.m3(), "yyyy-MM-ddTHH:mm:ss.fffffffK"));
      }

      if (this.k5 != null) {
         this.k5.n5("w", var2, "dateFormat");
      }

      if (this.u3 != null) {
         this.u3.n5("w", var2, "lid");
      }

      if (this.a6 != null) {
         this.a6.n5("w", var2, "storeMappedDataAs");
      }

      if (this.u9 != null) {
         this.u9.n5("w", var2, "calendar");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 n5(a5e var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static y4q n5(a5e var0, y4q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c3k n5(a5e var0, c3k var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c2z n5(a5e var0, c2z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static s1i n5(a5e var0, s1i var1) {
      return var0.u9 = var1;
   }
}
