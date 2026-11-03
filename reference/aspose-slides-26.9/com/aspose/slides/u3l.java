package com.aspose.slides;

class u3l extends r0<TableFormat, u3l> implements ITableFormatEffectiveData {
   private static final u3l n3 = t9();

   u3l(TableFormat var1) {
      super(var1);
   }

   @Override
   public final float getTransparency() {
      return !com.aspose.slides.ms.System.n1.k5(this.W_().getTransparency()) ? this.W_().getTransparency() : 0.0F;
   }

   private static u3l t9() {
      u3l var0 = new u3l((TableFormat)null);
      r0.n5(var0);
      return var0;
   }

   static u3l n5(TableFormat var0) {
      return n3;
   }

   void n5(i7b var1, TableFormat var2) {
      this.n5(var1);
      this.u9().k5((FillFormat)var2.n5().getTableFormat().getFillFormat());
      z2x var3 = var2.n5().u9();
      if (var3 != null) {
         boolean var4 = this.n5(var3.k5());
         if (!var4) {
            n5(this.W_(), this.u9(), var3.l6().n5());
         }

         this.l6(var3.k5());
      }
   }

   static boolean l6(TableFormat var0) {
      z2x var1 = var0.n5().u9();
      if (var1 != null) {
         boolean var2 = n5(var0, var1.k5());
         if (!var2) {
            var2 = l6(var0, var1.l6().n5());
         }

         boolean var3 = l6(var0, var1.k5());
         return var2 || var3;
      } else {
         return false;
      }
   }
}
