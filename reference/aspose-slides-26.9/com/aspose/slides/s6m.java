package com.aspose.slides;

final class s6m {
   private final FillFormat n5;
   private final LineFormat l6;
   private final EffectFormat k5;
   private final ThreeDFormat u3;
   private final z4p a6;
   private long u9;

   s6m(FillFormat var1, LineFormat var2, EffectFormat var3, ThreeDFormat var4, z4p var5) {
      this.a6 = var5;
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   final void n5(Format var1) {
      this.n5.n5(var1.getFill());
      this.l6.n5(var1.getLine());
      this.k5.n5(var1.getEffect());
      this.u3.n5(var1.getEffect3D());
      if (var1.u3().n5() != null) {
         this.a6.n5(var1.u3().n5().u3());
      }

      this.l6();
   }

   final long n5() {
      return (
               (((this.u9 & 4294967295L) + (this.n5.getVersion() & 4294967295L) & 4294967295L) + (this.l6.getVersion() & 4294967295L) & 4294967295L)
                     + (this.k5.getVersion() & 4294967295L)
                  & 4294967295L
            )
            + (this.u3.getVersion() & 4294967295L)
         & 4294967295L;
   }

   private void l6() {
      this.u9++;
   }

   @Override
   public boolean equals(Object obj) {
      Format var2 = com.aspose.slides.internal.v6g.k5.n5(obj, Format.class);
      return var2 == null
         ? super.equals(obj)
         : this.n5.equals(var2.getFill()) && this.l6.equals(var2.getLine()) && this.k5.equals(var2.getEffect()) && this.u3.equals(var2.getEffect3D());
   }

   @Override
   public int hashCode() {
      int var1 = 17;
      var1 = var1 * 31 + (this.n5 != null ? this.n5.hashCode() : 0);
      var1 = var1 * 31 + (this.l6 != null ? this.l6.hashCode() : 0);
      var1 = var1 * 31 + (this.k5 != null ? this.k5.hashCode() : 0);
      return var1 * 31 + (this.u3 != null ? this.u3.hashCode() : 0);
   }
}
