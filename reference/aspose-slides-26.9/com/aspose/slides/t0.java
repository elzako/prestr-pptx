package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.util.Arrays;

class t0 {
   public final BaseSlide n5;

   public t0(BaseSlide var1) {
      if (var1 == null) {
         throw new ArgumentNullException("slide");
      }

      this.n5 = var1;
   }

   public final Presentation n5() {
      return (Presentation)this.n5.getPresentation();
   }

   final void n5(e3 var1) {
      String[] var2 = null;
      Presentation var3 = this.n5();
      String[][] var4 = new String[][]{var2};
      byte[] var5 = null;
      byte[][] var6 = new byte[][]{var5};
      int[] var7 = Presentation.n5((s4e)var3.t4(), var6);
      var5 = var6[0];
      var4[0] = com.aspose.slides.internal.n8e.w1.u3();
      if (Arrays.equals(var7, i7t.l6) && var5 != null && var5.length > 0) {
         var4[0] = com.aspose.slides.ms.System.d1.n5(Presentation.n5(var5), new String[]{"\r\n", "\n", "\r", "\n\r"}, 0);
      }

      int[] var8 = com.aspose.slides.internal.n8e.z7.n5;
      if (com.aspose.slides.internal.n8e.f2.l6() == com.aspose.slides.internal.n8e.z7.l6) {
         try {
            var8 = com.aspose.slides.internal.n8e.f2.l6();
         } catch (IllegalStateException var10) {
            var8 = com.aspose.slides.internal.n8e.z7.n5;
            com.aspose.slides.internal.n8e.v4.n5(var10);
         }
      }

      var2 = var4[0];
      if ((
            !Arrays.equals(com.aspose.slides.internal.n8e.w1.n5(), com.aspose.slides.internal.n8e.r4.l6)
               || com.aspose.slides.internal.n8e.j5.n5() == null
               || !(com.aspose.slides.internal.n8e.j5.n5() instanceof com.aspose.slides.internal.n8e.w1)
         )
         && !Arrays.equals(var7, i7t.k5)
         && !Arrays.equals(var8, com.aspose.slides.internal.n8e.z7.l6)) {
         TextParam$FontArgs var9 = new TextParam$FontArgs();
         var9.Name = "Arial";
         var9.Height = 24.0F;
         var9.Bold = true;
         this.n5(var1, var3, var2, var9.Clone());
      }
   }

   private void n5(e3 var1, Presentation var2, String[] var3, TextParam$FontArgs var4) {
      TextParam var5 = new TextParam(var2, 72.0F, var4.Clone());
      var5.n5(com.aspose.slides.internal.o9b.c8.n5(192, 255, 216, 207).o8());
      var5.l6(true);
      var5.n5(new com.aspose.slides.ms.System.o5<>(true));
      com.aspose.slides.internal.o9b.f2[] var6 = (com.aspose.slides.internal.o9b.f2[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.f2.class), var3.length)
      );
      com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F);
      float var8 = 0.0F;

      for (int var9 = 0; var9 < var3.length; var9++) {
         var1.n5(var3[var9], var5).l6(var6[var9]);
         var8 += var6[var9].k5();
      }

      var7.l6((var1.x8() - var8) / 2.0F);

      for (int var10 = 0; var10 < var3.length; var10++) {
         var7.n5((var1.s7() - var6[var10].l6()) / 2.0F);
         var1.n5(var3[var10], new com.aspose.slides.internal.o9b.y1(var7.u3(), var6[var10].a6()), var5);
         var7.l6(var7.k5() + var6[var10].k5());
      }
   }

   final a1v n5(Background var1, ShapeFrame var2, e3 var3, s5u var4) {
      a1v var5 = null;
      if (var1 != null) {
         j5m var6;
         if (var3 != null) {
            var6 = new j5m(var2.cloneT(), var3, null, this.n5, 5, var4);
         } else {
            var6 = new j5m(var2.cloneT(), null, null, this.n5, var4);
         }

         m8 var7 = var1.h0();
         var5 = a1v.n5(var6, (f6a)var7.getFillFormat());
         var5.n5(true);
         if (com.aspose.slides.internal.v6g.k5.l6(var5, u4z.class)) {
            com.aspose.slides.internal.v6g.k5.n5(var5, u4z.class).n5(var7.h0());
         }
      }

      return var5;
   }
}
