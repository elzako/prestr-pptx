package com.aspose.slides;

final class q1m extends p9<SoftEdge> implements ISoftEdgeEffectiveData, i7b, t9f {
   q1m(SoftEdge var1) {
      super(var1);
   }

   @Override
   public final double getRadius() {
      return !com.aspose.slides.ms.System.j8.n5(this.n5.getRadius(), Double.NaN) ? this.n5.getRadius() : 0.0;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      }

      q1m var2 = com.aspose.slides.internal.v6g.k5.n5(obj, q1m.class);
      return var2 == null ? false : this.getRadius() == var2.getRadius();
   }

   @Override
   public final c0v n5(c0v var1) {
      return var1;
   }

   @Override
   public final String n5() {
      return com.aspose.slides.ms.System.d1.n5(new Object[]{com.aspose.slides.ms.System.j8.n5(this).s7(), ' ', com.aspose.slides.ms.System.d2.u9(this.getRadius())});
   }
}
