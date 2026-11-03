package com.aspose.slides;

class j5h extends r0<RowFormat, j5h> implements IRowFormatEffectiveData {
   private static final j5h n3 = t9();

   j5h(RowFormat var1) {
      super(var1);
   }

   private static j5h t9() {
      j5h var0 = new j5h((RowFormat)null);
      r0.n5(var0);
      return var0;
   }

   static j5h n5(RowFormat var0) {
      return n3;
   }

   void n5(i7b var1, RowFormat var2) {
      this.n5(var1);
      u3l var3 = this.W_().l6().y4().l6();
      this.u9().n5((i7b)var3.u9());
      this.h0().n5((i7b)var3.h0());
      this.t2().n5((i7b)var3.t2());
      if (this.W_().n5().h0() == 0) {
         this.c8().n5((i7b)var3.c8());
      } else {
         this.c8().n5((i7b)var3.y4());
      }

      if (this.W_().n5().h0() == this.W_().l6().getRows().size() - 1) {
         this.s7().n5((i7b)var3.s7());
      } else {
         this.s7().n5((i7b)var3.y4());
      }

      this.y4().n5((i7b)var3.y4());
      this.e2().n5((i7b)var3.e2());
      int var4 = var2.n5().h0();
      z2x var5 = var2.l6().u9();
      if (var5 != null) {
         if (var2.l6().getHorizontalBanding()) {
            int var6 = var2.l6().getFirstRow() ? 1 : 0;
            x6q var7 = (var4 + var6) % 2 == 0 ? var5.u3() : var5.a6();
            if ((var4 != 0 || !var2.l6().getFirstRow()) && (var4 != var2.l6().getRows().size() - 1 || !var2.l6().getLastRow())) {
               this.n5(var7);
            }

            this.l6(var7);
         }

         if (var2.l6().getFirstCol()) {
            this.n5(this.h0(), var5.t2().n5());
         }

         if (var2.l6().getLastCol()) {
            this.n5(this.t2(), var5.c8().l6());
         }

         if (var4 == var2.l6().getRows().size() - 1 && var2.l6().getLastRow()) {
            this.n5(var5.s7());
            this.l6(var5.s7());
         }

         if (var4 == 0 && var2.l6().getFirstRow()) {
            this.n5(var5.y4());
            this.l6(var5.y4());
         }
      }
   }

   static boolean l6(RowFormat var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = var0.n5().h0();
      z2x var4 = var0.l6().u9();
      if (var4 == null) {
         return false;
      }

      if (var0.l6().getHorizontalBanding()) {
         int var5 = var0.l6().getFirstRow() ? 1 : 0;
         x6q var6 = (var3 + var5) % 2 == 0 ? var4.u3() : var4.a6();
         if ((var3 != 0 || !var0.l6().getFirstRow()) && (var3 != var0.l6().getRows().size() - 1 || !var0.l6().getLastRow())) {
            var1 |= n5(var0, var6);
         }

         var2 |= l6(var0, var6);
      }

      if (var0.l6().getFirstCol()) {
         var2 |= n5(var0, var4.t2().n5());
      }

      if (var0.l6().getLastCol()) {
         var2 |= n5(var0, var4.c8().l6());
      }

      if (var3 == var0.l6().getRows().size() - 1 && var0.l6().getLastRow()) {
         var1 |= n5(var0, var4.s7());
         var2 |= l6(var0, var4.s7());
      }

      if (var3 == 0 && var0.l6().getFirstRow()) {
         var1 |= n5(var0, var4.y4());
         var2 |= l6(var0, var4.y4());
      }

      return var1 || var2;
   }
}
