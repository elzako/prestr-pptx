package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b6z extends b3 {
   private byte l6;
   private boolean k5;
   private g7 u3;
   public static final byte n5 = c2.n5("el");
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("type", "backwards", "tmAbs", "tmPct");

   public b6z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      b6z$1 var2 = new b6z$1(this);
      n5(var1, var2);
      n5(var1, new b6z$2(this, var1));
   }

   public b6z() {
      this.a6();
   }

   private void a6() {
      this.l6 = n5;
      this.k5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("type", c2.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("backwards", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 2:
               ((q4e)this.u3.k5()).n5("p", var2, this.u3.n5());
               break;
            case 3:
               ((u6e)this.u3.k5()).n5("p", var2, this.u3.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("IterateInterval already is initialized.");
      }

      switch (a6.n5(var1)) {
         case 2:
            this.u3 = new g7("tmAbs", new q4e());
            break;
         case 3:
            this.u3 = new g7("tmPct", new u6e());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final boolean l6() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final g7 k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static byte n5(b6z var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(b6z var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(b6z var0, g7 var1) {
      return var0.u3 = var1;
   }
}
