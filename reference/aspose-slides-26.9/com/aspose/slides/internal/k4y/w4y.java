package com.aspose.slides.internal.k4y;

public class w4y extends b3 {
   private g7 n5;
   private a5j l6;
   private a5j k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("size", "sizeAuto", "default", "checked");

   public w4y(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w4y$1(this, var1));
   }

   public w4y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         switch (u3.n5(this.n5.n5())) {
            case 0:
               ((l9i)this.n5.k5()).n5("w", var2, this.n5.n5());
               break;
            case 1:
               ((a5j)this.n5.k5()).n5("w", var2, this.n5.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("w", var2, "default");
      }

      if (this.k5 != null) {
         this.k5.n5("w", var2, "checked");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static g7 n5(w4y var0, g7 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static a5j n5(w4y var0, a5j var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a5j l6(w4y var0, a5j var1) {
      return var0.k5 = var1;
   }
}
