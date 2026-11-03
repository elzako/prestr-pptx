package com.aspose.slides.internal.p5k;

public class y4 extends d2 {
   public y4(l6 var1) {
      super(var1);
   }

   public final void n5(com.aspose.slides.internal.w0.s7 var1) {
      this.u9().n5(1);
      this.u9().l6((short)com.aspose.slides.internal.n2d.t4.n5(var1.l6()));
      this.u9().l6(n5(var1.k5()), 2, false);
      int var2 = l6(var1.a6());
      this.u9().l6(var2, 2, false);
      this.u9().n5(true, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().n5(false, false);
      this.u9().l6(0, 5, false);
      this.u9().n5(false, false);
      this.u9().l6(n5(var1.u3()), 2, false);
      if (var2 == 2) {
         this.u9().l6((short)com.aspose.slides.internal.n2d.t4.n5(var1.h0()));
      }

      a6 var3 = new a6(this.h0());
      var3.l6(var1.u9());
   }

   private static int n5(int var0) {
      switch (var0) {
         case 0:
         case 3:
         case 16:
         case 19:
         case 20:
         case 240:
         case 255:
         default:
            return 1;
         case 1:
         case 17:
            return 2;
         case 2:
         case 18:
            return 0;
      }
   }

   private static int l6(int var0) {
      switch (var0) {
         case 0:
         case 3:
            return 2;
         case 1:
            return 1;
         case 2:
            return 0;
         default:
            return 1;
      }
   }
}
