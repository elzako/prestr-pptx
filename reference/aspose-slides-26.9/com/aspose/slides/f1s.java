package com.aspose.slides;

class f1s extends r0<CellFormat, f1s> implements ICellFormatEffectiveData {
   private static final f1s n3 = t9();

   f1s(CellFormat var1) {
      super(var1);
   }

   @Override
   public final float getTransparency() {
      return !com.aspose.slides.ms.System.n1.k5(this.W_().getTransparency()) ? this.W_().getTransparency() : 0.0F;
   }

   private static f1s t9() {
      f1s var0 = new f1s((CellFormat)null);
      r0.n5(var0);
      return var0;
   }

   static f1s n5(CellFormat var0) {
      IPresentationComponent var1 = var0.getParent_IPresentationComponent();
      return n3;
   }

   static boolean l6(CellFormat var0) {
      boolean var1 = false;
      Cell var2 = com.aspose.slides.internal.v6g.k5.n5(var0.getParent_Immediate(), Cell.class);
      if (var2 != null) {
         d7f var3 = var2.n3();
         var1 |= n5(var0, var3.n5());
         var1 |= n5(var0, var3.k5());
         var1 |= n5(var0, var3.u3());
         var1 |= n5(var0, var3.a6());
         var1 |= n5(var0, var3.u9());
         var1 |= n5(var0, var3.h0());
         var1 |= n5(var0, var3.c8());
      }

      return var1;
   }

   void n5(i7b var1, CellFormat var2) {
      this.n5(var1);
      Cell var3 = com.aspose.slides.internal.v6g.k5.n5(this.W_().getParent_Immediate(), Cell.class);
      if (var3 != null) {
         d7f var4 = var3.n3();
         n5(this.W_(), this.u9(), var4.n5());
         this.n5(this.h0(), var4.k5());
         this.n5(this.c8(), var4.u3());
         this.n5(this.t2(), var4.a6());
         this.n5(this.s7(), var4.u9());
         this.n5(this.x8(), var4.h0());
         this.n5(this.n3(), var4.c8());
      }

      this.u9().k5(com.aspose.slides.internal.v6g.k5.n5(var2.getFillFormat(), FillFormat.class));
      this.h0().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderLeft(), LineFormat.class));
      this.c8().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderTop(), LineFormat.class));
      this.t2().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderRight(), LineFormat.class));
      this.s7().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderBottom(), LineFormat.class));
      this.x8().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderDiagonalDown(), LineFormat.class));
      this.n3().l6(com.aspose.slides.internal.v6g.k5.n5(var2.getBorderDiagonalUp(), LineFormat.class));
   }

   static f1s n5(CellFormat var0, f1s var1) {
      f1s var2 = new f1s(var0);
      if (var1 != null) {
         var2.n5((com.aspose.slides.i7b)(var1));
      }

      return var2;
   }
}
