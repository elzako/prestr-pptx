package com.aspose.slides.internal.k4y;

public class i8s extends b3 {
   private e1o n5;
   private a1p l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("indexedColors", "mruColors");

   public i8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i8s$1(this, var1));
   }

   public i8s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "indexedColors");
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "mruColors");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static e1o n5(i8s var0, e1o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static a1p n5(i8s var0, a1p var1) {
      return var0.l6 = var1;
   }
}
