package com.aspose.slides.internal.k4y;

public class c8e extends b3 {
   private long n5;
   private String l6;
   private g7 k5;
   private c4y u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "idx", "mods", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr", "styleClr"
   );

   public c8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      c8e$1 var2 = new c8e$1(this);
      n5(var1, var2);
      n5(var1, new c8e$2(this, var1));
   }

   public c8e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("idx", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6 != null) {
         var2.l6("mods", this.l6);
      }

      if (this.k5 != null) {
         switch (a6.n5(this.k5.n5())) {
            case 2:
               ((e4w)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 3:
               ((e8p)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 4:
               ((d0p)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 5:
               ((s0i)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 6:
               ((q4d)this.k5.k5()).n5("a", var2, this.k5.n5());
               break;
            case 7:
               ((x4a)this.k5.k5()).n5("a", var2, this.k5.n5());
         }
      }

      if (this.u3 != null) {
         this.u3.n5("cs", var2, "styleClr");
      }

      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final g7 l6() {
      return this.k5;
   }

   public final c4y k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(c8e var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(c8e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(c8e var0, g7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c4y n5(c8e var0, c4y var1) {
      return var0.u3 = var1;
   }
}
