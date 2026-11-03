package com.aspose.slides;

class j8o extends r0<ColumnFormat, j8o> implements IColumnFormatEffectiveData {
   private static final j8o n3 = t9();

   j8o(ColumnFormat var1) {
      super(var1);
   }

   private static j8o t9() {
      j8o var0 = new j8o((ColumnFormat)null);
      r0.n5(var0);
      return var0;
   }

   static j8o n5(ColumnFormat var0) {
      return n3;
   }

   void n5(i7b var1, ColumnFormat var2) {
      this.n5(var1);
      u3l var3 = this.W_().l6().y4().l6();
      this.u9().n5((i7b)var3.u9());
      this.c8().n5((i7b)var3.c8());
      this.s7().n5((i7b)var3.s7());
      if (this.W_().n5().h0() == 0) {
         this.h0().n5((i7b)var3.h0());
      } else {
         this.h0().n5((i7b)var3.e2());
      }

      if (this.W_().n5().h0() == this.W_().l6().getColumns().size() - 1) {
         this.t2().n5((i7b)var3.t2());
      } else {
         this.t2().n5((i7b)var3.e2());
      }

      this.y4().n5((i7b)var3.y4());
      this.e2().n5((i7b)var3.e2());
      int var4 = var2.n5().h0();
      z2x var5 = var2.l6().u9();
      if (var5 != null) {
         if (var2.l6().getVerticalBanding()) {
            int var6 = var2.l6().getFirstCol() ? 1 : 0;
            x6q var7 = (var4 + var6) % 2 == 0 ? var5.u9() : var5.h0();
            if ((var4 != 0 || !var2.l6().getFirstCol()) && (var4 != var2.l6().getColumns().size() - 1 || !var2.l6().getLastCol())) {
               this.n5(var7);
            }

            this.l6(var7);
         }

         if (var2.l6().getFirstRow()) {
            this.n5(this.c8(), var5.t2().k5());
         }

         if (var2.l6().getLastRow()) {
            this.n5(this.s7(), var5.c8().u3());
         }

         if (var4 == var2.l6().getColumns().size() - 1 && var2.l6().getLastCol()) {
            this.n5(var5.c8());
            this.l6(var5.c8());
         }

         if (var4 == 0 && var2.l6().getFirstCol()) {
            this.n5(var5.t2());
            this.l6(var5.t2());
         }
      }
   }

   static boolean l6(ColumnFormat var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = var0.n5().h0();
      z2x var4 = var0.l6().u9();
      if (var4 == null) {
         return false;
      }

      if (var0.l6().getVerticalBanding()) {
         int var5 = var0.l6().getFirstCol() ? 1 : 0;
         x6q var6 = (var3 + var5) % 2 == 0 ? var4.u9() : var4.h0();
         if ((var3 != 0 || !var0.l6().getFirstCol()) && (var3 != var0.l6().getColumns().size() - 1 || !var0.l6().getLastCol())) {
            var1 |= n5(var0, var6);
         }

         var2 |= l6(var0, var6);
      }

      if (var0.l6().getFirstRow()) {
         var2 |= n5(var0, var4.t2().k5());
      }

      if (var0.l6().getLastRow()) {
         var2 |= n5(var0, var4.c8().u3());
      }

      if (var3 == var0.l6().getColumns().size() - 1 && var0.l6().getLastCol()) {
         var1 |= n5(var0, var4.c8());
         var2 |= l6(var0, var4.c8());
      }

      if (var3 == 0 && var0.l6().getFirstCol()) {
         var1 |= n5(var0, var4.t2());
         var2 |= l6(var0, var4.t2());
      }

      return var1 || var2;
   }
}
