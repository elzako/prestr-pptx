package com.aspose.slides;

class r6k {
   public static void n5(
      IThreeDFormat var0, com.aspose.slides.internal.k4y.h6l var1, com.aspose.slides.internal.k4y.q9u var2, com.aspose.slides.internal.k4y.p6w var3
   ) {
      n5(new r6k$1(var0), var1, var2, var3);
   }

   public static void n5(r6k$n5 var0, com.aspose.slides.internal.k4y.h6l var1, com.aspose.slides.internal.k4y.q9u var2, com.aspose.slides.internal.k4y.p6w var3) {
      if (var2 != null) {
         IThreeDFormat var4 = var0.n5();
         var4.setContourWidth(var2.h0());
         var4.setExtrusionHeight(var2.u9());
         var4.setDepth(var2.a6());
         var4.setMaterial(var2.c8());
         z8c.n5(var4.getBevelTop(), var2.t2());
         z8c.n5(var4.getBevelBottom(), var2.s7());
         c4i.n5(var4.getContourColor(), var2.n3());
         c4i.n5(var4.getExtrusionColor(), var2.x8());
      }

      if (var1 != null) {
         IThreeDFormat var5 = var0.n5();
         m7.n5(var5.getCamera(), var1.l6());
         w9q.n5(var5.getLightRig(), var1.k5());
         w9.n5(((ThreeDFormat)var5).u3().k5(), var1.u3());
      }

      if (var3 != null) {
         g3o var6 = ((ThreeDFormat)var0.n5()).u3();
         var6.n5(true);
         var6.n5((float)var3.n5());
      }
   }

   public static void n5(
      IThreeDFormat var0,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.h6l> var1,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.q9u> var2,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.p6w> var3
   ) {
      if (var0 != null) {
         g3o var4 = ((ThreeDFormat)var0).u3();
         boolean var5 = false;
         if (((ThreeDFormat)var0).u9() != -1 || ((ThreeDFormat)var0).h0() != -1) {
            com.aspose.slides.internal.k4y.h6l var6 = (com.aspose.slides.internal.k4y.h6l)var1.invoke();
            m7.l6(var0.getCamera(), var6.l6());
            w9q.l6(var0.getLightRig(), var6.k5());
            w9.n5(var4.k5(), new r6k$2(var6));
            var5 = true;
         }

         if (var2 != null
            && (
               var5 && var0.getMaterial() != -1
                  || var0.getMaterial() != -1 && var0.getMaterial() != 14
                  || var0.getContourWidth() != 0.0
                  || var0.getExtrusionHeight() != 0.0
                  || ((ThreeDFormat)var0).c8() != -1
                  || ((ThreeDFormat)var0).t2() != -1
            )) {
            com.aspose.slides.internal.k4y.q9u var7 = (com.aspose.slides.internal.k4y.q9u)var2.invoke();
            var7.k5(var0.getContourWidth());
            var7.l6(var0.getExtrusionHeight());
            var7.n5(var0.getDepth());
            var7.n5(var0.getMaterial() == -1 ? 14 : var0.getMaterial());
            z8c.n5(var0.getBevelTop(), new r6k$3(var7));
            z8c.n5(var0.getBevelBottom(), new r6k$4(var7));
            c4i.n5(var0.getExtrusionColor(), new r6k$5(var7));
            c4i.n5(var0.getContourColor(), new r6k$6(var7));
         }

         if (var4.n5()) {
            com.aspose.slides.internal.k4y.p6w var8 = (com.aspose.slides.internal.k4y.p6w)var3.invoke();
            var8.n5(var4.l6());
         }
      }
   }

   static boolean n5(IThreeDFormat var0, boolean var1) {
      ThreeDFormat var2 = (ThreeDFormat)var0;
      return var2.n5(var1) || var2.u3().n5();
   }
}
