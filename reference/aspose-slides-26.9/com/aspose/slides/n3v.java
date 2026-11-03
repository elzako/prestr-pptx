package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.exceptions.ArgumentNullException;

class n3v {
   private final PresentationAnimationsGenerator n5;
   private final GifOptions l6;
   private final com.aspose.slides.internal.f7.n5 k5;
   private double u3 = 0.0;
   private int a6;

   private n3v(PresentationAnimationsGenerator var1, GifOptions var2, com.aspose.slides.internal.f7.n5 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public static void n5(Presentation var0, com.aspose.slides.internal.z0k.t4 var1, IGenericList<Integer> var2, GifOptions var3) {
      if (var0 == null) {
         throw new ArgumentNullException("presentation");
      }

      if (var1 == null) {
         throw new ArgumentNullException("gifOutput");
      }

      com.aspose.slides.internal.o9b.p8 var4 = new com.aspose.slides.internal.o9b.p8();
      if (var3 != null && !var3.n5().n5()) {
         var3.n5().k5(var4);
      } else {
         ((SlideSize)var0.getSlideSize()).n5().u3().k5(var4);
      }

      PresentationAnimationsGenerator var5 = new PresentationAnimationsGenerator(var4.u3());
      if (var3 != null) {
         var5.setIncludeHiddenSlides(var3.getExportHiddenSlides());
         var5.setDefaultDelay(var3.getDefaultDelay());
      }

      PresentationAnimationsGenerator var6 = var5;

      try {
         com.aspose.slides.internal.f7.n5 var7 = new com.aspose.slides.internal.f7.n5(var1, var6.n5.u3());

         try {
            n3v var8 = new n3v(var6, var3, var7);
            var8.n5(var0, var2);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private void n5(Presentation var1, IGenericList<Integer> var2) {
      int var3 = 0;
      IGenericEnumerable var4;
      if (var2 == null) {
         var4 = var1.getSlides();
         var3 = var1.getSlides().size();
      } else {
         ISlide[] var5 = new ISlide[var2.size()];

         for (int var6 = 0; var6 < var2.size(); var6++) {
            int var7 = (Integer)var2.get_Item(var6) - 1;
            var5[var6] = var1.getSlides().get_Item(var7);
         }

         var4 = com.aspose.slides.ms.System.u3.n5(var5);
         var3 = var2.size();
      }

      this.u3 = var3 > 0 ? 1.0 / var3 : 0.0;
      this.a6 = -1;
      this.n5.setNewAnimation(new n3v$1(this));
      if (this.l6 != null) {
         this.n5.n5(this.l6.getGradientStyle());
      }

      try {
         this.n5.run(var4);
      } finally {
         this.n5.setNewAnimation(null);
      }
   }

   private void n5(IPresentationAnimationPlayer var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, r8q.class)) {
         r8q var2 = (r8q)var1;
         this.n5(var2.n5(), com.aspose.slides.internal.v6g.k5.u3(var1.getDuration(), 14));
      } else {
         this.l6(var1);
      }
   }

   private void l6(IPresentationAnimationPlayer var1) {
      int var2 = 25;
      if (this.l6 != null) {
         var2 = this.l6.getTransitionFps();
      }

      double var3 = 1.0 / var2 * 1000.0;
      double var5 = 0.0;
      int var7 = 0;

      while (true) {
         var1.setTimePosition(var5);
         com.aspose.slides.internal.o9b.l6 var8 = ((t4h)var1).n5();

         try {
            double var9 = var3 * ++var7;
            if (var1.getDuration() < var9) {
               double var19 = var9 - var1.getDuration();
               double[] var21 = new double[]{var19};
               int var22 = n5(var21);
               var19 = var21[0];
               this.n5(var8, var22);
               return;
            }

            double var11 = var9 - var5;
            double[] var13 = new double[]{var11};
            int var14 = n5(var13);
            var11 = var13[0];
            if (var14 > 0) {
               var5 += var11;
            } else {
               var5 = var9;
            }

            this.n5(var8, var14);
         } finally {
            if (!com.aspose.slides.internal.v6g.k5.l6(var1, d8y.class)) {
               var8.dispose();
            }
         }
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, int var2) {
      this.k5.n5(var1, var2);
      if (this.l6 != null && this.l6.getProgressCallback() != null) {
         int var3 = this.n5.getExportedSlides();
         if (var3 != this.a6) {
            double var4 = this.u3 * var3;
            this.a6 = var3;
            this.l6.getProgressCallback().reporting(var4);
         }
      }
   }

   private static int n5(double[] var0) {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(var0[0], 14);
      int var2 = com.aspose.slides.internal.q4.l6.l6(com.aspose.slides.internal.q4.l6.n5(var1));
      var0[0] = var2;
      return var2;
   }

   // $VF: synthetic method
   static void n5(n3v var0, IPresentationAnimationPlayer var1) {
      var0.n5(var1);
   }
}
