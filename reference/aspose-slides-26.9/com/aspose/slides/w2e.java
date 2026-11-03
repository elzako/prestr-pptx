package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.ms.System.IDisposable;

final class w2e {
   private int n5;
   private float l6;
   private byte k5;
   private byte u3;
   private int a6;
   private GradientStopCollection u9;
   private final c1t h0;
   private s4s c8 = new s4s();
   private long t2;
   private static final float[] s7 = new float[]{0.05F, 0.1F, 0.2F, 0.3F, 0.4F};
   private static final float[] x8 = new float[]{0.014F, 0.033F, 0.096F, 0.2F, 0.333F};
   private static final float[][] n3 = new float[][]{
      {0.0F, 0.0F, -1.0F, -1.0F, 2.0F, 2.0F},
      {1.0F, 0.0F, 0.0F, -1.0F, 2.0F, 2.0F},
      {0.0F, 1.0F, -1.0F, 0.0F, 2.0F, 2.0F},
      {1.0F, 1.0F, 0.0F, 0.0F, 2.0F, 2.0F},
      {0.5F, 0.5F, 0.0F, 0.0F, 1.0F, 1.0F}
   };

   w2e(GradientStopCollection var1, c1t var2) {
      this.u9 = var1;
      this.h0 = var2;
      this.c8 = new s4s(d2k.k5.u3(), d2k.u3.u3());
      this.n5 = -1;
      this.l6 = Float.NaN;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = -1;
   }

   final s4s n5() {
      return this.c8;
   }

   final void n5(s4s var1) {
      var1.n5(this.c8);
      this.t2();
      this.c8();
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
      this.c8();
   }

   public final int k5() {
      return this.a6;
   }

   public final void l6(int var1) {
      if (this.a6 != var1) {
         this.a6 = var1;
         if (this.a6 != -1) {
            int var2 = this.a6 - 0;
            this.c8 = new s4s(n3[var2][0], n3[var2][1], 0.0F, 0.0F);
            this.h0.n5(new s4s(n3[var2][2], n3[var2][3], n3[var2][4], n3[var2][5]));
         }

         this.c8();
      }
   }

   public final float u3() {
      return this.l6;
   }

   public final void n5(float var1) {
      var1 %= 360.0F;
      if (var1 < 0.0F) {
         var1 += 360.0F;
      }

      this.l6 = var1;
      this.c8();
   }

