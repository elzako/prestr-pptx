package com.aspose.slides.internal.k4y;

public class x1r extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "w_Id", "w_Combine", "w_CombineBrackets", "w_Vert", "w_VertCompress"
   );

   public x1r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      x1r$1 var2 = new x1r$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x1r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("w:id", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("w:combine", h5k.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("w:combineBrackets", j4e.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("w:vert", h5k.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("w:vertCompress", h5k.n5(this.a6));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(x1r var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(x1r var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(x1r var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(x1r var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int a6(x1r var0, int var1) {
      return var0.a6 = var1;
   }
}
