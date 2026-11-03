package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

final class j0p extends g8<GradientFormat, j0p> implements IGradientFormatEffectiveData {
   int n5;
   int l6;
   float k5;
   boolean u3;
   byte a6;
   private GradientStopCollectionEffectiveData u9 = new GradientStopCollectionEffectiveData();
   private c1t h0;
   private c1t c8;
   private static final float[] t2 = new float[]{0.05F, 0.1F, 0.2F, 0.3F, 0.4F};
   private static final float[] s7 = new float[]{0.014F, 0.033F, 0.096F, 0.2F, 0.333F};
   private static final float[] x8 = new float[]{0.0F, 0.1F, 0.5F, 1.0F};

   j0p() {
      this.u9.n5();
      this.h0 = new c1t();
      this.c8 = new c1t();
      this.l6 = -1;
   }

   final void n5() {
      this.u9.n5();
      this.h0.a6();
      this.c8.a6();
      this.l6 = -1;
      this.a6 = 0;
      this.n5 = 0;
      this.k5 = 0.0F;
      this.u3 = false;
   }

   @Override
   public final int getTileFlip() {
      return this.n5;
   }

   @Override
   public final int getGradientDirection() {
      return this.l6;
   }

   @Override
   public final float getLinearGradientAngle() {
      return this.k5;
   }

   @Override
   public final boolean getLinearGradientScaled() {
      return this.u3;
   }

   @Override
   public final byte getGradientShape() {
      return this.a6;
   }

   @Override
   public final IGradientStopCollectionEffectiveData getGradientStops() {
      return this.u9;
   }

   final c1t l6() {
      return this.h0;
   }

   final c1t k5() {
      return this.c8;
   }

