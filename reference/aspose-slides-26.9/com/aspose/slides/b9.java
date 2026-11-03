package com.aspose.slides;

final class b9 {
   FillFormat n5;
   EffectFormat l6;
   private byte k5 = -1;
   private final ColorFormat u3;
   private final r7 a6;
   private final r5 u9;
   private final r0g h0;
   private long c8;

   b9(r0g var1, FillFormat var2, EffectFormat var3, ColorFormat var4, r5 var5, r7 var6) {
      this.h0 = var1;
      this.n5 = var2;
      this.l6 = var3;
      this.u3 = var4;
      this.u9 = var5;
      this.a6 = var6;
   }

   public final byte n5() {
      return this.k5;
   }

   public final void n5(byte var1) {
      this.k5 = var1;
      this.t2();
   }

   public final IFillFormat l6() {
      return this.n5;
   }

   public final IEffectFormat k5() {
      return this.l6;
   }

   public final IColorFormat u3() {
      return this.u3;
   }

   public final int a6() {
      return (int)((this.u9().a6() & 4294967295L) % 1000L & 4294967295L & 65535L);
   }

   public final void n5(int var1) {
      if ((var1 & 65535) == 0) {
         this.u9().n5(0L);
      } else {
         this.u9().n5(1000 + (var1 & 65535) & 4294967295L);
      }

      this.t2();
   }

   final r7 u9() {
      return this.a6;
   }

   final r5 h0() {
      return this.u9;
   }

   final long c8() {
      return (((this.c8 & 4294967295L) + (this.n5.getVersion() & 4294967295L) & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L)
            + (this.u3.getVersion() & 4294967295L)
         & 4294967295L;
   }

   private void t2() {
      this.c8++;
   }

   @Override
   public boolean equals(Object obj) {
      Background var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Background.class);
      if (var2 == null) {
         return false;
      }

      if (!this.h0().n5().equals(var2.a6().n5())
         || this.u9().n5() != var2.u3().n5()
         || (this.u9().a6() & 4294967295L) != (var2.u3().a6() & 4294967295L)
         || this.u9().k5() != var2.u3().k5()) {
         return false;
      }

      if (com.aspose.slides.internal.n8e.v4.n5((float)(this.n5()), (float)(var2.getType())) && com.aspose.slides.internal.n8e.v4.n5((Object)(this.k5()), (Object)(var2.getEffectFormat()))) {
         switch (this.n5()) {
            case 0:
               if (!com.aspose.slides.internal.n8e.v4.n5(this.u3(), var2.getStyleColor())
                  || !com.aspose.slides.internal.n8e.v4.n5((float)(this.a6() & 65535), (float)(var2.getStyleIndex() & 65535))) {
                  return false;
               }
               break;
            case 1:
               if (!com.aspose.slides.internal.n8e.v4.n5(this.l6(), var2.getFillFormat())) {
                  return false;
               }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }
}
