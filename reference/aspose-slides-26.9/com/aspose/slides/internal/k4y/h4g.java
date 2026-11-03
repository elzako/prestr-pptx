package com.aspose.slides.internal.k4y;

public class h4g extends b3 {
   private long n5;
   private long l6;
   private h0 k5;
   private p1i u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("w_DxaOrig", "w_DyaOrig", "control");

   public h4g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      h4g$1 var2 = new h4g$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (a6.n5(var1.n3())) {
                  case 2:
                     this.u3 = new p1i(var1);
                     break;
                  default:
                     this.k5 = new h0(var1);
                     var4 = true;
               }
            }
         }
      }
   }

   public h4g() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("w:dxaOrig", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("w:dyaOrig", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("", var2, "");
      }

      if (this.u3 != null) {
         this.u3.n5("w", var2, "control");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(h4g var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(h4g var0, long var1) {
      return var0.l6 = var1;
   }
}
