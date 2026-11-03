package com.aspose.slides;

final class k8b extends g8<Tab, k8b> implements ITabEffectiveData {
   private double n5 = Double.NaN;
   private int l6 = 0;

   k8b() {
   }

   k8b(Tab var1) {
      this();
      this.n5 = var1.getPosition();
      this.l6 = var1.getAlignment();
   }

   @Override
   public final double getPosition() {
      return this.n5;
   }

   @Override
   public final int getAlignment() {
      return this.l6;
   }

   @Override
   public final int compareTo(Object obj) {
      return com.aspose.slides.ms.System.d2.n5(this.getPosition(), ((Tab)obj).getPosition());
   }

   final void n5(i7b var1) {
      k8b var2 = (k8b)var1;
      this.n5 = var2.n5;
      this.l6 = var2.l6;
   }

   void n5(i7b var1, Tab var2) {
      this.n5(var1);
      this.n5 = var2.getPosition();
      this.l6 = var2.getAlignment();
   }

   boolean n5(k8b var1) {
      return var1 == null ? false : com.aspose.slides.internal.n8e.v4.n5(this.n5, var1.n5) && this.l6 == var1.l6;
   }

   @Override
   boolean n5(g8 recoveredArg) {
      return this.n5((com.aspose.slides.k8b)recoveredArg);
   }
}
