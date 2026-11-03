package com.aspose.slides;

class c4t {
   private final z1n n5;
   private final ChartTextFormat l6;
   private final ShapeStyle k5;
   private final n4a u3;
   private final n4a a6;
   private final n4a u9;
   private final n4a h0;
   private final Format c8;

   public c4t(z1n var1) {
      this.n5 = var1;
      this.c8 = new Format(var1.u3());
      this.k5 = new ShapeStyle(var1.u3());
      this.u3 = new n4a();
      this.a6 = new n4a();
      this.u9 = new n4a();
      this.h0 = new n4a();
      this.l6 = new ChartTextFormat(var1.u3());
   }

   public final ShapeStyle n5() {
      return this.k5;
   }

   public final Format l6() {
      return this.c8;
   }

   public final ChartTextFormat k5() {
      return this.l6;
   }

   public final n4a u3() {
      return this.u3;
   }

   public final n4a a6() {
      return this.a6;
   }

   public final n4a u9() {
      return this.u9;
   }

   public final n4a h0() {
      return this.h0;
   }

   public final z1n c8() {
      return this.n5;
   }

   protected final void n5(IFormat var1, int var2) {
      Format var3 = com.aspose.slides.internal.v6g.k5.n5(var1, Format.class);
      if (var3 != null) {
         Format var4 = this.c8().u3().z1().n5(var2);
         if (var4 != null) {
            var3.n5(var4);
         }
      }
   }
}
