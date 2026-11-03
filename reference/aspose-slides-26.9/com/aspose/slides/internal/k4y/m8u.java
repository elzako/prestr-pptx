package com.aspose.slides.internal.k4y;

public final class m8u extends b3 {
   private int n5 = 0;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("relativeFrom", "align", "posOffset");

   public m8u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new m8u$1(this));
      n5(var1, new m8u$2(this, var1));
   }

   public m8u() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("relativeFrom", g1n.n5(this.n5));
      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
            default:
               break;
            case 2:
               this.n5(
                  "wp",
                  var2,
                  "posOffset",
                  com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(this.l6.k5(), int.class).intValue()),
                  false
               );
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(m8u var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(m8u var0, g7 var1) {
      return var0.l6 = var1;
   }
}
