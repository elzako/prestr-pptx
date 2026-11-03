package com.aspose.slides;

final class b5b implements ITab {
   private double n5;
   private int l6;
   private TabCollection k5;
   private long u3;

   b5b(double var1, int var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   @Override
   public final double getPosition() {
      return this.n5;
   }

   @Override
   public final void setPosition(double value) {
      this.n5 = value;
   }

   @Override
   public final int getAlignment() {
      return this.l6;
   }

   @Override
   public final void setAlignment(int value) {
      this.l6 = value;
      this.l6();
   }

   @Override
   public final int compareTo(Object obj) {
      return com.aspose.slides.ms.System.d2.n5(this.getPosition(), ((Tab)obj).getPosition());
   }

   final void n5(TabCollection var1) {
      this.k5 = var1;
      this.l6();
   }

   public final long n5() {
      return this.u3;
   }

   private void l6() {
      this.u3++;
      if (this.k5 != null) {
         this.k5.n5();
      }
   }
}
