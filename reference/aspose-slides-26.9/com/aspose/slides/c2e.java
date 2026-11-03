package com.aspose.slides;

class c2e implements a1h {
   private String n5;
   private final a1h l6;
   private final a1h k5;

   @Override
   public final String n5() {
      return this.n5;
   }

   public final a1h l6() {
      return this.l6;
   }

   public final a1h k5() {
      return this.k5;
   }

   @Override
   public final boolean u3() {
      return this.l6().u3() && this.k5().u3();
   }

   public c2e(a1h var1, a1h var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public c2e(a1h var1, a1h var2, String var3) {
      this(var1, var2);
      this.n5 = var3;
   }

   @Override
   public final a1h n5(y9w var1) {
      String var2 = this.n5();
      if (var2 == null) {
         var2 = var1.n5();
      }

      return new c2e(this.l6().n5(var1), this.k5().n5(var1), var2);
   }

   @Override
   public final y9w l6(y9w var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), y9w.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), y9w.class)) {
         y9w var2 = (y9w)this.l6();
         y9w var3 = (y9w)this.k5();
         int var4 = var2.l6().l6();
         int var5 = var2.k5().l6();
         int var6 = var3.l6().l6();
         int var7 = var3.k5().l6();
         if (var4 == var6) {
            int var8 = com.aspose.slides.ms.System.q1.l6(var5, var7);
            int var9 = com.aspose.slides.ms.System.q1.n5(var5, var7);
            int var10 = var1.k5().l6();
            if (var10 >= var8 && var10 <= var9) {
               return new y9w(var4, var10, var1.n5());
            }
         } else if (var5 == var7) {
            int var11 = com.aspose.slides.ms.System.q1.l6(var4, var6);
            int var12 = com.aspose.slides.ms.System.q1.n5(var4, var6);
            int var13 = var1.l6().l6();
            if (var13 >= var11 && var13 <= var12) {
               return new y9w(var13, var5, this.n5());
            }
         }
      }

      return null;
   }

   @Override
   public final boolean k5(y9w var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), y9w.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), y9w.class)) {
         return this.n5((y9w)this.l6(), (y9w)this.k5(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), q8x.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), q8x.class)) {
         return this.n5((q8x)this.l6(), (q8x)this.k5(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), e8b.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), e8b.class)) {
         return this.n5((e8b)this.l6(), (e8b)this.k5(), var1);
      }

      String var2 = "The cell range reference is not supported for cell projections.";
      throw new CellInvalidReferenceException("The cell range reference is not supported for cell projections.", this.toString());
   }

   @Override
   public final String a6(y9w var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), y9w.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), y9w.class)) {
         return this.l6((y9w)this.l6(), (y9w)this.k5(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), q8x.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), q8x.class)) {
         return this.l6((q8x)this.l6(), (q8x)this.k5(), var1);
      }

      if (com.aspose.slides.internal.v6g.k5.l6(this.l6(), e8b.class) && com.aspose.slides.internal.v6g.k5.l6(this.k5(), e8b.class)) {
         return this.l6((e8b)this.l6(), (e8b)this.k5(), var1);
      }

      String var2 = "The cell range reference is not supported for A1-style.";
      throw new CellInvalidReferenceException("The cell range reference is not supported for A1-style.", this.toString());
   }

   @Override
   public final c6u n5(w5c var1) {
      return var1.n5(this);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("{0}:{1}",new Object[]{ this.l6(), this.k5()});
   }

   private boolean n5(y9w var1, y9w var2, y9w var3) {
      int var4 = com.aspose.slides.ms.System.q1.l6(var1.l6().l6(), var2.l6().l6());
      int var5 = com.aspose.slides.ms.System.q1.n5(var1.l6().l6(), var2.l6().l6());
      int var6 = com.aspose.slides.ms.System.q1.l6(var1.k5().l6(), var2.k5().l6());
      int var7 = com.aspose.slides.ms.System.q1.n5(var1.k5().l6(), var2.k5().l6());
      int var8 = var3.l6().l6();
      int var9 = var3.k5().l6();
      return var8 >= var4 && var8 <= var5 && var9 >= var6 && var9 <= var7;
   }

   private boolean n5(q8x var1, q8x var2, y9w var3) {
      int var4 = com.aspose.slides.ms.System.q1.l6(var1.l6(), var2.l6());
      int var5 = com.aspose.slides.ms.System.q1.n5(var1.l6(), var2.l6());
      return var3.l6().l6() >= var4 && var3.l6().l6() <= var5;
   }

   private boolean n5(e8b var1, e8b var2, y9w var3) {
      int var4 = com.aspose.slides.ms.System.q1.l6(var1.l6(), var2.l6());
      int var5 = com.aspose.slides.ms.System.q1.n5(var1.l6(), var2.l6());
      return var3.k5().l6() >= var4 && var3.k5().l6() <= var5;
   }

   private String l6(y9w var1, y9w var2, y9w var3) {
      return com.aspose.slides.ms.System.d1.n5(new String[]{var1.a6(var3), ":", var2.a6(var3)});
   }

   private String l6(q8x var1, q8x var2, y9w var3) {
      String var4;
      if (var1.u3()) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.ms.System.a3.l6(var1.l6())});
      } else {
         var4 = com.aspose.slides.ms.System.a3.l6(var1.l6() + var3.l6().l6());
      }

      String var5;
      if (var2.u3()) {
         var5 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.ms.System.a3.l6(var2.l6())});
      } else {
         var5 = com.aspose.slides.ms.System.a3.l6(var2.l6() + var3.l6().l6());
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var4, ":", var5});
   }

   private String l6(e8b var1, e8b var2, y9w var3) {
      String var4;
      if (var1.u3()) {
         var4 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.n5.n5(var1.l6())});
      } else {
         int var5 = var1.l6() + var3.k5().l6();
         var4 = com.aspose.slides.n5.n5(var5);
      }

      String var6;
      if (var2.u3()) {
         var6 = com.aspose.slides.ms.System.d1.n5(new String[]{"$", com.aspose.slides.n5.n5(var2.l6())});
      } else {
         int var7 = var2.l6() + var3.k5().l6();
         var6 = com.aspose.slides.n5.n5(var7);
      }

      return com.aspose.slides.ms.System.d1.n5(new String[]{var4, ":", var6});
   }
}