   private static float n5(float var0, float var1) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, var1);
   }

   private static float n5(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 0.45454544F);
   }

   private static float l6(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 2.2F);
   }

   private static float l6(float var0, float var1) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, var1);
   }

   final SortedList<Float, com.aspose.slides.internal.o9b.c8> u3() {
      return this.n5(0);
   }

   final SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(int var1) {
      if (this.u9.size() == 0) {
         return this.a6();
      }

      if (this.u9.size() < 2) {
         return null;
      }

      SortedList var2 = new SortedList();
      float var3 = -1.0F;
      com.aspose.slides.internal.o9b.c8 var4 = com.aspose.slides.internal.o9b.c8.u3.o8();
      IGenericEnumerator var5 = this.u9.iterator();

      try {
         while (var5.hasNext()) {
            GradientStopEffectiveData var6 = (GradientStopEffectiveData)var5.next();
            if (!var2.containsKey(var6.getPosition())) {
               var2.addItem(var6.getPosition(), var6.n5().o8());
            } else if (var6.getPosition() <= 1.0E-6F) {
               var2.set_Item(var6.getPosition(), var6.n5().o8());
            } else if (var6.getPosition() != 0.0F
               && var6.getPosition() != 1.0F
               && com.aspose.slides.internal.o9b.c8.l6((com.aspose.slides.internal.o9b.c8)var2.get_Item(var6.getPosition()), var6.n5())) {
               var2.addItem(var6.getPosition() + 1.0E-7F, var6.n5().o8());
            }

            if (var6.getPosition() >= var3) {
               var3 = var6.getPosition();
               var6.n5().n5(var4);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if ((Float)var2.getKeys().get_Item(var2.size() - 1) < 1.0F) {
         var2.addItem(1.0F, var4.o8());
      }

      if (var2.size() == 1) {
         var2.addItem(0.0F, ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(0)).o8());
      }

      if (this.u9.size() == 2 && var2.size() == 2 && (Float)var2.getKeys().get_Item(0) == 0.0F && (Float)var2.getKeys().get_Item(1) == 1.0F) {
         com.aspose.slides.internal.o9b.c8 var29 = ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(0)).o8();
         com.aspose.slides.internal.o9b.c8 var30 = ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(1)).o8();
         SortedList var31 = this.n5(var1, var29.o8(), var30.o8());
         var2.setCapacity(2 + var31.size());
         IGenericEnumerator var32 = var31.iterator();

         try {
            while (var32.hasNext()) {
               KeyValuePair var33 = (KeyValuePair)var32.next();
               if (!var2.containsKey(var33.getKey())) {
                  var2.addItem(var33.getKey(), ((com.aspose.slides.internal.o9b.c8)var33.getValue()).o8());
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var32, IDisposable.class)) {
               var32.dispose();
            }
         }
      } else if (this.u9.size() == 3
         && var2.size() == 3
         && ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(0)).equals(((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(2)).o8())
         && (Float)var2.getKeys().get_Item(0) == 0.0F
         && (Float)var2.getKeys().get_Item(2) == 1.0F) {
         com.aspose.slides.internal.o9b.c8 var28 = ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(0)).o8();
         com.aspose.slides.internal.o9b.c8 var7 = ((com.aspose.slides.internal.o9b.c8)var2.getValues().get_Item(1)).o8();
         if (!var7.equals(var28.o8())) {
            var2.setCapacity(2 + s7.length * 2);
            float var8 = (Float)var2.getKeys().get_Item(1);
            float[] var9 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(s7)).deepClone(), float[].class);
            float[] var10 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(t2)).deepClone(), float[].class);
            float var11 = 2.2F;
            float var12 = 1.0F / var11;
            if ((var7.s7() & 255) < 255) {
               var11 = 1.0F;
               var12 = 1.0F;
               var9 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(t2)).deepClone(), float[].class);
               var10 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(t2)).deepClone(), float[].class);
            }

            float var13 = (var28.s7() & 0xFF) / 255.0F;
            float var14 = l6((var28.x8() & 0xFF) / 255.0F, var11);
            float var15 = l6((var28.n3() & 0xFF) / 255.0F, var11);
            float var16 = l6((var28.y4() & 0xFF) / 255.0F, var11);
            float var17 = (var7.s7() & 0xFF) / 255.0F;
            float var18 = l6((var7.x8() & 0xFF) / 255.0F, var11);
            float var19 = l6((var7.n3() & 0xFF) / 255.0F, var11);
            float var20 = l6((var7.y4() & 0xFF) / 255.0F, var11);

            for (int var21 = 0; var21 < var10.length; var21++) {
               var2.addItem(
                  var8 * var10[var21],
                  new r0s(
                        var13 + (var17 - var13) * var10[var21],
                        n5(var14 + (var18 - var14) * var9[var21], var12),
                        n5(var15 + (var19 - var15) * var9[var21], var12),
                        n5(var16 + (var20 - var16) * var9[var21], var12)
                     )
                     .n5()
                     .o8()
               );
               var2.addItem(
                  var8 * (1.0F - var10[var21]),
                  new r0s(
                        var13 + (var17 - var13) * (1.0F - var10[var21]),
                        n5(var14 + (var18 - var14) * (1.0F - var9[var21]), var12),
                        n5(var15 + (var19 - var15) * (1.0F - var9[var21]), var12),
                        n5(var16 + (var20 - var16) * (1.0F - var9[var21]), var12)
                     )
                     .n5()
                     .o8()
               );
               var2.addItem(
                  1.0F - (1.0F - var8) * var10[var21],
                  new r0s(
                        var13 + (var17 - var13) * var10[var21],
                        n5(var14 + (var18 - var14) * var9[var21], var12),
                        n5(var15 + (var19 - var15) * var9[var21], var12),
                        n5(var16 + (var20 - var16) * var9[var21], var12)
                     )
                     .n5()
                     .o8()
               );
               var2.addItem(
                  var8 + (1.0F - var8) * var10[var21],
                  new r0s(
                        var13 + (var17 - var13) * (1.0F - var10[var21]),
                        n5(var14 + (var18 - var14) * (1.0F - var9[var21]), var12),
                        n5(var15 + (var19 - var15) * (1.0F - var9[var21]), var12),
                        n5(var16 + (var20 - var16) * (1.0F - var9[var21]), var12)
                     )
                     .n5()
                     .o8()
               );
            }
         }
      }

      return var2;
   }

   final SortedList<Float, com.aspose.slides.internal.o9b.c8> a6() {
      SortedList var1 = new SortedList();
      if (this.u9.size() == 0) {
         var1.addItem(0.0F, com.aspose.slides.internal.o9b.c8.m3().o8());
         var1.addItem(1.0F, com.aspose.slides.internal.o9b.c8.w4().o8());
      }

      return var1;
   }

   final void n5(i7b var1) {
      if (var1 != null) {
         j0p var2 = (j0p)var1;
         this.n5 = var2.n5;
         this.l6 = var2.getGradientDirection();
         this.k5 = var2.k5;
         this.u3 = var2.u3;
         this.a6 = var2.a6;
         this.h0.n5(var2.h0.u3().l6());
         this.c8.n5(var2.c8.u3().l6());
         this.u9.n5();
         IGenericEnumerator var3 = var2.u9.iterator();

         try {
            while (var3.hasNext()) {
               GradientStopEffectiveData var4 = (GradientStopEffectiveData)var3.next();
               this.u9.n5(var4);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   void n5(i7b var1, GradientFormat var2) {
      this.n5(var1);
      this.n5(var2);
   }

   final void n5(GradientFormat var1) {
      if (var1 != null) {
         if (var1.getGradientShape() != -1) {
            this.a6 = var1.getGradientShape();
         }

         if (var1.getGradientDirection() != -1) {
            this.l6 = var1.getGradientDirection();
            this.c8.n5(var1.u9().l6());
         } else if (var1.getGradientShape() == 2) {
            this.l6 = 4;
            this.c8.n5(var1.u9().l6());
         } else {
            this.l6 = 0;
         }

         if (!com.aspose.slides.ms.System.n1.k5(var1.getLinearGradientAngle())) {
            this.k5 = var1.getLinearGradientAngle();
         }

         if (var1.getLinearGradientScaled() != -1) {
            this.u3 = var1.getLinearGradientScaled() == 1;
         }

         if (var1.getTileFlip() != -1) {
            this.n5 = var1.getTileFlip();
         }

         if (var1.u3() != null) {
            this.h0.n5(var1.u3().u3().l6());
         }

         if (var1.getGradientStops() != null && var1.getGradientStops().size() > 0) {
            this.u9.n5();
            IGenericEnumerator var2 = var1.getGradientStops().iterator();

            try {
               while (var2.hasNext()) {
                  GradientStop var3 = (GradientStop)var2.next();
                  this.u9.n5(var3.getPosition(), (ColorFormat)var3.getColor());
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
         }
      }
   }

   @Override
   void n5(IBaseSlide var1, w6a var2) {
      IGenericEnumerator var3 = this.u9.iterator();

      try {
         while (var3.hasNext()) {
            GradientStopEffectiveData var4 = (GradientStopEffectiveData)var3.next();
            var4.n5(var1, var2);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   boolean n5(j0p var1) {
      if (var1 == null) {
         return false;
      }

      if (this.l6 != var1.getGradientDirection()) {
         return false;
      }

      if (this.a6 != var1.getGradientShape()) {
         return false;
      }

      switch (this.a6) {
         case -1:
         default:
            return true;
         case 0:
            if (!com.aspose.slides.internal.n8e.v4.n5(this.k5, var1.k5) || this.u3 != var1.u3) {
               return false;
            }
            break;
         case 1:
         case 2:
            if (this.l6 != var1.getGradientDirection()) {
               return false;
            }
         case 3:
      }

      if (this.n5 == var1.getTileFlip() && this.u9.size() == var1.getGradientStops().size()) {
         for (int var2 = 0; var2 < this.u9.size(); var2++) {
            if (!this.u9.get_Item(var2).equals(var1.getGradientStops().get_Item(var2))) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(int var1, com.aspose.slides.internal.o9b.c8 var2, com.aspose.slides.internal.o9b.c8 var3) {
      if (var2.equals(var3.o8())) {
         return new SortedList<>();
      } else {
         return var1 == 1 ? this.n5(var2.o8(), var3.o8()) : this.l6(var2.o8(), var3.o8());
      }
   }

   private SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      SortedList var3 = new SortedList();
      boolean var4 = var1.c8() > var2.c8();
      com.aspose.slides.internal.o9b.c8 var5 = (var4 ? var2 : var1).o8();
      com.aspose.slides.internal.o9b.c8 var6 = (var4 ? var1 : var2).o8();
      float var7 = (var5.s7() & 0xFF) / 255.0F;
      float var8 = (var5.x8() & 0xFF) / 255.0F;
      float var9 = (var5.n3() & 0xFF) / 255.0F;
      float var10 = (var5.y4() & 0xFF) / 255.0F;
      float var11 = (var6.s7() & 0xFF) / 255.0F;
      float var12 = (var6.x8() & 0xFF) / 255.0F;
      float var13 = (var6.n3() & 0xFF) / 255.0F;
      float var14 = (var6.y4() & 0xFF) / 255.0F;
      SortedList var15 = this.n5(x8);
      IGenericEnumerator var16 = var15.iterator();

      try {
         while (var16.hasNext()) {
            KeyValuePair var17 = (KeyValuePair)var16.next();
            var3.addItem(
               var17.getKey(),
               new r0s(
                     var7 + (var11 - var7) * (Float)var17.getValue(),
                     var8 + (var12 - var8) * (Float)var17.getValue(),
                     var9 + (var13 - var9) * (Float)var17.getValue(),
                     var10 + (var14 - var10) * (Float)var17.getValue()
                  )
                  .n5()
                  .o8()
            );
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var16, IDisposable.class)) {
            var16.dispose();
         }
      }

      if (var4) {
         SortedList var21 = new SortedList();

         for (int var18 = var3.size() - 1; var18 >= 0; var18--) {
            var21.addItem(1.0F - (Float)var3.getKeys().get_Item(var18), ((com.aspose.slides.internal.o9b.c8)var3.getValues().get_Item(var18)).o8());
         }

         var3 = var21;
      }

      return var3;
   }

   private SortedList<Float, com.aspose.slides.internal.o9b.c8> l6(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      SortedList var3 = new SortedList();
      float var4 = (var1.s7() & 0xFF) / 255.0F;
      float var5 = l6((var1.x8() & 0xFF) / 255.0F);
      float var6 = l6((var1.n3() & 0xFF) / 255.0F);
      float var7 = l6((var1.y4() & 0xFF) / 255.0F);
      float var8 = (var2.s7() & 0xFF) / 255.0F;
      float var9 = l6((var2.x8() & 0xFF) / 255.0F);
      float var10 = l6((var2.n3() & 0xFF) / 255.0F);
      float var11 = l6((var2.y4() & 0xFF) / 255.0F);

      for (int var12 = 0; var12 < s7.length; var12++) {
         var3.addItem(
            t2[var12],
            new r0s(
                  var4 + (var8 - var4) * t2[var12],
                  n5(var5 + (var9 - var5) * s7[var12]),
                  n5(var6 + (var10 - var6) * s7[var12]),
                  n5(var7 + (var11 - var7) * s7[var12])
               )
               .n5()
               .o8()
         );
         var3.addItem(
            1.0F - t2[var12],
            new r0s(
                  var4 + (var8 - var4) * (1.0F - t2[var12]),
                  n5(var5 + (var9 - var5) * (1.0F - s7[var12])),
                  n5(var6 + (var10 - var6) * (1.0F - s7[var12])),
                  n5(var7 + (var11 - var7) * (1.0F - s7[var12]))
               )
               .n5()
               .o8()
         );
      }

      return var3;
   }

   private SortedList<Float, Float> n5(float[] var1) {
      SortedList var2 = new SortedList();
      int var3 = 2 * var1.length;
      List var4 = this.n5(var1, var3);
      List$Enumerator var5 = var4.iterator();

      try {
         while (var5.hasNext()) {
            double var6 = com.aspose.slides.internal.v6g.k5.u3(var5.next(), double.class);
            float var8 = (float)this.n5(var6);
            if (!var2.containsKey((float)var6)) {
               var2.addItem((float)var6, var8);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var2;
   }

   private List<Double> n5(float[] var1, int var2) {
      List var3 = new List();
      int var4 = var2;

      for (int var5 = 0; var5 < var1.length - 1; var5++) {
         this.n5(var3, var1[var5], var1[var5 + 1], var4);
         var4 = com.aspose.slides.ms.System.q1.n5(var4 / 2, 2);
      }

      return var3;
   }

   private void n5(List<Double> var1, double var2, double var4, int var6) {
      double var7 = (var4 - var2) / var6;

      for (double var9 = var2 + var7 / 2.0; var9 <= var4; var9 += var7) {
         var1.addItem(com.aspose.slides.ms.System.q1.n5((double)(var9), 3));
      }
   }

   private double n5(double var1) {
      double var3 = -0.0826;
      double var5 = -0.7808;
      double var7 = 1.8616;
      double var9 = 0.0022;
      double var11 = var1 * var1;
      double var13 = var11 * var1;
      double var15 = -0.0826 * var13 + -0.7808 * var11 + 1.8616 * var1 + 0.0022;
      return com.aspose.slides.ms.System.q1.n5((double)(var15), 3);
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.j0p)recoveredArg);
   }
}
