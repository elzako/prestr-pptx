package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d1x extends b3 {
   private byte n5;
   private String l6;
   private g7 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("evt", "delay", "tgtEl", "tn", "rtn");

   public d1x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      d1x$1 var2 = new d1x$1(this);
      n5(var1, var2);
      n5(var1, new d1x$2(this, var1));
   }

   public d1x() {
      this.a6();
   }

   private void a6() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("evt", m4.n5(this.n5));
      }

      if (this.l6 != null) {
         var2.l6("delay", this.l6);
      }

      if (this.k5 != null) {
         switch (u3.n5(this.k5.n5())) {
            case 2:
               ((s2a)this.k5.k5()).n5("p", var2, this.k5.n5());
               break;
            case 3:
               ((i1s)this.k5.k5()).n5("p", var2, this.k5.n5());
               break;
            case 4:
               ((v0e)this.k5.k5()).n5("p", var2, this.k5.n5());
         }
      }

      var2.s7();
   }

   public final g7 n5(String var1) {
      if (this.k5 != null) {
         throw new Exception("Trigger already is initialized.");
      }

      switch (u3.n5(var1)) {
         case 2:
            this.k5 = new g7("tgtEl", new s2a());
            break;
         case 3:
            this.k5 = new g7("tn", new i1s());
            break;
         case 4:
            this.k5 = new g7("rtn", new v0e());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.k5;
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final g7 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(d1x var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(d1x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(d1x var0, g7 var1) {
      return var0.k5 = var1;
   }
}
