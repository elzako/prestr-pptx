package com.aspose.slides;

class u7j implements w5c {
   private b5v n5;

   public u7j(b5v var1) {
      this.n5 = var1;
   }

   @Override
   public final c6u n5(y9w var1) {
      b5v var2 = this.n5((a1h)var1);
      return new r6x(var2, var1.l6().l6(), var1.k5().l6(), var1.l6().l6(), var1.k5().l6());
   }

   @Override
   public final c6u n5(q8x var1) {
      b5v var2 = this.n5((a1h)var1);
      return new r6x(var2, var1.l6(), 1, var1.l6(), Integer.MAX_VALUE);
   }

   @Override
   public final c6u n5(e8b var1) {
      b5v var2 = this.n5((a1h)var1);
      return new r6x(var2, 1, var1.l6(), Integer.MAX_VALUE, var1.l6());
   }

   @Override
   public final c6u n5(c2e var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1.l6(), y9w.class) && com.aspose.slides.internal.v6g.k5.l6(var1.k5(), y9w.class)) {
         return this.n5((y9w)var1.l6(), (y9w)var1.k5());
      } else if (com.aspose.slides.internal.v6g.k5.l6(var1.l6(), q8x.class) && com.aspose.slides.internal.v6g.k5.l6(var1.k5(), q8x.class)) {
         return this.n5((q8x)var1.l6(), (q8x)var1.k5());
      } else {
         return com.aspose.slides.internal.v6g.k5.l6(var1.l6(), e8b.class) && com.aspose.slides.internal.v6g.k5.l6(var1.k5(), e8b.class)
            ? this.n5((e8b)var1.l6(), (e8b)var1.k5())
            : null;
      }
   }

   private c6u n5(y9w var1, y9w var2) {
      b5v var3 = this.n5((a1h)var1);
      return new r6x(var3, var1.l6().l6(), var1.k5().l6(), var2.l6().l6(), var2.k5().l6());
   }

   private c6u n5(q8x var1, q8x var2) {
      b5v var3 = this.n5((a1h)var1);
      return new r6x(var3, var1.l6(), 1, var2.l6(), Integer.MAX_VALUE);
   }

   private c6u n5(e8b var1, e8b var2) {
      if (var1.n5() != null && !com.aspose.slides.ms.System.d1.a6(var1.n5(), var2.n5())) {
         return null;
      }

      b5v var3 = this.n5((a1h)var1);
      return new r6x(var3, 1, var1.l6(), Integer.MAX_VALUE, var2.l6());
   }

   private b5v n5(a1h var1) {
      b5v var2 = this.n5;
      if (var1.n5() != null && !com.aspose.slides.ms.System.d1.a6(var1.n5(), this.n5.l6())) {
         var2 = this.n5.n5().n5(var1.n5());
      }

      return var2;
   }
}
