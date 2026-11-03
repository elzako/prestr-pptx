package com.aspose.slides;

import java.util.Arrays;

class s9g extends l5x {
   final void n5(Presentation var1) {
      this.n5();

      while (this.s7().u9()) {
         if (this.s7().s7() == 1 && "document-settings".equals(this.s7().n3())) {
            com.aspose.slides.internal.k4y.a1w var2 = new com.aspose.slides.internal.k4y.a1w(this.s7());
            var1.e2().n5(var2);
         }
      }

      this.n3();
   }

   final void l6(Presentation var1) {
      this.y4();
      com.aspose.slides.internal.k4y.a1w var2 = var1.e2().n5();
      if (var2 == null) {
         var2 = new com.aspose.slides.internal.k4y.a1w();
      }

      com.aspose.slides.internal.k4y.a1w var3 = var2;
      Object var4 = null;
      String[][] var5 = new String[][]{(String[])var4};
      byte[] var6 = null;
      byte[][] var7 = new byte[][]{var6};
      int[] var8 = Presentation.n5((s4e)var1.t4(), var7);
      var6 = var7[0];
      var5[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var8, i7t.l6) && var6 != null && var6.length > 0) {
         var5[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var6), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var9 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var9 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var12) {
            var9 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var12);
         }
      }

      if ((
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var8, i7t.k5)
         && !Arrays.equals(var9, com.aspose.slides.internal.n8e.z7.l6)) {
         com.aspose.slides.internal.k4y.v3c var10;
         if (var3.l6() == null) {
            var10 = var3.n5();
         } else {
            var10 = new com.aspose.slides.internal.k4y.v3c();
            var3.n5(var10);
         }

         com.aspose.slides.internal.k4y.r4q var11 = this.n5(var10);
         this.n5(var11, true);
      }

      var3.n5(null, this.x8(), "document-settings");
      this.e2();
   }

   public s9g(com.aspose.slides.internal.c8m.z5 var1, z5q var2) {
      super(var1, var2);
   }

   public s9g(com.aspose.slides.internal.c8m.z5 var1, OdpSerializationContext var2) {
      super(var1, var2);
   }

   private com.aspose.slides.internal.k4y.r4q n5(com.aspose.slides.internal.k4y.v3c var1) {
      com.aspose.slides.internal.k4y.r4q var2 = var1.n5();
      var2.l6("ooo:configuration-settings");
      return var2;
   }

   private void n5(com.aspose.slides.internal.k4y.r4q var1, boolean var2) {
      com.aspose.slides.internal.k4y.s0v var3 = (com.aspose.slides.internal.k4y.s0v)var1.n5("config-item").l6();
      var3.n5("LoadReadonly");
      var3.n5(1);
      var3.l6(var2 ? "true" : "false");
   }
}