   public final byte a6() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
      this.c8();
   }

   public final byte u9() {
      return this.u3;
   }

   public final void l6(byte var1) {
      this.u3 = var1;
      this.c8();
   }

   final void n5(IGradientStopCollection var1) {
      this.u9 = (GradientStopCollection)var1;
   }

   final void n5(GradientFormat var1) {
      this.l6(var1);
      this.c8();
   }

   final void l6(GradientFormat var1) {
      this.n5 = var1.getTileFlip();
      this.l6 = var1.getLinearGradientAngle();
      this.k5 = var1.getLinearGradientScaled();
      this.u3 = var1.getGradientShape();
      this.a6 = var1.getGradientDirection();
      this.h0.n5(var1.u3());
      var1.u9().n5(this.c8);
      this.u9.u9();
      IGenericEnumerator var2 = var1.getGradientStops().iterator();

      try {
         while (var2.hasNext()) {
            GradientStop var3 = (GradientStop)var2.next();
            GradientStop var4 = (GradientStop)this.u9.a6();
            var4.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   final void n5(IGradientFormatEffectiveData var1) {
      this.n5 = var1.getTileFlip();
      this.l6 = var1.getLinearGradientAngle();
      this.k5 = (byte)(var1.getLinearGradientScaled() ? 1 : 0);
      this.u3 = var1.getGradientShape();
      this.u9.clear();
      IGenericEnumerator var2 = var1.getGradientStops().iterator();

      try {
         while (var2.hasNext()) {
            IGradientStopEffectiveData var3 = (IGradientStopEffectiveData)var2.next();
            GradientStop var4 = (GradientStop)this.u9.u3();
            var4.n5(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }

      this.a6 = var1.getGradientDirection();
      if (this.a6 != -1) {
         int var8 = this.a6 - 0;
         this.c8 = new s4s(n3[var8][0], n3[var8][1], 0.0F, 0.0F);
         this.h0.n5(new s4s(n3[var8][2], n3[var8][3], n3[var8][4], n3[var8][5]));
      }

      this.c8();
   }

   final SortedList<Float, com.aspose.slides.internal.o9b.c8> n5(IBaseSlide var1) {
      if (this.u9.size() < 2) {
         return null;
      }

      SortedList var2 = new SortedList();
      float var3 = -1.0F;
      ColorFormat var4 = null;
      IGenericEnumerator var5 = this.u9.iterator();

      try {
         while (var5.hasNext()) {
            GradientStop var6 = (GradientStop)var5.next();
            if (!var2.containsKey(var6.getPosition())) {
               var2.addItem(var6.getPosition(), ((ColorFormat)var6.getColor()).l6(var1));
            }

            if (var6.getPosition() >= var3) {
               var3 = var6.getPosition();
               var4 = (ColorFormat)var6.getColor();
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      if ((Float)var2.getKeys().get_Item(var2.size() - 1) < 1.0F) {
         var2.addItem(1.0F, var4.l6(var1));
      }

      if (var2.size() == 1) {
         var2.addItem(0.0F, var2.getValues().get_Item(0));
      }

      if (this.u9.size() == 2 && var2.size() == 2 && (Float)var2.getKeys().get_Item(0) == 0.0F && (Float)var2.getKeys().get_Item(1) == 1.0F) {
         r0s var21 = (r0s)var2.getValues().get_Item(0);
         r0s var23 = (r0s)var2.getValues().get_Item(1);
         if (!var23.n5(var21)) {
            float var25 = k5(var21.n5);
            float var26 = k5(var21.l6);
            float var27 = k5(var21.k5);
            float var28 = k5(var21.u3);
            float var29 = k5(var23.n5);
            float var30 = k5(var23.l6);
            float var31 = k5(var23.k5);
            float var32 = k5(var23.u3);
            var2.setCapacity(2 + x8.length * 2);

            for (int var33 = 0; var33 < x8.length; var33++) {
               var2.addItem(
                  s7[var33],
                  new r0s(
                     l6(var25 + (var29 - var25) * x8[var33]),
                     l6(var26 + (var30 - var26) * x8[var33]),
                     l6(var27 + (var31 - var27) * x8[var33]),
                     l6(var28 + (var32 - var28) * x8[var33])
                  )
               );
               var2.addItem(
                  1.0F - s7[var33],
                  new r0s(
                     l6(var25 + (var29 - var25) * (1.0F - x8[var33])),
                     l6(var26 + (var30 - var26) * (1.0F - x8[var33])),
                     l6(var27 + (var31 - var27) * (1.0F - x8[var33])),
                     l6(var28 + (var32 - var28) * (1.0F - x8[var33]))
                  )
               );
            }
         }
      } else if (this.u9.size() == 3
         && var2.size() == 3
         && ((r0s)var2.getValues().get_Item(0)).n5((r0s)var2.getValues().get_Item(2))
         && (Float)var2.getKeys().get_Item(0) == 0.0F
         && (Float)var2.getKeys().get_Item(2) == 1.0F) {
         r0s var20 = (r0s)var2.getValues().get_Item(0);
         r0s var7 = (r0s)var2.getValues().get_Item(1);
         if (!var7.n5(var20)) {
            float var8 = k5(var20.n5);
            float var9 = k5(var20.l6);
            float var10 = k5(var20.k5);
            float var11 = k5(var20.u3);
            float var12 = k5(var7.n5);
            float var13 = k5(var7.l6);
            float var14 = k5(var7.k5);
            float var15 = k5(var7.u3);
            var2.setCapacity(2 + x8.length * 2);
            float var16 = (Float)var2.getKeys().get_Item(1);

            for (int var17 = 0; var17 < x8.length; var17++) {
               var2.addItem(
                  var16 * s7[var17],
                  new r0s(
                     l6(var8 + (var12 - var8) * x8[var17]),
                     l6(var9 + (var13 - var9) * x8[var17]),
                     l6(var10 + (var14 - var10) * x8[var17]),
                     l6(var11 + (var15 - var11) * x8[var17])
                  )
               );
               var2.addItem(
                  var16 * (1.0F - s7[var17]),
                  new r0s(
                     l6(var8 + (var12 - var8) * (1.0F - x8[var17])),
                     l6(var9 + (var13 - var9) * (1.0F - x8[var17])),
                     l6(var10 + (var14 - var10) * (1.0F - x8[var17])),
                     l6(var11 + (var15 - var11) * (1.0F - x8[var17]))
                  )
               );
               var2.addItem(
                  1.0F - (1.0F - var16) * s7[var17],
                  new r0s(
                     l6(var8 + (var12 - var8) * x8[var17]),
                     l6(var9 + (var13 - var9) * x8[var17]),
                     l6(var10 + (var14 - var10) * x8[var17]),
                     l6(var11 + (var15 - var11) * x8[var17])
                  )
               );
               var2.addItem(
                  var16 + (1.0F - var16) * s7[var17],
                  new r0s(
                     l6(var8 + (var12 - var8) * (1.0F - x8[var17])),
                     l6(var9 + (var13 - var9) * (1.0F - x8[var17])),
                     l6(var10 + (var14 - var10) * (1.0F - x8[var17])),
                     l6(var11 + (var15 - var11) * (1.0F - x8[var17]))
                  )
               );
            }
         }
      }

      SortedList var22 = new SortedList();

      for (int var24 = 0; var24 < var2.size(); var24++) {
         var22.addItem(var2.getKeys().get_Item(var24), ((r0s)var2.getValues().get_Item(var24)).n5().o8());
      }

      return var22;
   }

   final long h0() {
      return ((this.t2 & 4294967295L) + (this.u9.getVersion() & 4294967295L) & 4294967295L) + (this.h0.u9() & 4294967295L) & 4294967295L;
   }

   private void c8() {
      this.t2++;
   }

   private void t2() {
      d2k var1 = this.c8.n5.u3();
      if (this.c8.l6.n5 != 0.0F || this.c8.l6.l6 != 0.0F) {
         this.a6 = -1;
      } else if (var1.n5 == 0.0F) {
         if (var1.l6 == 0.0F) {
            this.a6 = 0;
         } else if (var1.l6 == 1.0F) {
            this.a6 = 2;
         } else {
            this.a6 = -1;
         }
      } else if (var1.n5 == 1.0F) {
         if (var1.l6 == 0.0F) {
            this.a6 = 1;
         } else if (var1.l6 == 1.0F) {
            this.a6 = 3;
         } else {
            this.a6 = -1;
         }
      } else if (var1.n5 == 0.5F && var1.l6 == 0.5F) {
         this.a6 = 4;
      } else {
         this.a6 = -1;
      }

      this.c8();
   }

   private static float l6(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 0.45454544F);
   }

   private static float k5(float var0) {
      return (float)com.aspose.slides.ms.System.q1.a6(var0, 2.2F);
   }

   @Override
   public boolean equals(Object obj) {
      IGradientFormat var2 = com.aspose.slides.internal.v6g.k5.n5(obj, IGradientFormat.class);
      if (var2 == null) {
         return super.equals(obj);
      }

      if (this.k5() != var2.getGradientDirection()) {
         return false;
      }

      if (this.u3 != var2.getGradientShape()) {
         return false;
      }

      switch (this.u3) {
         case -1:
         default:
            return true;
         case 0:
            if (this.l6 == var2.getLinearGradientAngle() && this.k5 == var2.getLinearGradientScaled()) {
               if (this.n5 == var2.getTileFlip() && this.u9.size() == var2.getGradientStops().size()) {
                  for (int var3 = 0; var3 < this.u9.size(); var3++) {
                     if (!this.u9.get_Item(var3).equals(var2.getGradientStops().get_Item(var3))) {
                        return false;
                     }
                  }

                  return true;
               }

               return false;
            }

            return false;
         case 1:
         case 2:
            return this.k5() == var2.getGradientDirection();
      }
   }

   @Override
   public int hashCode() {
      return 23456;
   }
}
