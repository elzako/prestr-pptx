package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public final class FillOverlay extends ImageTransformOperation implements IFillOverlay, i4e {
   private FillFormat l6 = new FillFormat(this);
   private int k5;
   private t7d u3;

   FillOverlay(r0g parentImmediate) {
      super(parentImmediate);
      this.l6.setFillType((byte)1);
      this.l6.getSolidFillColor().setSchemeColor(4);
      this.k5 = 1;
      this.l6.n5.l6(new FillOverlay$1(this));
      this.h0();
   }

   @Override
   public final IFillFormat getFillFormat() {
      return this.l6;
   }

   @Override
   public final int getBlend() {
      return this.k5;
   }

   @Override
   public final void setBlend(int value) {
      this.k5 = value;
      this.h0();
   }

   public final IFillOverlayEffectiveData getEffective() {
      return this.l6();
   }

   final t7d l6() {
      if (this.u3 == null) {
         this.u3 = new t7d(this);
      }

      this.u3.n5(t7d.class);
      return this.u3;
   }

   @Override
   c0v n5(c0v var1, IBaseSlide var2) {
      if (this.l6.getFillType() == 1) {
         int var3 = ((ColorFormat)this.l6.getSolidFillColor()).u3().h0();

         for (int var4 = 0; var4 < var1.a6().length; var4 += 4) {
            com.aspose.slides.internal.o9b.c8 var5 = this.n5(
                  var1.a6()[var4 + 3] & 255,
                  var1.a6()[var4 + 2] & 255,
                  var1.a6()[var4 + 1] & 255,
                  var1.a6()[var4] & 255,
                  ((ColorFormat)this.l6.getSolidFillColor()).u3().s7() & 255,
                  ((ColorFormat)this.l6.getSolidFillColor()).u3().x8() & 255,
                  ((ColorFormat)this.l6.getSolidFillColor()).u3().n3() & 255,
                  ((ColorFormat)this.l6.getSolidFillColor()).u3().y4() & 255
               )
               .o8();
            var1.a6()[var4 + 3] = var5.s7();
            var1.a6()[var4 + 2] = var5.x8();
            var1.a6()[var4 + 1] = var5.n3();
            var1.a6()[var4] = var5.y4();
         }
      } else {
         ShapeFrame var24 = new ShapeFrame(0.0F, 0.0F, var1.l6(), var1.k5(), (byte)0, (byte)0, 0.0F);
         j5m var25 = new j5m(var24.cloneT(), new com.aspose.slides.internal.w0.c8(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F), null, var2, null);
         a1v var26 = a1v.n5(var25, this.l6);
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5(), 2498570);

         try {
            com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               com.aspose.slides.internal.o9b.u3 var8 = d4.k5(var26);

               try {
                  var7.l6(var8, new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, var1.l6(), var1.k5()));
               } finally {
                  if (var8 != null) {
                     var8.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }

            c0v var27 = c0v.n5(var6);
            this.n5(var1, var27);
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }

      return var1;
   }

   private com.aspose.slides.internal.o9b.c8 n5(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      short var9 = 255;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;
      switch (this.k5) {
         case 0:
            var10 = var2 > var6 ? var6 : var2;
            var11 = var3 > var7 ? var7 : var3;
            var12 = var4 > var8 ? var8 : var4;
            break;
         case 1:
            var10 = var2 < var6 ? var6 : var2;
            var11 = var3 < var7 ? var7 : var3;
            var12 = var4 < var8 ? var8 : var4;
            break;
         case 2:
            var10 = var2 * var6 >> 8;
            var11 = var3 * var7 >> 8;
            var12 = var4 * var8 >> 8;
            break;
         case 3:
            var10 = this.n5(var2, var6);
            var11 = this.n5(var3, var7);
            var12 = this.n5(var4, var8);
            break;
         case 4:
            var10 = this.l6(var2, var6);
            var11 = this.l6(var3, var7);
            var12 = this.l6(var4, var8);
            break;
         default:
            throw new ArgumentOutOfRangeException("m_blendMode");
      }

      return com.aspose.slides.internal.o9b.c8.n5(var9, var10, var11, var12);
   }

   private int n5(int var1, int var2) {
      int var3 = var1 + (255 - var1) * var2 / 255;
      if (var1 <= 127) {
         var3 = var1 * var2 >> 7;
      } else {
         var3 = 255 - ((255 - var1) * (255 - var2) >> 7);
      }

      return var3;
   }

   private int l6(int var1, int var2) {
      return var1 + (255 - var1) * var2 / 255;
   }

   private void n5(c0v var1, c0v var2) {
      for (int var3 = 0; var3 < var1.a6().length; var3 += 4) {
         com.aspose.slides.internal.o9b.c8 var4 = this.n5(
               var1.a6()[var3 + 3] & 255,
               var1.a6()[var3 + 2] & 255,
               var1.a6()[var3 + 1] & 255,
               var1.a6()[var3] & 255,
               var2.a6()[var3 + 3] & 255,
               var2.a6()[var3 + 2] & 255,
               var2.a6()[var3 + 1] & 255,
               var2.a6()[var3] & 255
            )
            .o8();
         var1.a6()[var3 + 3] = var4.s7();
         var1.a6()[var3 + 2] = var4.x8();
         var1.a6()[var3 + 1] = var4.n3();
         var1.a6()[var3] = var4.y4();
      }
   }

   @Override
   ImageTransformOperation k5() {
      FillOverlay var1 = new FillOverlay(null);
      var1.l6 = new FillFormat(null);
      var1.l6.n5((IFillFormat)this.l6);
      var1.k5 = this.k5;
      return var1;
   }

   @Override
   void n5(r0g var1) {
      super.n5(var1);
      FillFormat var2 = this.l6;
      this.l6 = new FillFormat(this);
      this.l6.n5((IFillFormat)var2);
      this.h0();
   }

   @Override
   public long getVersion() {
      return (super.getVersion() & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L;
   }

   @Override
   public boolean equals(Object obj) {
      FillOverlay var2 = com.aspose.slides.internal.v6g.k5.n5(obj, FillOverlay.class);
      if (var2 == null) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj)
            ? true
            : com.aspose.slides.internal.n8e.v4.n5(this.l6, var2.l6) && com.aspose.slides.internal.n8e.v4.n5((float)(this.k5), (float)(var2.k5));
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
