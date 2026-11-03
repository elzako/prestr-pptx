package com.aspose.slides;

import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NotSupportedException;

class a1v implements IGenericCloneable<a1v>, Cloneable {
   private boolean a6;
   private com.aspose.slides.internal.o9b.c8 u9 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 h0 = new com.aspose.slides.internal.o9b.c8();
   private boolean c8 = false;
   private boolean t2 = false;
   protected byte n5 = -1;
   protected com.aspose.slides.internal.s5.c8 l6;
   protected IImageTransformOCollectionEffectiveData k5;
   protected j5m u3;
   private int s7;

   public a1v(com.aspose.slides.internal.o9b.c8 var1) {
      this("_default");
      this.c8 = true;
      var1.n5(this.u9);
      this.n5 = 1;
   }

   private a1v(com.aspose.slides.internal.o9b.c8 var1, j5m var2) {
      this(var2);
      this.c8 = true;
      var1.n5(this.u9);
      this.n5 = 1;
   }

   public a1v() {
      this(com.aspose.slides.internal.o9b.c8.u3.o8());
      this.n5 = 0;
   }

   public a1v(j5m var1) {
      this("_default");
      this.u3 = var1;
   }

   public static a1v n5(j5m var0, IFillParamSource var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, FillFormat.class)) {
         return n5(var0, (FillFormat)var1);
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1, m0a.class)) {
         m0a var2 = (m0a)var1;
         return n5(var0, var2.n5);
      } else if (var1 == null) {
         return new a1v(var0);
      } else {
         throw new NotSupportedException();
      }
   }

   public static a1v n5(j5m var0, f6a var1) {
      if (var1 == null) {
         return new a1v(var0);
      }

      switch (var1.getFillType()) {
         case 0:
            return n5(var0);
         case 1:
            return new a1v(var1.h0().o8(), var0);
         case 2:
            j0p var2 = (j0p)var1.getGradientFormat();
            if (var2 == null) {
               return new a1v(var0);
            }

            return new u4z(var0, var2, !var1.getRotateWithShape());
         case 3:
            IPatternFormatEffectiveData var4 = var1.getPatternFormat();
            return new m2a(var0, ((g3a)var4).l6().o8(), ((g3a)var4).k5().o8(), var4.getPatternStyle(), !var1.getRotateWithShape());
         case 4:
            f3f var3 = (f3f)var1.getPictureFillFormat();
            if (var3 == null) {
               return new a1v(var0);
            }

            return new q3d(var0, var3, !var1.getRotateWithShape());
         default:
            return new a1v(var0);
      }
   }

   private static m2a n5(j5m var0, IPatternFormat var1, boolean var2) {
      return new m2a(
         var0, ((ColorFormat)var1.getForeColor()).l6(var0.a6).n5().o8(), ((ColorFormat)var1.getBackColor()).l6(var0.a6).n5().o8(), var1.getPatternStyle(), var2
      );
   }

   public static a1v n5(j5m var0, LineFillFormat var1) {
      if (var1 == null) {
         return new a1v(var0);
      }

      switch (var1.getFillType()) {
         case -1:
            return new a1v(var0);
         case 0:
            return n5(var0);
         case 1:
            com.aspose.slides.internal.o9b.c8 var2 = ((ColorFormat)var1.getSolidFillColor()).l6(var0.a6).n5().o8();
            return new a1v(var2.o8(), var0);
         case 2:
            IGradientFormat var3 = var1.getGradientFormat();
            if (var3.getGradientStops().size() < 2) {
               return new a1v(((ColorFormat)var1.getSolidFillColor()).u3().o8(), var0);
            }

            return new u4z(var0, var3);
         case 3:
            return n5(var0, var1.getPatternFormat(), false);
         default:
            return new a1v(var0);
      }
   }

   public static a1v n5(j5m var0, FillFormat var1) {
      if (var1 == null) {
         return new a1v(var0);
      }

      switch (var1.getFillType()) {
         case -1:
            return new a1v(var0);
         case 0:
            return n5(var0);
         case 1:
            com.aspose.slides.internal.o9b.c8 var2 = ((ColorFormat)var1.getSolidFillColor()).l6(var0.a6).n5().o8();
            return new a1v(var2.o8(), var0);
         case 2:
            GradientFormat var4 = (GradientFormat)var1.getGradientFormat();
            if (var4 == null) {
               return new a1v(var0);
            }

            return new u4z(var0, var4, var1.getRotateWithShape() == 0);
         case 3:
            return n5(var0, var1.getPatternFormat(), var1.getRotateWithShape() == 0);
         case 4:
            PictureFillFormat var3 = (PictureFillFormat)var1.getPictureFillFormat();
            return new q3d(var0, var3, var1.getRotateWithShape() == 0);
         default:
            return new a1v(var0);
      }
   }

   public static a1v l6(j5m var0, FillFormat var1) {
      if (var1 == null) {
         return new a1v(var0);
      }

      switch (var1.getFillType()) {
         case -1:
            return new a1v(com.aspose.slides.internal.o9b.c8.w4().o8(), var0);
         default:
            return n5(var0, var1);
      }
   }

   private a1v(String var1) {
   }

   public static a1v n5(j5m var0, IFillFormatEffectiveData var1, byte var2, EffectFormat var3) {
      if (var2 == 0) {
         throw new ArgumentException();
      }

      switch (var1.getFillType()) {
         case -1:
            return new a1v(var0);
         case 0:
            return n5(var0);
         case 1:
            com.aspose.slides.internal.o9b.c8 var8 = ((f6a)var1).h0().o8();
            if (n5(var2)) {
               n5(var8.o8(), var2).n5(var8);
            }

            return new a1v(var8.o8(), var0);
         case 2:
            j0p var9 = (j0p)var1.getGradientFormat();
            return new u4z(var0, var9, var2, !var1.getRotateWithShape());
         case 3:
            IPatternFormatEffectiveData var7 = var1.getPatternFormat();
            com.aspose.slides.internal.o9b.c8 var5 = ((g3a)var7).l6().o8();
            com.aspose.slides.internal.o9b.c8 var6 = ((g3a)var7).k5().o8();
            if (n5(var2)) {
               n5(var5.o8(), var2).n5(var5);
               n5(var6.o8(), var2).n5(var6);
            }

            return new m2a(var0, var5.o8(), var6.o8(), var7.getPatternStyle(), !var1.getRotateWithShape());
         case 4:
            f3f var4 = (f3f)var1.getPictureFillFormat();
            return new q3d(var0, var4, var2, var3, !var1.getRotateWithShape());
         default:
            return new a1v(var0);
      }
   }

   private static a1v n5(j5m var0) {
      a1v var1 = new a1v(var0);
      var1.n5 = 0;
      return var1;
   }

   public static a1v n5(j5m var0, z1a var1) {
      switch (var1.getFillType()) {
         case -1:
            return new a1v(var0);
         case 0:
            return n5(var0);
         case 1:
            return new a1v(var1.u3().o8(), var0);
         case 2:
            j0p var3 = (j0p)var1.getGradientFormat();
            if (var3.getGradientStops().size() == 1) {
               return new a1v(((GradientStopEffectiveData)var3.getGradientStops().get_Item(0)).n5().o8(), var0);
            }

            return new u4z(var0, var3, 0);
         case 3:
            IPatternFormatEffectiveData var2 = var1.getPatternFormat();
            return new m2a(var0, ((g3a)var2).l6().o8(), ((g3a)var2).k5().o8(), var2.getPatternStyle(), false);
         default:
            return new a1v(var0);
      }
   }

   public static a1v l6(j5m var0, f6a var1) {
      switch (var1.getFillType()) {
         case -1:
            return new a1v(var0);
         case 0:
            return n5(var0);
         case 1:
            return new a1v(var1.h0().o8(), var0);
         case 2:
            j0p var3 = (j0p)var1.getGradientFormat();
            if (var3.getGradientStops().size() == 1) {
               return new a1v(((GradientStopEffectiveData)var3.getGradientStops().get_Item(0)).n5().o8(), var0);
            }

            return new u4z(var0, var3);
         case 3:
            IPatternFormatEffectiveData var2 = var1.getPatternFormat();
            return new m2a(var0, ((g3a)var2).l6().o8(), ((g3a)var2).k5().o8(), var2.getPatternStyle(), false);
         case 4:
            f3f var4 = (f3f)var1.getPictureFillFormat();
            return new q3d(var0, var4);
         default:
            return new a1v(var0);
      }
   }

   public final short n5(float var1) {
      short var2 = com.aspose.slides.internal.v6g.k5.l6(var1 + 90.0F, 13);
      if (var2 < 0) {
         var2 = (short)(var2 + 360);
      }

      return var2;
   }

   public static com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var0) {
      int var1 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var0.a6()), 14);
      int var2 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var0.t2()), 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var0.h0()), 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var0.l6()), 14);
      return new com.aspose.slides.internal.o9b.y1(var1, var2, (float)var3 - var1, (float)var4 - var2);
   }

   public final a1v n5(IShapeFrame var1) {
      return this.s7();
   }

   public final com.aspose.slides.internal.o9b.c8 n5() {
      return this.c8 ? this.u9 : com.aspose.slides.internal.o9b.c8.w4().o8();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.c8 = true;
      var1.n5(this.u9);
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.t2 ? this.h0 : com.aspose.slides.internal.o9b.c8.w4().o8();
   }

   public final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.t2 = true;
      var1.n5(this.h0);
   }

   public final IImageTransformOCollectionEffectiveData k5() {
      return this.k5;
   }

   public final byte u3() {
      return this.n5 != -1 ? this.n5 : 0;
   }

   public final boolean a6() {
      return this.n5 != 0 && this.n5 != -1;
   }

   final com.aspose.slides.internal.s5.c8 u9() {
      return this.l6;
   }

   static boolean n5(byte var0) {
      return var0 == 4 || var0 == 5 || var0 == 2 || var0 == 3;
   }

   static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, byte var1) {
      switch (var1) {
         case 2:
            return com.aspose.slides.internal.o9b.c8.n5(
               var0.s7() & 255, 255 - (255 - (var0.x8() & 255)) * 6 / 10, 255 - (255 - (var0.n3() & 255)) * 6 / 10, 255 - (255 - (var0.y4() & 255)) * 6 / 10
            );
         case 3:
            return com.aspose.slides.internal.o9b.c8.n5(
               var0.s7() & 255, 255 - (255 - (var0.x8() & 255)) * 8 / 10, 255 - (255 - (var0.n3() & 255)) * 8 / 10, 255 - (255 - (var0.y4() & 255)) * 8 / 10
            );
         case 4:
            return com.aspose.slides.internal.o9b.c8.n5(var0.s7() & 255, (var0.x8() & 255) * 6 / 10, (var0.n3() & 255) * 6 / 10, (var0.y4() & 255) * 6 / 10);
         case 5:
            return com.aspose.slides.internal.o9b.c8.n5(var0.s7() & 255, (var0.x8() & 255) * 8 / 10, (var0.n3() & 255) * 8 / 10, (var0.y4() & 255) * 8 / 10);
         default:
            return var0;
      }
   }

   static com.aspose.slides.internal.x4g.a6 n5(SortedList<Float, com.aspose.slides.internal.o9b.c8> var0) {
      if (var0 == null) {
         return null;
      }

      int var1 = var0.size();
      int var2 = var1;
      byte var3 = 0;
      if ((Float)var0.getKeys().get_Item(0) > 0.0F) {
         var3 = 1;
         var2++;
      }

      if ((Float)var0.getKeys().get_Item(var1 - 1) < 1.0F) {
         var2++;
      }

      com.aspose.slides.internal.x4g.a6 var4 = new com.aspose.slides.internal.x4g.a6(var2);
      if (var3 > 0) {
         var4.l6()[0] = 0.0F;
         ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(0)).n5(var4.n5()[0]);
      }

      for (int var5 = 0; var5 < var1; var5++) {
         var4.l6()[var3 + var5] = (Float)var0.getKeys().get_Item(var5);
         ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(var5)).n5(var4.n5()[var3 + var5]);
      }

      if (var3 + var1 < var2) {
         var4.l6()[var3 + var1] = 1.0F;
         ((com.aspose.slides.internal.o9b.c8)var0.getValues().get_Item(var1 - 1)).n5(var4.n5()[var3 + var1]);
      }

      return var4;
   }

   public final j5m h0() {
      return this.u3;
   }

   public final boolean c8() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final int t2() {
      return this.s7;
   }

   final void n5(int var1) {
      this.s7 = var1;
   }

   public final a1v s7() {
      return (a1v)this.n3();
   }

   public final a1v x8() {
      a1v var1 = (a1v)this.n3();
      var1.n5 = 1;
      return var1;
   }

   protected Object n3() {
      try {
         a1v var1 = (a1v)super.clone();
         if (this.u9 != null) {
            var1.u9 = this.u9.o8();
         }

         if (this.h0 != null) {
            var1.h0 = this.h0.o8();
         }

         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public a1v cloneT() {
      return this.s7();
   }

}
