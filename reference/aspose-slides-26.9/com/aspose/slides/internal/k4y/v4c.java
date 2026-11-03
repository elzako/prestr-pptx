package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v4c extends b3 {
   private byte l6;
   private g7 k5;
   public static final byte n5 = s4.n5("white");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("bwMode", "bgPr", "bgRef");

   public v4c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      v4c$1 var2 = new v4c$1(this);
      n5(var1, var2);
      n5(var1, new v4c$2(this, var1));
   }

   public v4c() {
      this.u3();
   }

   private void u3() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("bwMode", s4.n5(this.l6));
      }

      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 1:
               ((h5t)this.k5.k5()).n5("p", var2, this.k5.n5());
               break;
            case 2:
               ((x2y)this.k5.k5()).n5("p", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("Background already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 1:
            this.k5 = new g7("bgPr", new h5t());
            break;
         case 2:
            this.k5 = new g7("bgRef", new x2y());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final g7 l6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(v4c var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(v4c var0, g7 var1) {
      return var0.k5 = var1;
   }
}
